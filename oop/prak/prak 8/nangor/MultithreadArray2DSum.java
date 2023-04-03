import java.util.ArrayList;

public class MultithreadArray2DSum {

    private int nWorkers;
    private ArrayList<Integer[]> array;
    private int sum;

    MultithreadArray2DSum(int nWorkers, ArrayList<Integer[]> array) {
        // Inisialisasi attributes
        this.nWorkers = nWorkers;
        this.array = array;
        this.sum = 0;
    }

    public int calculateSum2() throws InterruptedException {
        // calculateSum2 akan membuat thread dan memetakan array 2 dimensi masukan
        // secara rata ke semua threads yang dapat dibuat
        // setiap thread akan menghitung jumlah dari setiap baris array
        // gunakan fungsi findSum pada kelas MultithreadArraySum untuk menghitung setiap
        // baris array
        // gunakan in-line class untuk membuat thread
        // Please provide your solution in the space below
        Thread[] threads = new Thread[nWorkers];
        int chunkSize = array.size() / nWorkers;
        
        for (int i = 0; i < nWorkers; i++) {
            int start = i * chunkSize;
            int end = (i == nWorkers - 1) ? array.size() : (i + 1) * chunkSize;
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    int localSum = 0;
                    for (int j = start; j < end; j++) {
                        MultithreadArraySum arraySum = new MultithreadArraySum(nWorkers, array.get(j));
                        try {
                            localSum += findSum(arraySum);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    synchronized (this) {
                        sum += localSum;
                    }
                }
            });
            threads[i].start();
        }

        // wait for all threads to finish
        for (int i = 0; i < nWorkers; i++) {
            threads[i].join();
        }

        return sum;
    }

    protected int findSum(MultithreadArraySum arraySum) throws InterruptedException {
        // findSum menerima parameter arraySum berupa kelas MultithreadArraySum yang
        // diinisiasi
        // setiap baris pada array 2 Dimensi untuk menghitung total penjumlahan setiap
        // baris
        return arraySum.calculateSum();
    }

    public static void main(String[] args) {
        // Please provide your solution in the space below
        ArrayList<Integer[]> array = new ArrayList<>();
        array.add(new Integer[] { 1, 2, 3 });
        array.add(new Integer[] { 4, 5 });
        MultithreadArray2DSum array2DSum = new MultithreadArray2DSum(2, array);
        try {
            System.out.println(array2DSum.calculateSum2());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
} 
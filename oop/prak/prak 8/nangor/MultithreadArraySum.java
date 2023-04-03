public class MultithreadArraySum {
    // nWorkers menyatakan jumlah maximum threads yang tersedia
    private int nWorkers;
    // array menyatakan array masukan
    private Integer[] array;
    private int sum = 0;

    MultithreadArraySum(int nWorkers, Integer[] array) {
       // Inisialisasi attributes
       // Please provide your solution in the space below
        this.nWorkers = nWorkers;
        this.array = array;
    }

    public int calculateSum() throws InterruptedException {
        // calculateSum akan membuat thread dan memetakan array masukan secara rata ke semua threads yang dapat dibuat
        // Please provide your solution in the space below
        Thread[] thread = new Thread[nWorkers];
        int chunk = array.length / nWorkers;

        for(int i = 0; i < nWorkers; i++){
            int start = i * chunk;
            int end = (i == nWorkers - 1) ? array.length : (i + 1) * chunk;
            thread[i] = new Thread(){
                public void run(){
                    int localSum = findSum(start, end);
                    synchronized(this){
                        sum += localSum;
                    }
                }
            };
            thread[i].start();
        }

        for (int i = 0; i < nWorkers; i++){
            thread[i].join();
        }

        return sum;
    }

    protected int findSum(int start, int end) {
       // findSum akan melakukan penjumlahan elemen-elemen array pada index `start` sampai `end-1`
       // Please provide your solution in the space below
       int localSum = 0;
       for (int i = start; i < end; i++){
            localSum += array[i];
       }
       return localSum;
    }
}

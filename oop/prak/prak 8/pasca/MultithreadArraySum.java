public class MultithreadArraySum {
    // nWorkers menyatakan jumlah maximum threads yang tersedia
    private int nWorkers;
    // array menyatakan array masukan
    private Integer[] array;

    MultithreadArraySum(int nWorkers, Integer[] array) {
       // Inisialisasi attributes
       // Please provide your solution in the space below
        this.nWorkers = nWorkers;
        this.array = array;
    }

    public int calculateSum() throws InterruptedException {
        // calculateSum akan membuat thread dan memetakan array masukan secara rata ke semua threads yang dapat dibuat
        // Please provide your solution in the space below
        int arrayLength = array.length;
        int chunkSize = arrayLength / nWorkers;
        int remainingElements = arrayLength % nWorkers;

        int start = 0;
        int end = 0;
        int sum = 0;

        Thread[] threads = new Thread[nWorkers];

        for (int i = 0; i < nWorkers; i++) {
            start = end;
            end = start + chunkSize;
            if (i < remainingElements) {
                end++;
            }

            final int startIndex = start;
            final int endIndex = end;

            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    int threadSum = findSum(startIndex, endIndex);
                    sum += threadSum;
                }
            });

            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        return sum;
    }

    protected int findSum(int start, int end) {
       // findSum akan melakukan penjumlahan elemen-elemen array pada index `start` sampai `end-1`
       // Please provide your solution in the space below
       int sum = 0;
       for (int i = start; i < end; i++) {
           sum += array[i];
       }
       return sum;
    }
}
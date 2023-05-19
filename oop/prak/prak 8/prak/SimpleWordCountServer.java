public class SimpleWordCountServer {
    // nWorkers menyatakan jumlah maximum threads yang tersedia pada server a.k.a thread pool
    private int nWorkers;
    private int count;

    SimpleWordCountServer(int nWorkers) {
        // Please provide your solution in the space below
        this.nWorkers = nWorkers;
        this.count = 0;
    }

    public Integer[] processRequests(String[] requests) throws InterruptedException {
        // processRequests akan membuat threads dan memetakan elemen-elemen requests kepada threads tersebut
        // setiap thread kemudian memanggil method countWords
        // main thread (thread yang invoked method ini) akan menunggu semua thread selesai
        // terakhir main thread akan mengembalikan hasil penghitungan kata untuk setiap elemen requests
        // Please provide your solution in the space below
        Integer[] integers = new Integer[requests.length];
        Thread[] threads = new Thread[nWorkers];
        for (int i = 0; i < requests.length; i++){
            int j = i;
            if(requests.length > nWorkers){
                if (j > nWorkers-1){
                    j -= nWorkers;
                }
            }
            String str = requests[i];
            // System.out.println(str);
            threads[j] = new Thread(new Runnable(){
                public void run(){
                    synchronized(this){
                        count = countWords(str);
                        System.out.println(count);
                    }
                } 
            });
            integers[i] = count;
            System.out.println("i " + i);
            System.out.println("count " + integers[i]);
            threads[j].start(); 
        }

        for (int i = 0; i < nWorkers; i++){
            threads[i].join();
        }

        // for (int i = 0; i < requests.length; i++){
        //     System.out.println(integers[i]);
        // }
        return integers;
    }

    protected int countWords(String request) {
        // Please provide your solution in the space below
        int sum = 0;
        for(int i = 0; i < request.length(); i++){
            if(request.charAt(i) == ' '){
                sum++;
            }

            if(i == request.length()-1){
                sum++;
            }
        }
        return sum;
    }
}

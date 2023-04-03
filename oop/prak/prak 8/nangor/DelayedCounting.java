/**
 * @author [NIM] [Nama]
 */
 
public class DelayedCounting {
    public static void printDelayed(int delayMillisec, int maxCount) {
        Thread thread = new Thread(new Runnable(){
            public void run(){
                try {
                    for (int i = 1; i <= maxCount; i++){
                        Thread.sleep(delayMillisec);
                        System.out.println(i);
                    }
                } catch (InterruptedException e){

                }
            }
        });
        thread.start();
    }
}

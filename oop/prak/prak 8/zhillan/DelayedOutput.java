/**
 * DelayedOutput.java 
 * Method menciptakan thread yang mengeluarkan output terminal
 * dan bisa dipanggil lagi sebelum thread sebelumnya menyelesaikan proses
 */
public class DelayedOutput {
    public static void printDelayed(int delayMillisec, String output) {
        Thread thread = new Thread(new Runnable(){
            public void run(){
                try {
                    Thread.sleep(delayMillisec);
                    System.out.println(output);
                }
 
                catch (InterruptedException e){
                    
                }
            }
        });
        thread.start();
    }
  }
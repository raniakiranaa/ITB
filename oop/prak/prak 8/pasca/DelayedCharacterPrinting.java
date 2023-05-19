/**
 * @author [NIM] [Nama]
 */
public class DelayedCharacterPrinting {
    public static void printDelayed(int delayMillisec, String word) {
        Thread thread = new Thread(new Runnable(){
            public void run(){
                try {
                    for (int i = 0; i < word.length(); i++){
                        Thread.sleep(delayMillisec);
                        System.out.println(word.charAt(i));
                    }
                } catch (InterruptedException e){

                }
            }
        });

        thread.start();
    }

    public static void main(String[] args){
        DelayedCharacterPrinting de = new DelayedCharacterPrinting();
        de.printDelayed(200, "halo");
        de.printDelayed(100, "h");
    }
}
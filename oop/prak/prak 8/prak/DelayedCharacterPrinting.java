/**
 * @author 18221168 Rania Sasi Kirana
 */
public class DelayedCharacterPrinting {
    public static void printDelayed(int delayMillisec, String word) {
        Thread thread = new Thread(){
            public void run(){
                try {
                    for (int i = 0; i < word.length(); i++){
                        Thread.sleep(delayMillisec);
                        System.out.println(word.charAt(i));
                    }
                } catch (InterruptedException e){

                }
            }
        };
        thread.start();
    }
}
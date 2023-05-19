/* Untuk mengaktifkan assertion, jalankan driver dengan flag -ea
   Contoh:
   $ javac MultithreadArraySum.java MultithreadArraySumDriver.java
   $ java -ea MultithreadArraySumDriver
 */
public class MultithreadArraySumDriver {
    public static void main(String[] args) throws InterruptedException {
       int nWorkers = 3;
       Integer[] arr = {1, 2, 3, 4, 5};

       MultithreadArraySum arraySum = new MultithreadArraySum(nWorkers, arr);

       Integer[] expectedArraySum = 15;
       Integer[] actualArraySum = arraySum.calculateSum();

       assert expectedArraySum.equals(actualArraySum);

       System.out.println("Congrats! No Errors :)");
    }
}
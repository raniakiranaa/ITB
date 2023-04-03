import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        int balance = input.nextInt();
        int Q = input.nextInt();

        // Inisialisasi
        DebitCard debit = new DebitCard(balance);
        Thread[] thread = new Thread[Q];

        // Pengisian
        for(int i = 0; i < Q; i++){
            String inStr = input.next();
            // withdraw
            if (inStr.equals("W")){
                int inInt = input.nextInt();
                thread[i] = new Thread(){
                    public void run(){
                        debit.withdraw(inInt);
                    }
                };
            } 
            // deposit
            else if (inStr.equals("D")){
                int inInt = input.nextInt();
                thread[i] = new Thread(){
                    public void run(){
                        debit.deposit(inInt);
                    }
                };
            }
        }

        // All transactions are stored in threads
        // Start all transactions
        for (int i = 0; i < Q; i++){
            thread[i].start();
        }
 
        // Unorthodox waiting
        boolean isNotFinished = true;
        while(isNotFinished){
            for(int i = 0; i < Q; i++){
                isNotFinished = thread[i].isAlive();
            }
        }

        // All transactions are finished
        debit.printTransactionsHistory();
        input.close();
    }
}

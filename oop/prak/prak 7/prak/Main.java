import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Hint 1: Untuk mendapatkan input dari user, umumnya bisa dengan memasukkan parameter System.in
        // ke dalam konstruktor Scanner.
        Scanner input = new Scanner(System.in);
        String emailin = input.nextLine();
        Email email = new Email(emailin);
        try {
            boolean cek = email.validateEmail();
            if (cek){
                System.out.println("true");
                System.out.println("Email validated.");
            } 

        } catch (InvalidEmailException e){
            System.out.println("InvalidEmailException! " + e.getMessage());
            System.out.println("Email string error!");
        } catch (InvalidDomainException e){
            System.out.println("InvalidDomainException! " + e.getMessage());
            System.out.println("Email string error!");
        } finally {
            System.out.println("Operation finished.");
        }
        input.close();

    }
    
}

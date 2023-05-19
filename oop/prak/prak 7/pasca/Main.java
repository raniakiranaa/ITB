import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Hint 1: Untuk mendapatkan input dari user, umumnya bisa dengan memasukkan parameter System.in
        // ke dalam konstruktor Scanner.
        Scanner scanner = new Scanner(System.in);
        String email_str = scanner.nextLine();
        Email email = new Email(email_str);
        boolean tes = false;
        try {
            tes = email.validateEmail();
            System.out.println(tes);
        } catch (InvalidEmailException e){
            System.out.println("InvalidEmailException! " + e.getMessage());
        } catch (InvalidDomainException e){
            System.out.println("InvalidDomainException! " + e.getMessage());
        } finally {
            if (tes == true){
                System.out.println("Email validated.");
            } else {
                System.out.println("Email string error!");
            }
            scanner.close();
            System.out.println("Operation finished.");
        }
    }
    
}
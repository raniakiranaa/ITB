import java.util.Scanner;

public class MainCalc {
    public static void main(String[] args){
        // Hint 1: Untuk mendapatkan input dari user, umumnya bisa dengan memasukkan parameter System.in
        // ke dalam konstruktor Scanner.

        // Hint 2: Pengambilan double dari input bisa menggunakan method nextDouble() dari scanner
        // Namun perlu diperhatikan bahwa nextDouble() tidak mengkonsumsi newline karakter dari input  
        // Sehingga apabila ingin menggunakan method nextLine() untuk mengambil String
        // setelah pemanggilan method nextDouble(), harus memanggil nextLine() dahulu 
        // untuk menghabisi sisa baris input dari nextDouble().

        Scanner scanner = new Scanner (System.in);
        try {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            scanner.nextLine();
            String operation = scanner.nextLine();
            Calculator calc = new Calculator();
            System.out.println(calc.calculate(a, b, operation));
        } catch (InvalidOperationException e){
            System.out.println("InvalidOperationException! " + e.getMessage());
        } catch (InvalidDivisionByZero e){
            System.out.println("InvalidDivisionByZero! " + e.getMessage());
        } catch (Exception e){
            System.out.println("Unknown exception!");
        } finally {
            scanner.close();
            System.out.println("Calculated.");
        }
    }
    
}
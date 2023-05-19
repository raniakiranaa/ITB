public class Calculator {
    public Calculator() {

    }

    public double calculate(double a, double b, String operation) throws InvalidOperationException, InvalidDivisionByZero {
        /**
         * Implementasi
         * Apabila operasi yang diinput pengguna bukan `+`, `-`, `*`, atau `/`, maka
         * kalkulator akan mengembalikan pesan error dari kelas
         * `InvalidOperationException.java`
         * 
         * Apabila kalkulator menerima input pembagian terhadap 0, maka kalkulator juag
         * akan mengembalikan pesan error dari kelas `InvalidDivisionByZero.java`
         */ 
        if (operation.equals("+")){
            return a + b;
        } else if (operation.equals("-")){
            return a - b;
        } else if (operation.equals("*")){
            return a * b;
        } else {
            if (b == 0){
                throw new InvalidDivisionByZero();
            } else {
                throw new InvalidOperationException(operation);
            }
        }
    }

    // public static void main (String[] args){
    //     Calculator calc = new Calculator();
    //     double res = 0;
    //     try {
    //         res = calc.calculate(0, 0, ".");
    //     } catch (InvalidOperationException e){
    //         System.out.println(e.getMessage());
    //     } catch (InvalidDivisionByZero e){
            
    //     } finally { 
    //         System.out.println(res);
    //     }
    // }
}

class InvalidOperationException extends Exception {
    private String operation;

    public InvalidOperationException(String operation) {
        // Implementasi InvalidOperationException
        this.operation = operation;
    }

    public String getMessage() {
        // Implementasi custom message InvalidOperationException
        // Format: "Invalid operation: " + operation
        return "Invalid operation: " + operation;
    }
}

class InvalidDivisionByZero extends Exception {
    public InvalidDivisionByZero() {
        // Implementasi InvalidDivisionByZero
        super("Tidak dapat melakukan pembagian terhadap 0");
    }
}
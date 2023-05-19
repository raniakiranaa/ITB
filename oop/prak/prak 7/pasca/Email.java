import java.lang.Exception;

public class Email {
    private String email; 

    public Email(String email) {
        // konstruktor
        this.email = email;
    }
    
    public boolean validateEmail() throws InvalidDomainException, InvalidEmailException {
        /**
         * Implementasi dengan aturan:
         * Aturan email
         * - Email harus mengandung tepat 1 karakter @ ditengah email
         * - Bagian sebelum @ tidak boleh kosong
         * - Bagian email setelah @ harus memiliki tepat 1 buah titik (.)
         * - Email hanya akan mengandung huruf, angka, (@), dan (.). Karakter lain tidak
         * perlu diperiksa
         * 
         * "john@example.com" => Email Valid
         * "jane.doe@gmail.com" => Email Valid
         * "" => mengembalikan pesan "Email tidak boleh kosong"
         * "example.com" => mengembalikan pesan "Email harus mengandung tepat satu buah @"
         * "@example.com" => mengembalikan pesan "@ tidak boleh di awal email"
         * "john@com" => mengembalikan pesan "Email harus memiliki domain yang valid"
         */

        boolean ret = false;

        // email tidak boleh kosong
        if (email.length() == 0){
            throw new InvalidEmailException("Email tidak boleh kosong");
        }
        
        // Email harus mengandung tepat 1 karakter @ ditengah email
        // Bagian sebelum @ tidak boleh kosong
        int idx_first = email.indexOf('@'); // mengembalikan index pertama ditemukan @
        int idx_last = email.lastIndexOf('@'); // mencari apakah ada @ lg stlh idx_first
        if (idx_first == -1 || idx_last != idx_first){
            // @ tidak ditemukan / ditemukan 2 karakter @
            throw new InvalidEmailException("Email harus mengandung tepat satu buah @");
        } else if (idx_first == 0){
            // @ di awal kalimat
            throw new InvalidEmailException("@ tidak boleh di awal email");
        }

        // Bagian email setelah @ harus memiliki tepat 1 buah titik (.)
        int idx_dot_first = email.indexOf('.', idx_first + 1); // mengembalikan index pertama ditemukan . setelah @
        int idx_dot_last = email.lastIndexOf('.');
        if (idx_dot_first == -1 || idx_dot_first == idx_first + 1 || idx_dot_last != idx_dot_first || idx_dot_first == email.length()-1){
            throw new InvalidDomainException();
        }

        ret = true;
        return ret;
    }

}

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        // Implementasi InvalidEmailException
        super(message);
    }
}

class InvalidDomainException extends Exception {
    public String getMessage() {
        // Implementasi custom message InvalidDomainException
        // Return pesan multak berisi: "Email harus memiliki domain yang valid
        return "Email harus memiliki domain yang valid";
    }
}
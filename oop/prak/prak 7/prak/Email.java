public class Email {
    private String email; 
    public Email(String email) {
        this.email = email;
    };
    
    public boolean validateEmail() throws InvalidEmailException, InvalidDomainException {
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
        boolean validate = true;
        // @ tidak boleh di awal
        if (email.charAt(0) == '@'){
            throw new InvalidEmailException("@ tidak boleh di awal email");
        }

        // email tidak boleh kosong
        // lebih dari 2 @
        int at = 0;
        int empty = 0;
        for (int i=0; i < email.length(); i++){
            if (email.charAt(i) == '@'){
                at++;
            }
            if (email.charAt(i) == ' '){
                empty++;
            }
        }

        if (at > 1){
            throw new InvalidEmailException("Email harus mengandung tepat satu buah ")
        }




        int at = 0;
        for (int i = 0; i < email.length; i++){
            if (email[i] == '@'){
                if (i == 0){
                    validate = false;
                    throw new InvalidEmailException("@ tidak boleh ada di awal email");
                } else {
                    at++;
                    if (at > 1){
                        validate = false;
                        throw new InvalidEmailException("Email harus mengandung tepat satu buah @");
                    } else {
                        int titik = 0;
                        for (int j = i; j < email.length(); j++){
                            if (email[i] == '.'){
                                titik++;
                            }
                        }
                        if (titik == 0){
                            throw new InvalidDomainException();
                        }
                    }
                }
            } else {
                if(email[i] == ' '){
                    validate = false;
                    throw new InvalidEmailException("Email tidak boleh kosong");
                }
            }
        }

        return validate;
    }

}

class InvalidEmailException extends Exception{
    private String message;
    public InvalidEmailException(String message) {
        // Implementasi InvalidEmailException
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}

class InvalidDomainException extends Exception {
    public String getMessage() {
        // Implementasi custom message InvalidDomainException
        // Return pesan multak berisi: "Email harus memiliki domain yang valid
        return ("Email harus memiliki domain yang valid");
    }
}
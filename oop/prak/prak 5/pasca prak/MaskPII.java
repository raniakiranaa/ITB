public class MaskPII {
    private String maskEmail(String email) {
        // raniakiraa5@gmail.com
        //r*****5@gmail.com
        // semua huruf pada name dan domain dikonversi mjd kecil
        // name cuma dipake char pertama dan terakhir
        // tengah name diganti 5 asterisk(*)

        // semua huruf pada name dan domain dikonversi mjd kecil
        email = email.toLowerCase();

        // set char 0-6
        StringBuilder mask = new StringBuilder();
        mask.append(email.charAt(0));
        for (int i = 1; i < 6; i++){
            mask.append('*');
        }

        // cari indeks char sblm @
        int idx = 0;
        while (idx < email.length()){
            if (email.charAt(idx+1) == '@'){
                break;
            }
            idx++;
        }

        // ambil substring char terakhir name dan domain
        String domain = email.substring(idx, email.length());

        // tambahin domain ke mask
        mask.append(domain);

        String masked = mask.toString();
        return masked;
    }

    private String maskPhoneNumber(String phoneNumber) {
        // 10-13 digit telpon number
        // 0-3 digit pertama country code
        // 10 digit terakhir local code
        // hilangkan semua '+', '-', '(', ')', ' '
        // klo 10 digit -> "***-***-XXXX"
        // klo 11 digit -> "+*-***-***-XXXX"
        // klo 12 digit -> "+**-***-***-XXXX"
        // klo 13 digit -> "+***-***-***-XXXX"
        // XXXX adalah 4 digit terakhir local
        // 0812-8195)+ 2863
        // +**-***-***-2863

        // hilangin semua gptg
        StringBuilder digits = new StringBuilder();
        for (int i = 0; i < phoneNumber.length(); i++){
            if (phoneNumber.charAt(i) != '+' && phoneNumber.charAt(i) != '-' && phoneNumber.charAt(i) != '(' && phoneNumber.charAt(i) != ')' && phoneNumber.charAt(i) != ' '){
                digits.append(phoneNumber.charAt(i));
            }
        }
        
        String str = digits.toString();

        // ambil 4 digit belakang
        StringBuilder mask = new StringBuilder();
        for (int i = str.length()-4; i < str.length(); i++){
            mask.append(str.charAt(i));
        }

        if (str.length() == 10){
            return ("***-***-" + mask.toString());
        } else if (str.length() == 11){
            return ("+*-***-***-" + mask.toString());
        } else if (str.length() == 12){
            return ("+**-***-***-" + mask.toString());
        } else {
            return ("+***-***-***-" + mask.toString());
        }
    }

    public String maskPII(String pii) {
        // dilakukan pengecekan String pii
        // jika pii merupakan email, panggil method maskEmail
        // jika pii merupakan phone number, panggil method maskPhoneNumber
        boolean email = false;
        for (int i = 0; i < pii.length(); i++){
            if (pii.charAt(i) == '@'){
                email = true;
            }
        }
        if (email){
            return (maskEmail(pii));
        } else {
            return (maskPhoneNumber(pii));
        }
    }
}
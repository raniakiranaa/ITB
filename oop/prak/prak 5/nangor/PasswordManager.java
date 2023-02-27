import java.util.ArrayList;

public class PasswordManager {
    /**
     * Atribut yang menyimpan password yang telah dienkripsi
     */
    private static ArrayList<String> passwords;
    private static ArrayList<Integer> shifts;

    /**
     * Konstruktor untuk PasswordManager
     * Inisialisasi array list passwords dan shifts
     */
    public PasswordManager() {
        passwords = new ArrayList<String>();
        shifts = new ArrayList<Integer>();
    }

    /**
     * Asumsi seluruh input a-z
     * Enkripsi dilakukan dengan cara menggeser karakter sebanyak shift
     * Contoh: encrypt(qwerty,2) = sygtva
     * Anda diizinkan untuk membuat fungsi helper dengan akses private
     * yang melakukan shifting dari suatu character
     * @param password, password yang akan dienkripsi
     * @param shift, jumlah pergeseran
     */
    public static StringBuilder encrypt(String password, int shift) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < password.length(); i++){
            char x = password.charAt(i);
            if (x >= 'a' && x <= 'z'){
                x += shift;
                if (x > 'z'){
                    x -= 26;
                }
            }
            string.append(x);
        }
        return string;
    }

    /**
     * Dekripsi password yang sudah dienkrip
     * @param password
     * @param shift
     */
    public static StringBuilder decrypt(String password, int shift) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < password.length(); i++){
            char x = password.charAt(i);
            if (x >= 'a' && x <= 'z'){
                x -= shift;
                if (x < 'a'){
                    x += 26;
                }
            }
            string.append(x);
        }
        return string;
    }

    /**
     * Method untuk menambahkan password baru
     * Gunakan method encrypt
     * @param password password baru yang akan ditambahkan
     * @param shift jumlah shift enkripsi
     */
    public static void addPassword(String password, int shift) {
        StringBuilder encrypted = encrypt(password, shift);
        passwords.add(encrypted.toString());
        shifts.add(shift);
    }

    /**
     * Method untuk mengambil password
     * @param index indeks password yang akan diambil
     */
    public static String retrievePassword(int indeks) {
        StringBuilder pass = decrypt(passwords.get(indeks), shifts.get(indeks));
        return (pass.toString());
    }
    
    public static void main(String[] args) {
        PasswordManager pm = new PasswordManager();
        pm.addPassword("qwerty", 2);
        System.out.println("qwerty -> " + pm.passwords.get(0));
        System.out.println("retrieve qwerty -> " + pm.retrievePassword(0));

        pm.addPassword("asdfgh", 3);
        System.out.println("asdfgh -> " + pm.passwords.get(1));
        System.out.println("retrieve asdfgh -> " + pm.retrievePassword(1));
        
        pm.addPassword("zxcvbn", 4);
        System.out.println("zxcvbn -> " + pm.passwords.get(2));
        System.out.println("retrieve zxcvbn -> " + pm.retrievePassword(2));
    }
}

import java.util.ArrayList;  

public class WordProcessor {
    // Atribut statik untuk menyimpan daftar kata
    private static ArrayList<String> words;

    /**
     * Konstruktor
     * Inisialisasi daftar kata
     */
    public WordProcessor() {
        words = new ArrayList<String>();
    }

    /**
     * Menambahkan kata ke dalam daftar kata
     * @param word
     */
    public static void addWord(String word) {
        words.add(word);
    }

    /**
     * Menghapus kata dari daftar kata
     * @param word
     */
    public static void removeWord(String word) {
        int i;
        for (i = 0; i < words.size(); i++){
            if (words.get(i).equals(word)){
                break;
            }
        }
        words.remove(i);
    }

    /**
     * Mencetak daftar kata dengan format:
     * 1. kata1
     * 2. kata2
     * ...
     */
    public static void printWords() {
        for(int i = 0; i < words.size(); i++){
            System.out.println(i+1 + ". " + words.get(i));
        }
    }

    /**
     * Mengembalikan kata terbalik pada index tertentu
     * Index dimulai dari 0
     * @param indeks
     * @return
     */
    private static StringBuilder reverseWord(int indeks) {
        StringBuilder reverse = new StringBuilder();
        String str = words.get(indeks);
        for (int i = str.length()-1; i >= 0; i--){
            reverse.append(str.charAt(i));
        }
        return reverse;
    }
    
    /**
     * Mengembalikan apakah suatu kata pada index tertentu merupakan palindrome
     * Clue: gunakan method reverseWord
     * @param indeks
     * @return  true jika kata pada index tertentu merupakan palindrome
     *          false jika kata pada index tertentu bukan palindrome atau index tidak valid
     */
    public static boolean isPalindrome(int indeks) {
        if (indeks < words.size()){
            String reversed =  reverseWord(indeks).toString();
            if (words.get(indeks).equals(reversed)){
                return true;
            }
        }
        return false;
    }
}

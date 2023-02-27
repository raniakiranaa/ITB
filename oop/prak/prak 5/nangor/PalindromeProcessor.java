import java.util.ArrayList;

public class PalindromeProcessor {

    private boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindromeSubstring(String str) {
        // keluarkan susbtring palindrome terpanjang
        String longest = "";
        for (int i = 0; i < str.length(); i++){
            for (int j = i + 1; j <= str.length(); j++){
                String substring = str.substring(i, j);
                if (isPalindrome(substring) && substring.length() > longest.length()){
                    longest = substring;
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        PalindromeProcessor pp = new PalindromeProcessor();
        System.out.println("apple -> " + pp.longestPalindromeSubstring("apple"));
        System.out.println("qweewqx -> " + pp.longestPalindromeSubstring("qweewqx"));
    }
}

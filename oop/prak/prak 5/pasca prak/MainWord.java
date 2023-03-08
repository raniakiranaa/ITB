public class MainWord {
    public static void main (String[] args){
        WordProcessor wordProcessor = new WordProcessor();
        wordProcessor.addWord("haiiah");
        wordProcessor.addWord("halo");
        wordProcessor.printWords();
        wordProcessor.removeWord("halo");
        wordProcessor.printWords();
        System.out.println(wordProcessor.isPalindrome(0));
    }
}

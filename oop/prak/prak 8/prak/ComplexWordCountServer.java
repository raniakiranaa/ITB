import java.util.ArrayList;

public class ComplexWordCountServer {

    private int nWorkers;

    // masukkan arraylist of string dipastikan berupa alfabet lowercase saja
    private ArrayList<String> array;

    // hasil pada method countSpecialString akan disimpan pada res
    int[] res = new int[26];

    ComplexWordCountServer(int nWorkers, ArrayList<String> array) {
        // Inisialisasi attributes
        this.nWorkers = nWorkers;
        this.array = array;
    }

    public void countSpecialString() throws InterruptedException {
        // calculateSum akan membuat thread untuk setiap string
        // setiap thread kemudian akan memanggil metode characterCountHelper
        // lalu hasil dari Array Mapping yang dikembalikan oleh metode characterCountHelper akan digunakan
        // untuk ditambahkan ke attribut res
        
    }

    protected int[] characterCountHelper(String str) {
        // Menghitung berapa banyak occurence dari suatu karakter pada suatu string
        // lalu dipetakan pada suatu array of integer

        // HINT : untuk memetakan suatu karakter ke array of integer, anda bisa melakukan arr[c-'a']
        // sehingga apabila variable c merupakan karakter 'a', value dari c-'a' menjadi 0, begitupun
        // dengan karakter alfabet lainnya
    }

    public String toString() {
        // menampilkan berapa banyak kata spesial "one", "two" dan "three"
        // format keluaran dari fungsi ini adalah "one : {one_occurence}, two : {two_occurence}, three : {three_occurence}"
        // lalu diakhiri dengan newline
    }
}

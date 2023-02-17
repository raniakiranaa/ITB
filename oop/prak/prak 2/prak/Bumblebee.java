/**
 * Bumblebee.java
 * Kelas yang memodelkan Bumblebee, turunan dari kelas Robot
 * @author 18221168 Rania Sasi Kirana
 */

public class Bumblebee extends Robot {

    private int totalTransformation;

    public Bumblebee(int numberOfParts, boolean isActive) {
        // Konstruktor, set totalTransformation = 1
        super(numberOfParts, isActive);
        this.totalTransformation = 1;
    }

    public int getTotalTransformation(){
        // Mengembalikan totalTransformation
        return this.totalTransformation;
    }

    public void addTransformation(){
        // Menambahkan totalTransformation sejumlah 1
        this.totalTransformation++;
    }

    @Override
    public long getPrice() {
        // Apabila aktif, harga bernilai numberOfParts * 1000 * totalTransformation
        // Apabila tidak aktif, harga bernilai numberOfParts * 1000
        long parts = this.getNumberOfParts();
        if (this.getIsActive()){
            return parts * 1000 * this.totalTransformation;
        } else {
            return parts * 1000;
        }
    }
}
/**
 * Sirik.java
 * turunan dari kelas Robot
 * @author 18221168 Rania Sasi Kirana
 */

 public class Sirik extends Robot {

    private long price;
    private int totalModel;

    public Sirik(long price) {
        // Konstruktor, set jumlah model bernilai 1
        super(5, false);
        this.price = price;
        this.totalModel = 1;
    }

    public int getTotalModel(){
        // Mengembalikan junlah
        return this.totalModel;
    }

    public void addModel(){
        // Menambahkan model sejumlah 1
        this.totalModel++;
    }

    @Override
    public long getPrice() {
        // Apabila total model lebih dari 2, 
        // maka formula = price + (500 * numberOfParts - (100 * totalModel))
        // Apabila total model kurang dari/sama dengan 2,
        // maka formula = price + (500 * numberOfParts * totalModel)
        if (this.totalModel <= 2){
            return this.price + (500 * (long) this.getNumberOfParts() * (long) this.totalModel);
        } else {
            return this.price + (500 * (long) this.getNumberOfParts() - (100 * (long) this.totalModel));
        }
    }
}
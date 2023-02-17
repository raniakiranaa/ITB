/**
 * Gajah.java
 * turunan dari kelas Animal
 * @author 18221168 Rania Sasi Kirana
 */

 public class Gajah extends Animal {

    private long basePower;
    private long jumlahGading;

    public Gajah(long basePower, int jumlahGading) {
        // Konstruktor, jumlah gading minimal 0 maksimal 2
        super(4);
        this.basePower = basePower;
        if (jumlahGading<0){
            jumlahGading = 0;
        } else if (jumlahGading>2){
            jumlahGading = 2;
        }
        this.jumlahGading = jumlahGading;
    }

    public long getJumlahGading(){
        // Mengembalikan jumlahGading
        return this.jumlahGading;
    }

    @Override
    public long getAnimalPower() {
        // Mengembalikan kekuatan Gajah dengan formula 3 * basePower * (1 + jumlahGading)
        return (3 * this.basePower * (1 + this.jumlahGading));
    }
}
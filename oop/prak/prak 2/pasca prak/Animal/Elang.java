/**
 * Elang.java
 * turunan dari kelas Animal
 * @author 18221168 Rania Sasi Kirana
 */

 public class Elang extends Animal {

    private long basePower;
    private int jumlahTelur;

    public Elang(long basePower) {
        // Konstruktor, set jumlahTelur ke 0
        super(2);
        this.basePower = basePower;
        this.jumlahTelur = 0;
    }

    public int getJumlahTelur(){
        // Mengembalikan atribut jumlahTelur
        return this.jumlahTelur;
    }

    public void bertelur(){
        // Menambah jumlahTelur dengan 1
        this.jumlahTelur++;
    }

    @Override
    public long getAnimalPower() {
        // Mengembalikan kekuatan Elang dengan formula basePower * children - jumlahTelur
        return this.basePower * this.getNumberOfChildren() - this.jumlahTelur;
    }
}
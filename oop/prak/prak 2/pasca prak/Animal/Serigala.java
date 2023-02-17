/**
 * Serigala.java
 * turunan dari kelas Animal
 * @author 18221168 Rania Sasi Kirana
 */

 public class Serigala extends Animal {

    private long basePower;
    private boolean kawanan;

    public Serigala(long basePower, boolean kawanan) {
        // Konstruktor
        super(4);
        this.basePower = basePower;
        this.kawanan = kawanan;
    }

    private boolean hasKawanan(){
        // Mengembalikan state apakah ia memiliki kawanan atau tidak
        return this.kawanan;
    }

    @Override
    public long getAnimalPower() {
        // Mengembalikan kekuatan serigala.
        // Apabila ia memiliki kawanan dan anak, formulanya basePower * 3 * children
        // Selain itu, kekuatan hanya bernilai basePower
        if (!hasKawanan()){
            return this.basePower;
        } else {
            if (this.getNumberOfChildren() == 0){
                return this.basePower;
            } else {
                return this.basePower * 3 * this.getNumberOfChildren();
            }
        }
    }
}
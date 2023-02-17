/**
 * WallE.java
 * Kelas yang memodelkan WallE, turunan dari kelas Robot
 * @author 18221168 Rania Sasi Kirana
 */

public class WallE extends Robot {

    private long mileage;

    public WallE(long mileage, boolean isActive) {
        // Konstruktor
        super(10, isActive);
        this.mileage = mileage;
    }

    public long getMileage(){
        // Mengembalikan mileage
        return this.mileage;
    }

    public void addMileage(long increment){
        // Menambahkan mileage dengan increment
        this.mileage += increment;
    }

    @Override
    public long getPrice() {
        // Apabila sedang aktif, maka harga total adalah mileage * 1000, 
        // Apabila tidak aktif maka ada tambahan biaya 500
        if (this.getIsActive()){
            return this.mileage * 1000;
        } else {
            return (this.mileage * 1000) + 500;
        }
    }
}

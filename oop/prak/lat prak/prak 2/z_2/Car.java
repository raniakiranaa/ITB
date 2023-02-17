/**
 * Car.java
 * Membuat Car
 * @author
 */

 public abstract class Car {
    private int numberOfWheels;
    private long mileage;
    
    public Car(int numberOfWheels) {
        // Konstruktor, set mileage = 0
        this.numberOfWheels = numberOfWheels;
        this.mileage = 0;
    }
    
    public int getNumberOfWheels() {
        // Mengembalikan atribut numberOfWheels
        return this.numberOfWheels;
    }
  
    public long getMileage() {
        // Mengembalikan atribut mileage
        return this.mileage;
    }
    
    public void increaseMileage(long increment) {
        // Meningkatkan nilai atribut mileage
        this.mileage += increment;
    }
  
    public String toString() {
        // Mengembalikan informasi mobil dengan format: "Number of Wheels: {numberOfWheels}, Mileage: {mileage}"
        String str = "Number of wheels: " + String.valueOf(this.numberOfWheels) + ", Mileage: " + String.valueOf(this.mileage);
        return str;
    }
  
    public abstract long getPrice();
}

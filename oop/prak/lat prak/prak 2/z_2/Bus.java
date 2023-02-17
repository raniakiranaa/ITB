/**
 * Bus.java
 * Membuat Bus
 * @author 18220008 Zhillan Attarizal Rezyarifin
 */

public class Bus extends Car {

    private int maxCapacity;

    // Konstruktor
    public Bus(int maxCapacity) {
        super(6);
        this.maxCapacity = maxCapacity;
    }

    // Get method
    public int getMaxCapacity() {
        return this.maxCapacity;
    }

    // Override toString
    public String toString() {
        String str = "Number of wheels: " + String.valueOf(super.getNumberOfWheels()) + ", Mileage: " + String.valueOf(this.mileage) + ", Max Capacity: " + String.valueOf(this.maxCapacity);
        return str;
    }

    // Abstract impl get price
    public long getPrice() {

    }
}

/**
 * Robot.java
 * Kelas yang memodelkan Robot
 * @author 18221168 Rania Sasi Kirana
 */

public abstract class Robot {

    private int numberOfParts;
    private boolean isActive;

    public Robot(int numberOfParts, boolean isActive) {
        // Konstruktor
        this.numberOfParts = numberOfParts;
        this.isActive = isActive;
    }

    public int getNumberOfParts() {
        // Mengembalikan atribut numberOfParts
        return this.numberOfParts;
    }

    public boolean getIsActive() {
        // Mengembalikan atribut isActive
        return this.isActive;
    }

    public void setActivation(boolean isActive) {
        // Menetapkan atribut isActive
        this.isActive = isActive;
    }

    public String toString() {
        // Mengembalikan informasi hewan dengan format: "Number of Parts: {numberOfParts}, IsActive: {isActive}"
        String str = "Number of Parts: " + String.valueOf(this.numberOfParts) + ", IsActive: " + String.valueOf(this.isActive);
        return str;
    }

    public abstract long getPrice();
}

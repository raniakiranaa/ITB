/**
 * Animal.java
 * kelas-kelas animal untuk memodelkan hewan di suatu kerajaan hewan
 * @author 18221168 Rania Sasi Kirana
 */

 public abstract class Animal {

    private int numberOfLegs;
    private long children;

    public Animal(int numberOfLegs) {
        // Konstruktor, set children = 0
        this.numberOfLegs = numberOfLegs;
        this.children = 0;
    }

    public int getNumberOfLegs() {
        // Mengembalikan atribut numberOfLegs
        return this.numberOfLegs;
    }

    public long getNumberOfChildren() {
        // Mengembalikan atribut children
        return this.children;
    }

    public void increaseChild(long inc) {
        // Meningkatkan nilai atribut children
        this.children += inc;
    }

    public String toString() {
        // Mengembalikan informasi hewan dengan format: "Number of Legs: {numberOfLegs}, Children: {children}"
        String str = "Number of Legs: " + String.valueOf(this.numberOfLegs) + ", Children: " + String.valueOf(this.children);
        return str;
    }

    public abstract long getAnimalPower();
}
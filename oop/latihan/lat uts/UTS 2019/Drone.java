// Soal No. 4
// Buatlah sebuah kelas bernama Drone yang merupakan turunan
// dari Vehicle dan mengimplementasi interface Moveable. Kelas
// ini memiliki atribut tambahan vSpeed yang bertipe integer.
// Definisikan hanya sebuah konstruktor yang melakukan pengesetan
// terhadap nilai location. Buatlah method dengan nama climb dan
// descend yang menambah/mengurangi altitude sebanyak 1 satuan.

public class Drone extends Vehicle {
    private int vSpeed;

    // konstruktor
    public Drone(GeoLoc loc){
        super(loc);
    }

    // method
    public void climb(){
        float lat = this.getLocation().getLat();
        float lon = this.getLocation().getLon();
        int alt = this.getLocation().getAlt() + 1;
        this.getLocation().setLoc(lat, lon, alt);
    }

    public void descend(){
        float lat = this.getLocation().getLat();
        float lon = this.getLocation().getLon();
        int alt = this.getLocation().getAlt() - 1;
        this.getLocation().setLoc(lat, lon, alt);    
    }
 
    // getter
    public int getVSpeed(){
        return this.vSpeed;
    }

    // abstract method
    public void accelerate(){
        vSpeed++;
    }

    public void decelerate(){
        vSpeed--;
    }
}
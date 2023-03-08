// Soal No. 3
// Buatlah sebuah abstract class dengan nama Vehicle yang
// mengimplementasi interface Moveable. Kelas ini mempunyai
// properties sebuah GeoLoc bernama loc (location) dan speed
// yang bertipe integer. Definisikan juga method getLocation
// yang mengembalikan location dari Vehicle. Kelas ini mem-
// punyai sebuah abstract method dengan nama accelerate dan
// decelerate tanpa parameter. Lengkapi konstruktor kelas
// ini dengan parameter sebuah GeoLoc. Tambahkan sebuah field
// bernama numVehicle yang akan mencacah berapa kali kelas
// tersebut diinstansiasi. Buatlah getter untuk numVehicle 
// tersebut (beri nama getNumVehicle)

public abstract class Vehicle implements Moveable {
    // properties = atribut = field
    private GeoLoc loc;
    private int speed = 0;
    private static int numVehicle;

    // konstruktor
    public Vehicle(GeoLoc loc){
        this.loc = loc;
        numVehicle++;
    }

    // getter
    public GeoLoc getLocation(){
        return this.loc;
    }

    public int getSpeed(){
        return this.speed;
    }

    public static int getNumVehicle(){
        return numVehicle;
    }

    public abstract void accelerate();
    public abstract void decelerate();

    public void moveTo(GeoLoc newLoc){
        this.loc = newLoc;
    }
}
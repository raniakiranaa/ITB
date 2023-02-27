/**
 * Car.java
 * Parent class
 * @author 18221168 Rania Sasi Kirana
 */
public class Car {
    private int numberOfWheels;
    private Engine engine;
    private Tyre tyre;

    public Car(int numberOfWheels, Engine engine, Tyre tyre) {
        // Konstruktor
        this.numberOfWheels = numberOfWheels;
        this.engine = engine;
        this.tyre = tyre;
    }
  
    public int getNumberOfWheels() {
        // Kembalikan number of wheels
        return this.numberOfWheels;
    }

    public void setEngine(Engine engine) {
        // Mengeset mesin mobil
        this.engine = engine;
    }

    public void setTyre(Tyre tyre) {
        // Mengeset ban mobil
        this.tyre = tyre;
    }

    public Engine getEngine() {
        // Kembalikan engine
        return this.engine;
    }

    public Tyre getTyre() {
        // Kembalikan tyre
        return this.tyre;
    }
    
    public String sound(){
        // Kembalikan sound dari engine
        return this.engine.sound();
    }

    public Boolean isRacingCar() {
        // Apabila isSlickTyre true maka true
        // else false
        return this.tyre.isSlickTyre();
    }

    public String printDescription(){
        // Apabila isRacingCar true kembalikan "Mobil balap ini memiliki a roda dengan kapasitas mesin x cc" dengan a numberOfWheels dan x engineCapacity
        // else kembalikan "Mobil ini memiliki a roda dengan kapasitas mesin x cc"
        if (this.isRacingCar()){
            return ("Mobil balap ini memiliki " + this.getNumberOfWheels() + " roda dengan kapasitas mesin " + this.engine.getEngineCapacity() + " cc");
        } else {
            return ("Mobil ini memiliki " + this.getNumberOfWheels() + " roda dengan kapasitas mesin " + this.engine.getEngineCapacity() + " cc");
        }
    }
}


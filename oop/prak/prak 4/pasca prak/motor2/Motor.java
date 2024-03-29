/**
 * Motor.java
 * Parent class
 * @author 18221168 Rania Sasi Kirana
 */
public class Motor {
    private int numberOfWheels;
    private Engine1 engine;
    private Tyre tyre;
  
    public Motor(int numberOfWheels, Engine1 engine, Tyre tyre) {
        // Konstruktor
        this.numberOfWheels = numberOfWheels;
        this.engine = engine;
        this.tyre = tyre;
    }

    public void setEngine(Engine1 engine) {
        // Mengeset mesin motor
        this.engine = engine;
    }

    public void setTyre(Tyre tyre) {
        // Mengeset ban motor
        this.tyre = tyre;
    }

    public Engine1 getEngine() {
        // Mengembalikan mesin
        return this.engine;
    }

    public Tyre getTyre() {
        // Mengembalikan ban
        return this.tyre;
    }
    
    public String sound(){
        //Mengembalikan string berisi suara mesin
        return this.engine.sound();
    }

    public String printDescription() {
        //Mengembalikan string berformat "Motor ini memiliki a roda dengan kapasitas mesin b cc", dimana a adalah numberOfWheels dan b adalah engineCapacity
        return ("Motor ini memiliki " + this.numberOfWheels + " roda dengan kapasitas mesin " + this.engine.getEngineCapacity() + " cc");
    }
}
/**
 * Motor.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */
public class Motorawal {
    private int numberOfWheels;
    private int engineCapacity;
  
    public Motorawal(int numberOfWheels,int engineCapacity) {
        this.numberOfWheels = numberOfWheels;
        this.engineCapacity = engineCapacity;
    }
  
    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }
  
    public int getEngineCapacity() {
        return this.engineCapacity;
    }
    
    public String sound(){
        return "Ngenggg";
    }
    public String printDescription(){
        return String.format("Motor ini memiliki %d roda dengan kapasitas mesin %d cc", this.numberOfWheels, this.engineCapacity);
    }
}
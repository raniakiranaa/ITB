/**
 * Car.java
 * Parent class
 * @author 18221168 Rania Sasi Kirana
 */
public class Car1 {
    private int numberOfWheels;
    private int engineCapacity;
  
    public Car1(int numberOfWheels,int engineCapacity) {
        this.numberOfWheels=numberOfWheels;
        this.engineCapacity=engineCapacity;

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
    public String honk(){
        return "Din";
    }
    public String printDescription(){
        return String.format("Mobil ini memiliki %d roda dengan kapasitas mesin %d cc", this.numberOfWheels, this.engineCapacity);
    }
}

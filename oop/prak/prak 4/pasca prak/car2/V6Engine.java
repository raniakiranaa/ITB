public class V6Engine implements Engine {
    private int engineCapacity;
    private Boolean isTurbo;

    public V6Engine(int engineCapacity, Boolean isTurbo) {
        // Konstruktor
        this.engineCapacity = engineCapacity;
        this.isTurbo = isTurbo;
    }

    @Override
    public int getEngineCapacity() {
        // Apabila isTurbo true, engineCapacity + 200
        // else kembalikan engineCapacity
        if (this.isTurbo){
            return this.engineCapacity + 200;
        } else {
            return this.engineCapacity;
        }
    }

    @Override
    public String sound() {
        // Kembalikan vroomvroom
        return "vroomvroom";
    }
}

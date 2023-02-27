public class TwoStrokeEngine implements Engine1 {
    private int engineCapacity;

    public TwoStrokeEngine(int engineCapacity) {
        // Konstruktor
        this.engineCapacity = engineCapacity;
    }

    @Override
    public int getEngineCapacity() {
        // Kembalikan kapasitas mesin
        return this.engineCapacity;
    }

    @Override
    public String sound() {
        // Kembalikan "taktaktak"
        return "taktaktak";
    }
}

public class ParelliTyre implements Tyre {
    private int pressure;
    private int width;

    public ParelliTyre(int pressure, int width) {
        // Konstruktor
        this.pressure = pressure;
        this.width = width;
    }

    @Override
    public int getTyrePressure() {
        // Mengembalikan pressure
        return this.pressure;
    }

    @Override
    public int getTyreWidth() {
        // Mengembalikan width
        return this.width;
    }

    @Override
    public Boolean isSlickTyre() {
        // Mengembalikan isSlick
        return true;
    }
}

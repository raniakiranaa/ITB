public class DonlupTyre implements Tyre {
    private int pressure;
    private int width;
    private Boolean isSlick;

    public DonlupTyre(int pressure, int width, Boolean isSlick) {
        // Konstruktor
        this.pressure = pressure;
        this.width = width;
        this.isSlick = isSlick;
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
        return this.isSlick;
    }
}

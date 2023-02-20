public class DonlupTyre implements Tyre {
    private int pressure;
    private int width;

    public DonlupTyre(int pressure, int width) {
        // Konstruktor
        this.pressure = pressure;
        this.width = width;
    }

    @Override
    public String getTyreName() {
        // Kembalikan "Donlup"
        return "Donlup";
    }

    @Override
    public int getTyrePressure() {
        // Kembalikan nilai pressure
        return this.pressure;
    }

    @Override
    public int getTyreWidth() {
        // Kembalikan nilai width
        return this.width;
    }
}

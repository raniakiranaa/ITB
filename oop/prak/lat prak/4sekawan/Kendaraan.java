public class Kendaraan {
    private int nomor;
    private String kategori;
    private String merk;
    private int tahun;

    // konstruktor
    public Kendaraan(){
        this.nomor = 0;
        this.tahun = 0;
        this.merk = "XXX";
        this.kategori = "Mobil";
    }

    public Kendaraan(int nomor, String kategori, String merk, int tahun){
        this.nomor = nomor;
        this.kategori = kategori;
        this.merk = merk;
        this.tahun = tahun;
    }

    public void printInfo(){
        System.out.println("Nomor: " + nomor);
        System.out.println("Kategori: " + kategori);
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
    }

    public int biayaSewa(int lamaSewa){
        int biaya;
        if (this.kategori.equals("Bus")){
            biaya = 1000000 * lamaSewa;
        } else if (this.kategori.equals("Minibus")){
            if (lamaSewa<=5){
                biaya = 5000000;
            } else {
                biaya = 5000000 + 500000 * (lamaSewa - 5);
            } 
        } else {
            biaya = 500000 * lamaSewa;
        }
        return biaya;
    }

}
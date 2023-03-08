// Soal No.1
// Buatlah kelas dengan nama GeoLoc. Kelas ini mempunyai 3 buah
// atribut, yaitu lat (latitude) bertipe float, lon (longitude)
// bertipe float, dan alt (altitude) yang bertipe integer. Kelas
// ini mempunyai sebuah konstruktor berparameter lat, lon, dan 
// alt yang nilainya dijadikan inisialisasi nilai atribut kelas
// ini. Kelas ini juga memiliki method bernama setLoc dengan
// parameter lat, lon, dan alt sebagai setter ketiga atribut
// yang dimiliki. Lengkapi getter agar aspek information hiding
// terpenuhi.

public class GeoLoc {
    // atribut
    private float lat;
    private float lon;
    private int alt;

    // konstruktor
    public GeoLoc(float lat, float lon, int alt){
        setLoc(lat, lon, alt);
    }

    // setter
    public void setLoc (float lat, float lon, int alt){
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;        
    }

    // getter
    public float getLat(){
        return this.lat;
    }

    public float getLon(){
        return this.lon;
    }

    public int getAlt(){
        return this.alt;
    }
}
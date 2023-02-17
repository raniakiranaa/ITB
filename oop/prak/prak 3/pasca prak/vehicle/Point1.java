public class Point1 {
    private double latitude;
    private double longitude;

    // konstruktor
    public Point1(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // getter
    public double getLatitude(){
        return this.latitude;
    }

    public double getLongitude(){
        return this.longitude;
    }
}
public class Point {
    private double latitude;
    private double longitude;

    // konstruktor
    public Point(double latitude, double longitude){
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
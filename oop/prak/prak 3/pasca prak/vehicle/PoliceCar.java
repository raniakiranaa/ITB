public class PoliceCar implements TrackableVehicle {
    private String plateNumber;
    private Point1 gpsPosition;
    private int speed;
    private String direction;
    private int wheel;
    private String fuelType;
    private boolean started;

    // konstruktor
    public PoliceCar(String plateNumber, Point1 gpsPosition, int speed, int wheel, String fuelType){
        this.plateNumber = plateNumber;
        this.gpsPosition = gpsPosition;
        this.speed = speed;
        this.direction = "North";
        this.wheel = wheel;
        this.fuelType = fuelType;
        this.started = false;
    }

    // getter
    public String getPlateNumber(){
        return this.plateNumber;
    }

    public Point1 getGPSPosition(){
        return this.gpsPosition;
    }

    public int getNumberOfWheels(){
        return this.wheel;
    }

    public int getMaxSpeed(){
        return this.speed;
    }

    public String getFuelType(){
        return this.fuelType;
    }

    public void start(){
        this.started = true;
    }

    public void stop(){
        this.started = false;
    }

    public void turn(String direction){
        this.direction = direction;
    }

    public String getDirection(){
        return this.direction;
    }

    public boolean getStarted(){
        return this.started;
    }
}
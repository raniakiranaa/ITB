public class PoliceCar implements TrackableVehicle {
    private String plateNumber;
    private Point gpsPosition;
    private int speed;
    private String direction;
    private int wheel;
    private String fuelType;
    private boolean started;
    
    public PoliceCar(String plateNumber, Point gpsposition, int speed, int wheel, String fuelType){
        this.direction = "North";
        this.started = false;
        this.plateNumber = plateNumber;
        this.gpsPosition = gpsposition;
        this.speed = speed;
        this.wheel = wheel;
        this.fuelType = fuelType;
    }

    public String getDirection(){
        return this.direction;
    }

    public boolean getStarted(){
        return this.started;
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

    public String getPlateNumber(){
        return this.plateNumber;
    }

    public Point getGPSPosition(){
        return this.gpsPosition;
    }

}

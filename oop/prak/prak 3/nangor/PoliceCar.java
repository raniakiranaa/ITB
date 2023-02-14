public class PoliceCar implements TrackableVehicle {
    private String plateNumber;
    private Point gpsPosition;
    private int speed;
    private String direction;
    private int wheel;
    private String fuelType;
    private boolean started;
    
    public PoliceCar(){
        this.direction = "North";
        this.started = false;
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

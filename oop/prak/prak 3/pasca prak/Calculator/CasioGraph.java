import java.lang.Math;

public class CasioGraph implements GraphCalculator {
    private Point point;
    private int batteryLevel;
    private boolean status;

    // konstruktor
    public CasioGraph(int x, int y){
        this.point = new Point(x, y);
        this.batteryLevel = 100;
        this.status = false;
    }

    // method interface
    public int add(int a, int b){
        if (this.checkBattery() >= 10){
            this.batteryLevel -= 10;
            return a + b;
        } else {
            return -1;
        }
    }

    public int substract(int a, int b){
        if (this.checkBattery() >= 10){
            this.batteryLevel -= 10;
            return a - b;
        } else {
            return -1;
        }
    }

    public int multiply(int a, int b){
        if (this.checkBattery() >= 10){
            this.batteryLevel -= 10;
            return a * b;
        } else {
            return -1;
        }
    }

    public double divide(int a, int b){
        if (this.checkBattery() >= 10){
            this.batteryLevel -= 10;
            return (double) a / (double) b;
        } else {
            return -1;
        }
    }

    public void start(){
        if (this.checkBattery() > 0){
            this.status = true;
        } else { // Batterylevel = 0
            this.status = false;
            this.charge();
        }
    }

    public void stop(){
        this.status = false;
    }

    public int checkBattery(){
        return this.batteryLevel;
    }

    public void shiftX(int shiftCount){
        if (this.checkBattery() >= 10){
            this.batteryLevel -= 10;
            this.point.setX(this.point.getX() + shiftCount);
        } 
    }

    public void shiftY(int shiftCount){
        if (this.checkBattery() >= 10){
            this.batteryLevel -= 10;
            this.point.setY(this.point.getY() + shiftCount);
        } 
    }

    public double distance(int x, int y){
        if (this.checkBattery() >= 10){
            this.batteryLevel -= 10;
            double x_tot = Math.pow((double) this.point.getX()-x, 2);
            double y_tot = Math.pow((double) this.point.getY()-y, 2);
            return Math.sqrt(x_tot + y_tot);
        } else {
            return -1;
        }
    }

    // getter
    public boolean getStatus(){
        return this.status;
    }

    public Point getPoint(){
        return this.point;
    }

    // method tambahan
    public void charge(){
        this.batteryLevel = 100;
        this.start();
    }
}

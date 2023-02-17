import java.lang.Math;

public class CasioGraph implements GraphCalculator {
	private Point point;
	private int batteryLevel;
	private boolean status;

	public CasioGraph(int x, int y){
		this.batteryLevel = 100;
		this.status = false;
		this.point = new Point(x,y);
	}

	public int add(int a, int b){
		if (this.getStatus() == true){
			this.batteryLevel -= 10;
			return a + b;
		} else {
			return -1;
		}
	}

	public int substract(int a, int b){
		if (this.getStatus() == true){
			this.batteryLevel -= 10;
			return a - b;
		} else {
			return -1;
		}
	}

	public int multiply(int a, int b){
		if (this.getStatus() == true){
			this.batteryLevel -= 10;
			return a * b;
		} else {
			return -1;
		}
	}

	public double divide(int a, int b){
		if (this.getStatus() == true){
			this.batteryLevel -= 10;
			return ((double) a / (double) b);
		} else {
			return -1;
		}
	}

	public void start(){
		if (this.batteryLevel != 0){
			this.status = true;
		}
	}

	public void stop(){
		this.status = false;
	}

	public int checkBattery(){
		return this.batteryLevel;
	}

	public void shiftX(int shiftCount){
		if (this.getStatus() == true){
			int tot_x = this.point.getX() + shiftCount;
			this.point.setX(tot_x);
			this.batteryLevel -= 10;
		}
	}

	public void shiftY(int shiftCount){
		if (this.getStatus() == true){
			int tot_y = this.point.getY() + shiftCount;
			this.point.setY(tot_y);
			this.batteryLevel -= 10;
		}
	}

	public double distance(int x, int y){
		if (this.getStatus() == true){
			this.batteryLevel -= 10;
			double x2 = Math.pow((x-this.point.getX()),2);

			double y2 = Math.pow((y-this.point.getY()),2);

			return Math.sqrt(x2 + y2);
		} else {
			return -1;
		}
	}

	public boolean getStatus(){
		return this.status;
	}

	public Point getPoint(){
		return this.point;
	}

	public void charge(){
		this.batteryLevel += 100;
	}

}
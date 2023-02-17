import java.lang.Math;

public class Main{
	public static void main (String[] args){
		CasioGraph cg = new CasioGraph(0,0);
		cg.start();
		System.out.println(cg.divide(2,4));
		System.out.println(cg.divide(2,4));
		cg.shiftY(10);
		System.out.println(cg.getPoint().getY());
		System.out.println(cg.getPoint().getX());
		// 0,10
		// 10, 10
		// 100 + 0
		// System.out.println(Math.sqrt(100+0));
		System.out.println(cg.distance(10,10));

		// cg.stop();
		// System.out.println(cg.checkBattery());
		// cg.shiftX(10);
		// System.out.println(cg.getPoint().getX());
		
	}
}
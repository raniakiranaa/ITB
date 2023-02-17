/**
 * DuniaRobot.java
 * program utama
 * @author 18221168 Rania Sasi Kirana
 */


import java.util.Scanner;

public class DuniaRobot {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int jenis = input.nextInt();

		if (jenis == 1){
			int numberOfParts = input.nextInt();
			int totalTransformation = input.nextInt();
			boolean isActive_1 = input.nextBoolean();
			Bumblebee bumblebee = new Bumblebee(numberOfParts, isActive_1);
			for (int i = 0; i < totalTransformation; i++){
				bumblebee.addTransformation();
			}

			System.out.println(bumblebee.toString());
			System.out.println("Jumlah transformasi: " + bumblebee.getTotalTransformation());
			System.out.println("Harga robot: " + bumblebee.getPrice());
		} else if (jenis == 2){
			long price = input.nextLong();
			int totalModel = input.nextInt();
			Sirik sirik = new Sirik(price);
			for (int i = 0; i < totalModel; i++){
				sirik.addModel();
			}

			System.out.println(sirik.toString());
			System.out.println("Jumlah model: " + sirik.getTotalModel());
			System.out.println("Harga robot: " + sirik.getPrice());
		} else if (jenis == 3){
			long mileage = input.nextLong();
			boolean isActive_2 = input.nextBoolean();
			WallE walle = new WallE(mileage, isActive_2);

			System.out.println(walle.toString());
			System.out.println("Jumlah mileage: " + walle.getMileage());
			System.out.println("Harga robot: " + walle.getPrice());
		}
	}
}
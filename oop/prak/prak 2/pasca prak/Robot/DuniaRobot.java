/**
 * DuniaRobot.java
 * Program Utama
 * @author 18221168 Rania Sasi Kirana
*/

import java.util.Scanner;

public class DuniaRobot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        if (num == 1){
            int numberOfParts = input.nextInt();
            int totalTransformation = input.nextInt();
            boolean isActive = input.nextBoolean();

            Bumblebee bumblebee = new Bumblebee(numberOfParts, isActive);
            for (int i = 0; i < totalTransformation; i++){
                bumblebee.addTransformation();
            }

            System.out.println(bumblebee.toString());
            System.out.println("Jumlah transformasi: " + bumblebee.getTotalTransformation());
            System.out.println("Harga robot: " + bumblebee.getPrice());
        } else if (num == 2){
            long price = input.nextLong();
            int totalModel = input.nextInt();

            Sirik sirik = new Sirik(price);
            for (int i = 0; i < totalModel; i++){
                sirik.addModel();
            }

            System.out.println(sirik.toString());
            System.out.println("Jumlah model: " + sirik.getTotalModel());
            System.out.println("Harga robot: " + sirik.getPrice());
        } else if (num == 3){
            long mileage = input.nextLong();
            boolean isActive = input.nextBoolean();

            WallE walle = new WallE(mileage, isActive);

            System.out.println(walle.toString());
            System.out.println("Jumlah mileage: " + walle.getMileage());
            System.out.println("Harga robot: " + walle.getPrice());
        }

        input.close();
    }
}
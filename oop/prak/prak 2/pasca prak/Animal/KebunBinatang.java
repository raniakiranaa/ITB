/**
 * KebunBinatang.java
 * program utama 
 * @author 18221168 Rania Sasi Kirana
 */

import java.util.Scanner;

public class KebunBinatang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        long children = input.nextLong();
        if (num == 1){
            long basePower = 5;
            int jumlahTelur = input.nextInt();

            Elang elang = new Elang(basePower);
            elang.increaseChild(children);
            for (int i = 0; i < jumlahTelur; i++){
                elang.bertelur();
            }

            System.out.println(elang.toString());
            System.out.println("Jumlah Telur: " + elang.getJumlahTelur());
            System.out.println("Animal Power: " + elang.getAnimalPower());
        } else if (num == 2){
            long basePower = 10;
            int jumlahGading = input.nextInt();

            Gajah gajah = new Gajah(basePower, jumlahGading);
            gajah.increaseChild(children);

            System.out.println(gajah.toString());
            System.out.println("Jumlah Gading: " + gajah.getJumlahGading());
            System.out.println("Animal Power: " + gajah.getAnimalPower());

        } else if (num == 3){
            long basePower = 10;
            boolean kawanan = input.nextBoolean();

            Serigala serigala = new Serigala(basePower, kawanan);
            serigala.increaseChild(children);

            System.out.println(serigala.toString());
            if (!kawanan){
                System.out.println("Serigala tidak berada di dalam kawanan");
            } else {
                System.out.println("Serigala berada di dalam kawanan");
            }
            System.out.println("Animal Power: " + serigala.getAnimalPower());
        }

        input.close();
    }
}
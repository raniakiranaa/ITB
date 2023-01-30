import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Kendaraan kendaraan = new Kendaraan();
        kendaraan.printInfo();

        Scanner input = new Scanner(System.in);
        int lamaSewa = input.nextInt();

        System.out.println("Biaya sewa: " + kendaraan.biayaSewa(lamaSewa));

        int nomor = input.nextInt();
        String kategori = input.next();
        String merk = input.next();
        int tahun = input.nextInt();

        Kendaraan kendaraan1 = new Kendaraan(nomor, kategori, merk, tahun);
        kendaraan1.printInfo();

        int lamaSewa1 = input.nextInt();

        System.out.println("Biaya sewa: " + kendaraan1.biayaSewa(lamaSewa1));
    }
}
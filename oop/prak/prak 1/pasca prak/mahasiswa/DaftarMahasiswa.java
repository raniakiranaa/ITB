import java.util.Scanner;

public class DaftarMahasiswa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        String nim = input.nextLine();
        int sks = input.nextInt();
        int tambahan = input.nextInt();

        input.close();

        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, sks);
        System.out.println("Nama mahasiswa: " + mahasiswa.getNama());
        System.out.println("NIM mahasiswa: " + mahasiswa.getNim());
        System.out.println("SKS mahasiswa: " + mahasiswa.getSks());
        System.out.println("Jumlah mahasiswa: " + mahasiswa.getJumlahMahasiswa());
        mahasiswa.tambahSks(tambahan);
        System.out.println("Total Revisi SKS mahasiswa: " + mahasiswa.getSks());

    }
}
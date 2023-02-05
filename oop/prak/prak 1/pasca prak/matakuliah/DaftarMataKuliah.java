import java.util.Scanner;

public class DaftarMataKuliah {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String kode = input.next();
        String nama = input.next();
        int sks = input.nextInt();
        String dosen = input.next();
        int kapasitas = input.nextInt();
        int tambahan = input.nextInt();

        input.close();

        MataKuliah mk = new MataKuliah(kode, nama, sks, dosen, kapasitas);
        System.out.println("Kode Mata Kuliah: " + mk.getKode());
        System.out.println("Nama Mata Kuliah: " + mk.getNama());
        System.out.println("SKS Mata Kuliah: " + mk.getSks());
        System.out.println("Nama Dosen: " + mk.getDosen());
        System.out.println("Kapasitas Kuliah: " + mk.getKapasitas());
        mk.tambahKapasitas(tambahan);
        System.out.println("Total Revisi Kapasitas Kuliah: " + mk.getKapasitas());
    }
}
import java.util.Scanner;

public class DaftarMataKuliah {
	public static void main (String[] args){
		// Scanner input = new Scanner(System.in);
		// String kode = input.next();
		// String nama = input.next();
		// int sks = input.nextInt();
		// String dosen = input.next();
		// int kapasitas = input.nextInt();
		// int tambahan = input.nextInt();
		// double nilai = input.nextInt();

		// input.close();

		MataKuliah mk = new MataKuliah("II", "hai", 1, "woi", 100);
		IndeksMataKuliah imk = new IndeksMataKuliah(mk, "hy", 2.0);

		// System.out.println("Kode Mata Kuliah: " + mk.getKode());
		// System.out.println("Nama Mata Kuliah: " + mk.getNama());
		// System.out.println("SKS Mata Kuliah: " + mk.getSks());
		// System.out.println("Nama Dosen: " + mk.getDosen());
		// System.out.println("Kapasitas Kuliah: " + mk.getKapasitas());
		// mk.tambahKapasitas(tambahan);
		// System.out.println("Total Revisi Kapasitas Kuliah: " + mk.getKapasitas());	

		// System.out.println(imk.getNama());
		// System.out.println(imk.getNilai());
		// System.out.println(imk.getIndeks());	
		// System.out.println(imk.getMataKuliah().getSks());

		// double nilai_baru = 4.0;
		// imk.ubahNilai(nilai_baru);
		// System.out.println(imk.getNilai());
		// imk.updateIndeks(imk.getNilai());
		// System.out.println(imk.getIndeks());	

		imk.normalisasiNilai(25);
		System.out.println(imk.getNilai());	

	}
}
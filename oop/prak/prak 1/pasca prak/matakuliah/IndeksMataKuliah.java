/**
 * MataKuliah.java
 * Kelas IndeksMataKuliah merupakan sebuah kelas yang memodelkan seorang mahasiswa ITB
 * @author 1822168 Rania Sasi Kirana
 */

public class IndeksMataKuliah {
    // Deklarasi atribut
    private MataKuliah mataKuliah;
    private String nama;
    private String indeks;
    private Double nilai;

    /**
     * Konstruktor
     * 
     * @param mk
     * @param nama
     * @param nilai
     *                   indeks ditentukan berdasarkan nilai yang diperoleh dengan
     *                   ketentuan sebagai berikut
     *                   A -> nilai = 4
     *                   B -> 3.0 <= nilai < 4.0
     *                   C -> 2.0 <= nilai < 3.0
     *                   D -> 1.0 <= nilai < 2.0
     *                   E -> 0.0 <= nilai < 1.0
     *                   Apabila nilai tidak valid, maka indeks dianggap E dan nilai
     *                   dianggap 0
     */
    public IndeksMataKuliah(MataKuliah mk, String nama, Double nilai) {
        this.mataKuliah = mk;
        this.nama = nama;
        this.nilai = nilai;
        updateIndeks(nilai);
    }

    /**
     * Getter mataKuliah
     * 
     * @return mataKuliah
     */
    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    /**
     * Getter nama
     * 
     * @return nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * Getter indeks
     * 
     * @return indeks
     */
    public String getIndeks() {
        return indeks;
    };

    /**
     * Getter nilai
     * 
     * @return nilai
     */
    public Double getNilai() {
        return nilai;
    }

    /**
     * Mengubah nilai mahasiswa
     * 
     * @param nilai nilai baru dari mahasiswa
     */
    public void ubahNilai(Double nilai) {
        this.nilai = nilai;
        updateIndeks(nilai);
    }

    /**
     * Update indeks
     * 
     */
    public void updateIndeks(Double nilai) {
        // this.nilai = nilai;
        // if (nilai >= 0 && nilai < 1){
        //     indeks = "E";
        // } else if (nilai >= 1 && nilai < 2){
        //     indeks = "D";
        // } else if (nilai >= 2 && nilai < 3){
        //     indeks = "C";
        // } else if (nilai >= 3 && nilai < 4){
        //     indeks = "B";
        // } else if (nilai == 4){
        //     indeks = "A";
        // } else {
        //     indeks = "E";
        //     nilai = 0.0;
        // }
        // gapaham beda pake this sama ga anjg
        this.nilai = nilai;
        if (this.nilai >= 0 && this.nilai < 1){
            this.indeks = "E";
        } else if (this.nilai >= 1 && this.nilai <2){
            this.indeks = "D";
        } else if (this.nilai >= 2 && this.nilai <3){
            this.indeks = "C";
        } else if (this.nilai >= 3 && this.nilai <4){
            this.indeks = "B";
        } else if (this.nilai == 4){
            this.indeks = "A";
        } else {
            this.indeks = "E";
            this.nilai = 0.0;
        }
    }

    /**
     * Normalisasi nilai
     * 
     * @param countLulus jumlah mahasiswa yang lulus
     * Normalisasi nilai dilakukan dengan menambahkan nilai saat ini dengan 
     * persentase jumlah mahasiswa yang lulus
     * 
     * Contoh: nilai = 2.0, countLulus = 25, kapasitas = 100
     * normalisasi nilai = 2.0 + (2.0 * (25/100)) = 2.5
     * Apabila hasil normalisasi lebih dari 4.0, maka akan dianggap 4
     */
    public void normalisasiNilai(int countLulus) {
        nilai += (nilai * ((double) countLulus / (double) mataKuliah.getKapasitas()));
        if (nilai>4){
            nilai = 4.0;
        }
        updateIndeks(nilai);
    }

    /**
     * Menghitung kontribusi ke IP
     * Kontribusi ke IP dihitung dari jumlah sks dikali nilai dibagi total sks
     * 
     * @param sks total sks mahasiswa
     */
    public Double kontribusiIP(int sks) {
        return (((double) mataKuliah.getSks()*nilai)/(double) sks);

    }
}
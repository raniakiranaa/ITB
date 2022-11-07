//NIM: 18221168
//Nama: Rania Sasi Kirana
//Pasca Praktikum No. 4
//Deskripsi: Buatlah ADT arrayMhs.c yang merupakan implementasi dari arrayMhs.h

#include <stdio.h>
#include "arrayMhs.h"

/* Indeks yang digunakan [IdxMin..IdxMax] */
/* Jika T adalah TabMhs, cara deklarasi dan akses: */
/* Deklarasi : T : TabMhs */
/* Maka cara akses:
 * T.Neff untuk mengetahui banyaknya elemen
 * T.TI untuk mengakses seluruh nilai elemen tabel
 * T.TI[i] untuk mengakses elemen ke-i */
/* Definisi :
 * Tabel kosong: T.Neff = 0
 * Definisi elemen pertama : T.TI[i] dengan i=1
 * Definisi elemen terakhir yang terdefinisi: T.TI[i] dengan i=T.Neff */

/* ********** KONSTRUKTOR ARRAY ********** */
/* Konstruktor : create tabel kosong */
void MakeEmpty (TabMhs *T)
/* I.S. sembarang */
/* F.S. Terbentuk tabel T kosong dengan kapasitas IdxMax-IdxMin+1 */
/* Untuk membantu pengerjaan praktikum, silahkan gunakan kode berikut untuk fungsi ini */
{
    (*T).Neff = 0;
}

/* ********** SELEKTOR ********** */
/* *** Banyaknya elemen *** */
int NbElmt (TabMhs T)
/* Mengirimkan banyaknya elemen efektif tabel */
/* Mengirimkan nol jika tabel kosong */
/* Untuk membantu pengerjaan praktikum, silahkan gunakan kode berikut untuk fungsi ini */
{
    return T.Neff;
}
/* *** Daya tampung container *** */
int MaxNbEl (TabMhs T)
/* Mengirimkan maksimum elemen yang dapat ditampung oleh tabel */
/* *** Selektor INDEKS *** */
/* Untuk membantu pengerjaan praktikum, silahkan gunakan kode berikut untuk fungsi ini */
{
    return (IdxMax - IdxMin + 1);
}
IdxType GetFirstIdx (TabMhs T)
/* Prekondisi : Tabel T tidak kosong */
/* Mengirimkan indeks elemen pertama */
/* Untuk membantu pengerjaan praktikum, silahkan gunakan kode berikut untuk fungsi ini */
{
    return IdxMin;
}
IdxType GetLastIdx (TabMhs T)
/* Prekondisi : Tabel T tidak kosong */
/* Mengirimkan indeks elemen terakhir */
/* *** Menghasilkan sebuah elemen *** */
/* Untuk membantu pengerjaan praktikum, silahkan gunakan kode berikut untuk fungsi ini */
{
    return T.Neff;
}
ElType GetElmt (TabMhs T, IdxType i)
/* Prekondisi : Tabel tidak kosong, i antara FirstIdx(T)..LastIdx(T) */
/* Mengirimkan elemen tabel yang ke-i */
/* Untuk membantu pengerjaan praktikum, silahkan gunakan kode berikut untuk fungsi ini */
{
    return (T.TI[i]);
}

/* *** Selektor SET : Mengubah nilai TABEL dan elemen tabel *** */
/* Untuk type private/limited private pada bahasa tertentu */
void SetTab (TabMhs Tin, TabMhs *Tout)
/* I.S. Tin terdefinisi, sembarang */
/* F.S. Tout berisi salinan Tin */
/* Assignment THsl -> Tin */
/* Untuk membantu pengerjaan praktikum, silahkan gunakan kode berikut untuk fungsi ini */
{
    (*Tout).Neff = Tin.Neff;
    for(int i = IdxMin; i <= Tin.Neff; i++){
        (*Tout).TI[i] = Tin.TI[i];
    }
}
void SetEl (TabMhs *T, IdxType i, ElType v)
/* I.S. T terdefinisi, sembarang */
/* F.S. Elemen T yang ke-i bernilai v */
/* Mengeset nilai elemen tabel yang ke-i sehingga bernilai v */
/* Untuk membantu pengerjaan praktikum, silahkan gunakan kode berikut untuk fungsi ini */
{
    (*T).TI[i] = v;
    if ((*T).Neff < i){
        (*T).Neff = i;
    }
}
void SetNeff (TabMhs *T, IdxType N)
/* I.S. T terdefinisi, sembarang */
/* F.S. Nilai indeks efektif T bernilai N */
/* Mengeset nilai indeks elemen efektif sehingga bernilai N */
/* Untuk membantu pengerjaan praktikum, silahkan gunakan kode berikut untuk fungsi ini */
{
    (*T).Neff = N;
}
/* ********** Test Indeks yang valid ********** */
boolean IsIdxValid (TabMhs T, IdxType i)
/* Prekondisi : i sembarang */
/* Mengirimkan true jika i adalah indeks yang valid utk ukuran tabel */
/* yaitu antara indeks yang terdefinisi utk container*/
/* Untuk membantu pengerjaan praktikum, silahkan gunakan kode berikut untuk fungsi ini */
{
    return ((i >= IdxMin) && (i <= IdxMax));
}
boolean IsIdxEff (TabMhs T, IdxType i)
/* Prekondisi : i sembarang*/
/* Mengirimkan true jika i adalah indeks yang terdefinisi utk tabel */
/* yaitu antara FirstIdx(T)..LastIdx(T) */
/* Untuk membantu pengerjaan praktikum, silahkan gunakan kode berikut untuk fungsi ini */
{ 
    return ((i >= IdxMin) && (i <= T.Neff));
}
/* ********** TEST KOSONG/PENUH ********** */
/* *** Test tabel kosong *** */
boolean IsEmpty (TabMhs T)
/* Mengirimkan true jika tabel T kosong, mengirimkan false jika tidak */
/* Untuk membantu pengerjaan praktikum, silahkan gunakan kode berikut untuk fungsi ini */
{ 
    return (T.Neff == 0);
}   
/* *** Test tabel penuh *** */
boolean IsFull (TabMhs T)
/* Mengirimkan true jika tabel T penuh, mengirimkan false jika tidak */
/* Untuk membantu pengerjaan praktikum, silahkan gunakan kode berikut untuk fungsi ini */
{
    return (T.Neff == IdxMax);
}
/* ********** BACA dan TULIS dengan INPUT/OUTPUT device ********** */
void TulisIsi (TabMhs T)
{
    if (IsEmpty(T)){
        printf("Tabel kosong\n");
    } else {
        int i;
        for (i=GetFirstIdx(T); i<=GetLastIdx(T); i++){
            printf("%s | %s | %.2f\n", T.TI[i].nama, T.TI[i].nim, T.TI[i].nilai);
        }
    }
}
/* Proses : Menuliskan isi tabel dengan traversal */
/* I.S. T boleh kosong */
/* F.S. Jika T tidak kosong : indeks dan elemen tabel ditulis berderet ke bawah */
/* Contoh print tabel
Test | 12321123 | 3.61
Ini Juga Test | 12321124 | 3.21
Test Lagi | 12321125 | 3.11
*/
/* Jika T kosong : Hanya menulis "Tabel kosong" */

/* ********** KONSTRUKTOR MAHASISWA ********** */
ElType MakeMahasiswa (char* Nama, char* NIM, float Nilai)
{
    ElType Mahasiswa;
    Mahasiswa.nama = Nama;
    Mahasiswa.nim = NIM;
    Mahasiswa.nilai = Nilai;
    return Mahasiswa;
}
/* Membentuk sebuah Mahasiswa dari komponen-komponennya */
/* I.S. Nama, NIM, Nilai terdefinisi */
/* F.S. Mahasiswa M terbentuk dengan Nama, NIM, Nilai yang sesuai */

/* ********** OPERATOR STATISTIK MAHASISWA ********** */
float RataRata (TabMhs T)
{
    int i;
    float sum = 0, rata = 0;
    int count = 0;
    for (i=GetFirstIdx(T); i<=GetLastIdx(T); i++){
        sum += T.TI[i].nilai;
        count ++;
    }
    rata = sum/count;
    return rata;
}
/* I.S. Tabel T tidak kosong */
/* F.S. Menghasilkan nilai rata-rata dari elemen tabel */
float Max (TabMhs T)
{
    float max = T.TI[GetFirstIdx(T)].nilai;
    int i;
    for (i=GetFirstIdx(T); i<=GetLastIdx(T); i++){
        if (T.TI[i].nilai > max){
            max = T.TI[i].nilai;
        }
    }
    return max;
}
/* I.S. Tabel T tidak kosong */
/* F.S. Menghasilkan nilai maksimum dari elemen tabel */
float Min (TabMhs T)
{
    float min = T.TI[GetFirstIdx(T)].nilai;
    int i;
    for (i=GetFirstIdx(T); i<=GetLastIdx(T); i++){
        if (T.TI[i].nilai < min){
            min = T.TI[i].nilai;
        }
    }
    return min;
}
/* I.S. Tabel T tidak kosong */
/* F.S. Menghasilkan nilai minimum dari elemen tabel */
char *MaxNama (TabMhs T)
{
    int i, count = 0;
    char* nama_max;
    char* nim_max;
    for (i=GetFirstIdx(T); i<=GetLastIdx(T); i++){
        if(T.TI[i].nilai == Max(T)){
            count ++;
            if (count == 1){
                nim_max = T.TI[i].nim;
                nama_max = T.TI[i].nama;
            } else {
                if (nim_max > T.TI[i].nim){
                    nim_max = T.TI[i].nim;
                    nama_max = T.TI[i].nama;
                }
            }
        }
    }
    return nama_max;
}
/* I.S. Tabel T tidak kosong */
/* F.S. Menghasilkan nama mahasiswa dengan nilai tertinggi */
/* Jika ada lebih dari satu mahasiswa dengan nilai tertinggi, maka yang diambil yang nim lebih rendah */
char *MinNama (TabMhs T)
{
    int i, count = 0;
    char* nama_min;
    char* nim_min;
    for (i=GetFirstIdx(T); i<=GetLastIdx(T); i++){
        if(T.TI[i].nilai == Min(T)){
            count ++;
            if (count == 1){
                nim_min = T.TI[i].nim;
                nama_min = T.TI[i].nama;
            } else {
                if (nim_min > T.TI[i].nim){
                    nim_min = T.TI[i].nim;
                    nama_min = T.TI[i].nama;
                }
            }
        }
    }
    return nama_min;
}
/* I.S. Tabel T tidak kosong */
/* F.S. Menghasilkan nama mahasiswa dengan nilai terendah */
/* Jika ada lebih dari satu mahasiswa dengan nilai terendah, maka yang diambil yang nim lebih rendah */
int JumlahJurusan (TabMhs T, char* Jurusan)
{
    int sum = 0, i, j, jumlah_mahasiswa;
    for (i=GetFirstIdx(T); i<=GetLastIdx(T); i++){
        int cek = 0;
        for (j=0; j<3; j++){
            if(Jurusan[j] == T.TI[i].nim[j]){
                cek++;
            }
        }
        if (cek == 3){
            jumlah_mahasiswa++;
        }
    }
    return jumlah_mahasiswa;
}
/* I.S. Tabel T tidak kosong */
/* F.S. Menghasilkan jumlah mahasiswa yang berasal dari jurusan Jurusan, yang berbentuk 3 angka (contoh: 182) */
/* Jika tidak ada mahasiswa yang berasal dari jurusan Jurusan, maka menghasilkan 0 */


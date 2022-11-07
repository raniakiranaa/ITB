// NIM: 18221168
// Nama: Rania Sasi Kirana
// Tanggal: 1 Oktober 2022
// Topik Praktikum: Mesin Kata
// Deskripsi: pra prak no 2
// Dengan menggunakan implementasi ADT Mesin Karakter yang telah Anda buat di No 1, buatlah fungsi bernama 
// hitungkarakter yang dapat menghitung jumlah kemunculan karakter pada suatu pita karakter yang didapatkan 
// dari stdin dan mengembalikan nilai tersebut dengan spesifikasi fungsi sebagai berikut.  

#include <stdio.h>
#include "mesinkarakter.h"

int hitungkarakter(char karakter)
{
    int count = 0;
    START();
    while (!(IsEOP())){
        if (GetCC() == karakter){
            count++;
        }
        ADV();
    }
    return count;
}
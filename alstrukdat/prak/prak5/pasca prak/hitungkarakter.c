// NIM: 18221168
// Nama: Rania Sasi Kirana
// Tanggal: 4 Oktober 2022
// Topik Praktikum: ADT Mesin Kata
// Deskripsi: Pasca Prak No. 2
// menghitung jumlah kemunculan karakter pada suatu pita karakter

#include <stdio.h>
#include "mesinkarakter.h"

int hitungkarakter(char karakter)
{
    int count=0;
    START();
    while (!(IsEOP())){
        if (GetCC()==karakter){
            count++;
        }
        ADV();
    }
    return count;
}
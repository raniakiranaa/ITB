// NIM: 18221168
// Nama: Rania Sasi Kirana
// Tanggal: 4 Oktober 2022
// Topik Praktikum: ADT Mesin Kata
// Deskripsi: Pasca Prak No. 4
// Diberikan sebuah kata. Buatlah fungsi hitungfrekuensi yang memiliki kegunaan untuk menghitung jumlah kemunculan kata 
// 'tiga' pada kata tersebut. Kata 'tiga' dapat tersusun atas semua huruf lowercase, semua huruf uppercase ataupun campuran

//Input:
// ASDFtIgAFFFF.

// Output:
// 1

// Implementasikan file hitungfrekuensi.h dan submit file dengan nama hitungfrekuensi.c. 
// Gunakan mesinkarakter.h dan mesinkarakter.c untuk membantu menyelesaikan soal berikut

#include <stdio.h>
#include "hitungfrekuensi.h"

int hitungfrekuensi()
{
    int count=0;
    START();
    while (!(IsEOP())){
        if (GetCC()=='t' || GetCC()=='T'){
            ADV();
            if (GetCC()=='i' || GetCC()=='I'){
                ADV();
                if (GetCC()=='g' || GetCC()=='G'){
                    ADV();
                    if (GetCC()=='a' || GetCC()=='A'){
                        ADV();
                        count++;
                    }
                }
            }
        } else {
            ADV();
        }
    }
    return count;
}
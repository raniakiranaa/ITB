//NIM: 18221168
//Nama: Rania Sasi Kirana
//Pasca Praktikum No. 6
//Deskripsi: 
//Budi sedang bermain game dengan Andi. Dalam permainan tersebut, Budi harus bisa menghapus mencari nilai 
//minimal dan maksimal dari sebuah list, menghapusnya dari urutan tersebut, kemudian menambahkan kedua nilai 
//tersebut pada urutan terakhir list(nilai minimal ditambahkan terlebih dahulu dibandingkan nilai maksimal). 

/* Contoh
Input:
1 2 6 4 3

Output:
2 4 3 1 6
*/

#include <stdio.h>
#include "MinMax.h"

List MinMax(List L)
{
    //cari nilai max
    ElType max = Get(L, FirstIdx(L));
    IdxType idxmax = FirstIdx(L);
    int i;
    for (i=FirstIdx(L)+1; i<=LastIdx(L); i++){
        if (Get(L,i)>max){
            max = Get(L,i);
        }
    }

    //cari nilai min
    ElType min = Get(L, FirstIdx(L));
    IdxType idxmin = FirstIdx(L);
    for (i=FirstIdx(L); i<=LastIdx(L); i++){
        if (Get(L,i)<min){
            min = Get(L,i);
        }
    }

    //hapus nilai max dan min dari list
    //tambah case klo ada angka yg sama
    int count_max=0, count_min=0;
    for(i=FirstIdx(L); i<=LastIdx(L); i++){
        if(Get(L,i) == max){
            DeleteAt(&L, i);
            count_max ++;
        }
    }

    for(i=FirstIdx(L); i<=LastIdx(L); i++){
        if(Get(L,i) == min){
            DeleteAt(&L, i);
            count_min ++;
        }
    }

    //tambah nilai min dan max di akhir list
    for (i=1; i<=count_min; i++){
        InsertLast(&L, min);
    }
    for (i=1; i<=count_max; i++){
        InsertLast(&L, max);
    }

    return L;
}
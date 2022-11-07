//NIM: 18221168
//Nama: Rania Sasi Kirana
//Tanggal: 5 November 2022
//Topik Praktikum: struktur berkait
//Deskripsi: Pra prak no 3
//Implementasi OddEvenList.h

#include <stdio.h>
#include "OddEvenList.h"

void OddEvenList(List L, List *Odd, List *Even)
{
    CreateEmpty(Odd);
    CreateEmpty(Even);
    address p = First(L);
    while (p != Nil){
        if (Info(p) % 2 == 0){
            InsVLast(Even, Info(p));
        } else {
            InsVLast(Odd, Info(p));
        }
        p = Next(p);
    }

    // SORT
    address p1, p2;
    infotype temp;
    p1 = First(*Odd);
    while (p1 != Nil)
    {
        p2 = Next(p1);
        while (p2 != Nil)
        {
            if (Info(p1) > Info(p2))
            {
                temp = Info(p1);
                Info(p1) = Info(p2);
                Info(p2) = temp;
            }
            p2 = Next(p2);
        }
        p1 = Next(p1);
    }

    p1 = First(*Even);
    while (p1 != Nil)
    {
        p2 = Next(p1);
        while (p2 != Nil)
        {
            if (Info(p1) > Info(p2))
            {
                temp = Info(p1);
                Info(p1) = Info(p2);
                Info(p2) = temp;
            }
            p2 = Next(p2);
        }
        p1 = Next(p1);
    }

}

// int main()
// {
//     List L;
//     CreateEmpty(&L);
//     List Odd;
//     List Even;
//     int i;
//     for (i=0; i<100; i++){
//         InsVFirst(&L, i);
//     }
//     OddEvenList(L, &Odd, &Even);
//     PrintInfo(Odd);
//     printf("\n");
//     PrintInfo(Even);
//     printf("\n");
// }
    /* Memisahkan elemen ganjil dan genap dari list L kedalam dua list baru secara mengurut membesar*/
    /* I.S: List L TIDAK mungkin kosong dan memiliki nilai lebih dari sama dengan 0(value>=0), List Odd dan Even kosong*/
    /* F.S: List Odd memiliki elemen bernilai ganjil mengurut membesar, List Even memiliki elemen bernilai genap mengurut membesar
            List L TIDAK PERLU DIDEALOKASI*/
    /*Contoh:
        Input:
            L: [0,3,1,4,5]
            Odd: []
            Even: []
        Output:
            L: [0,3,1,4,5]
            Odd: [1,3,5]
            Even: [0,4] */
    /*Note: 
        1. Bilangan 0 merupakan bilangan genap
        2. Buatlah List Odd dan Even terlebih dahulu*/
 
// NIM: 18221168
// Nama: Rania Sasi Kirana
// Tanggal: 5 November 2022
// Topik Praktikum: Struktur berkait
// Deskripsi: Pasca prak no 4
// remove duplicate in list

#include <stdio.h>
#include "removeDuplicate.h"

List removeDuplicate(List l)
{/*
    Diberikan sebuah list linier yang sudah terurut membesar,
    kembalikan list baru yang elementnya unik
    Contoh input/output:
    input:  [1,1,2,2,3,4,5,6,6,7]
    output: [1,2,3,4,5,6,7]

    input:  [1,1,1,1,1,1]
    output: [1]
*/
    List L1;
    CreateEmpty(&L1);
    InsVLast(&L1, Info(First(l)));
    address p = Next(First(l));
    address found;
    while (p != Nil){
        found = Search(L1, Info(p));
        if (found == Nil){
            InsVLast(&L1, Info(p));
        }
        p = Next(p);
    }
    return L1;
}

// int main()
// {
//     List l;
//     CreateEmpty(&l);
//     InsVLast(&l, 1);
//     InsVLast(&l, 1);
//     InsVLast(&l, 2);
//     InsVLast(&l, 2);
//     InsVLast(&l, 3);
//     InsVLast(&l, 4);
//     InsVLast(&l, 5);
//     InsVLast(&l, 6);
//     InsVLast(&l, 6);
//     InsVLast(&l, 7);
//     PrintInfo(l);
//     printf("\n");
//     List l1 = removeDuplicate(l);
//     PrintInfo(l1);
//     return 0;
// }
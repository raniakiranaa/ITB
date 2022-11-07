// Nama : Rania Sasi Kirana
// NIM : 18221168
// Tanggal : 15 Oktober 2022
// Topik Praktikum : Queue
// Pra Praktikum 6 No. 3
// Deskripsi: Implementasi reverse.h

#include <stdio.h>
#include "reverse.h"

void transferReverse(Queue* q1, Queue* q2)
{
// Proses: Memindahkan tiap elemen q1 ke q2 dengan urutan yang terbalik
// I.S.: q1 tidak kosong, q2 kosong. q1 dan q2 memiliki panjang yang sama
// F.S.: q1 kosong, q2 berisi elemen-elemen yang tadinya milik q1 dengan urutan yang terbalik
    int i, pjg = Length(*q1), temp;
    for (i=0; i<pjg; i++){
        temp = Pop(q1);
        Push(q2, temp);

        int j;
        for (j=0; j<i; j++){
            Push(q2, Pop(q2));
        }
    }
    (*q1).HEAD = NIL;
    (*q1).TAIL = NIL;
}

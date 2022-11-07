// NIM: 18221168
// Nama: Rania Sasi Kirana
// Tanggal: 5 November 2022
// Topik Praktikum: Struktur berkait
// Deskripsi: Pasca prak no 4
// cache

#include <stdio.h>
#include "listlinier.h"

int main()
{
    int N, Q;
    scanf("%d", &N);
    List cache;
    CreateEmpty(&cache);
    int i;
    for (i=1; i<=N; i++){
        InsVLast(&cache, i);
    }
    scanf("%d", &Q);
    List q;
    CreateEmpty(&q);
    int x;
    for (i=1; i<=Q; i++){
        scanf("%d", &x);
        InsVLast(&q, x);
    }
    address p = First(q);
    while (p != Nil){
        address q = Search(cache, Info(p));
        if (q != Nil){
            printf("hit ");
            DelP(&cache, Info(p));
            InsVFirst(&cache, Info(p));
        } else {
            printf("miss ");
            DelLast(&cache, &q);
            InsVFirst(&cache, Info(p));
        }
        PrintInfo(cache);
        printf("\n");
        p = Next(p);
    }
    return 0;
}
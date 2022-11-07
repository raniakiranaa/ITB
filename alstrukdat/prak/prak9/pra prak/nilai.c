#include <stdio.h>
#include "listlinier.h"

int main()
{
    List L;
    List L1;
    CreateEmpty(&L);
    CreateEmpty(&L1);
    int x;
    scanf("%d", &x);
    while (x>=0 && x<=100){
        InsVFirst(&L, x);
        InsVLast(&L1, x);
        scanf("%d", &x);
    }

    // List L1;
    // CreateEmpty(&L1);
    // L1 = L;
    // InversList(&L1);
    if (!(IsEmpty(L))){
        int total = NbElmt(L);
        int max = Max(L);
        int min = Min(L);
        float rata = Average(L);
        printf("%d\n", total);
        printf("%d\n", max);
        printf("%d\n", min);
        printf("%.2f\n", rata);
        PrintInfo(L1);
        printf("\n");
        PrintInfo(L);
        printf("\n");
    } else {
        printf("Daftar nilai kosong\n");
    }
    return 0;
}
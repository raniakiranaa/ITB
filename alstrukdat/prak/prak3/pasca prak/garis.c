#include <stdio.h>
#include "garis.h"

void MakeGARIS(POINT P1, POINT P2, GARIS *L)
{
    PAwal(*L) = P1;
    PAkhir(*L) = P2;
}

void BacaGARIS(GARIS *L)
{
    BacaPOINT(&PAwal(*L));
    BacaPOINT(&PAkhir(*L));
    while(EQ(PAwal(*L),PAkhir(*L))){
        printf("Garis tidak valid\n");
        BacaPOINT(&PAwal(*L));
        BacaPOINT(&PAkhir(*L));
    }
    MakeGARIS(PAwal(*L), PAkhir(*L), L);
}

void TulisGARIS(GARIS L)
{
    printf("(");
    TulisPOINT(PAwal(L));
    printf(",");
    TulisPOINT(PAkhir(L));
    printf(")");
}

float PanjangGARIS(GARIS L)
{
    return (Panjang(PAwal(L), PAkhir(L)));
}

float Gradien(GARIS L)
{
    float x1,x2,y1,y2;
    x1 = Absis(PAwal(L));
    x2 = Absis(PAkhir(L));
    y1 = Ordinat(PAwal(L));
    y2 = Ordinat(PAkhir(L));
    return ((y2-y1)/(x2-x1));
}

boolean IsTegakLurus(GARIS L1, GARIS L2)
{
    return (Gradien(L1)*Gradien(L2) == -1);
}

boolean IsSejajar(GARIS L1, GARIS L2)
{
    return(Gradien(L1)==Gradien(L2));
}

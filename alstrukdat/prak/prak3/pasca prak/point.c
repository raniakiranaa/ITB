#include <stdio.h>
#include <math.h>
#include "point.h"

POINT MakePOINT(float X, float Y)
{
    POINT P;
    Absis(P) = X;
    Ordinat(P) = Y;
    return P;
}

void BacaPOINT(POINT *P)
{
    float X,Y;
    scanf("%f %f", &X, &Y);
    *P = MakePOINT(X,Y);
}

void TulisPOINT(POINT P)
{
    printf("(%.2f,%.2f)", Absis(P), Ordinat(P));
}

boolean EQ(POINT P1, POINT P2)
{
    return (Absis(P1)==Absis(P2) && Ordinat(P1)==Ordinat(P2));
}

boolean NEQ(POINT P1, POINT P2)
{
    return (Absis(P1)!=Absis(P2) || Ordinat(P1)!=Ordinat(P2));
}

boolean IsOrigin(POINT P)
{
    return(Absis(P)==0 && Ordinat(P)==0);
}

boolean IsOnSbX(POINT P)
{
    return(Ordinat(P)==0);
}

boolean IsOnSbY(POINT P)
{
    return(Absis(P)==0);
}

int Kuadran(POINT P)
{
    if(Absis(P)>0 && Ordinat(P)>0){
        return 1;
    } else if (Absis(P)>0 && Ordinat(P)<0){
        return 2;
    } else if (Absis(P)<0 && Ordinat(P)<0){
        return 3;
    } else if (Absis(P)<0 && Ordinat(P)>0){
        return 4;
    }
}

POINT PlusDelta(POINT P, float deltaX, float deltaY)
{
    POINT P1;
    Absis(P1) = Absis(P) + deltaX;
    Ordinat(P1) = Ordinat(P) + deltaY;
    return P1;

}

void Geser(POINT *P, float deltaX, float deltaY)
{
    Absis(*P) = Absis(*P) + deltaX;
    Ordinat(*P) = Ordinat(*P) + deltaY;
}

float Jarak0(POINT P)
{
    return(sqrt(Absis(P)*Absis(P) + Ordinat(P)*Ordinat(P)));
}

float Panjang(POINT P1, POINT P2)
{
    return sqrt((Absis(P1)-Absis(P2))*(Absis(P1)-Absis(P2)) + (Ordinat(P1)-Ordinat(P2))*(Ordinat(P1)-Ordinat(P2)));
}
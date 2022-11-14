// NIM: 18221168
// Nama: Rania Sasi Kirana
// Tanggal: 13 November 2022
// Topik Praktikum: ADT List dengan Double Pointer
// Deskripsi: Pra prak No.1
// Implementasi listdp.h

#include <stdio.h>
#include <stdlib.h>
#include "listdp.h"

boolean IsEmpty (List L)
{
    return ((First(L) == Nil) && (Last(L) == Nil));
}

void CreateEmpty (List *L)
{
    First(*L) = Nil;
    Last(*L) = Nil;
}

address Alokasi (infotype X)
{
    address p;
    p = (address) malloc (sizeof(ElmtList));
    if (p != Nil){
        Info(p) = X;
        Next(p) = Nil;
        Prev(p) = Nil;
    }
    return p;
}

void Dealokasi (address P)
{
    Next(P) = Nil;
    Prev(P) = Nil;
    free(P);
}

address Search (List L, infotype X)
{
    address p = First(L);
    while (p != Nil && Info(p) != X){
        p = Next(p);
    }
    return p;
}

void InsVFirst (List *L, infotype X)
{
    address p = Alokasi(X);
    if (p != Nil){
        InsertFirst(L, p);
    }
}

void InsVLast (List *L, infotype X)
{
    address p = Alokasi(X);
    if (p != Nil){
        InsertLast(L, p);
    }
}

void DelVFirst (List *L, infotype *X)
{
    address p;
    DelFirst(L, &p);
    *X = Info(p);
    Dealokasi(p);
}

void DelVLast (List *L, infotype *X)
{
    address p;
    DelLast(L, &p);
    *X = Info(p);
    Dealokasi(p);
}

void InsertFirst (List *L, address P)
{
    Next(P) = First(*L);
    if (IsEmpty(*L)){
        Last(*L) = P;
    } else {
        Prev(First(*L)) = P;
    }
    First(*L) = P;
}

void InsertLast (List *L, address P)
{
    Prev(P) = Last(*L);
    if (IsEmpty(*L)){
        First(*L) = P;
    } else {
        Next(Last(*L)) = P;
    }
    Last(*L) = P;
}

void InsertAfter (List *L, address P, address Prec)
{
    if (Prec == Last(*L)){
        InsertLast(L, P);
    } else {
        Next(P) = Next(Prec);
        Prev(P) = Prec;
        Prev(Next(Prec)) = P;
        Next(Prec) = P;
    }
}

void InsertBefore (List *L, address P, address Succ)
{
    if (Succ == First(*L)){
        InsertFirst(L, P);
    } else {
        address p = First(*L);
        while (Next(p) != Succ){
            p = Next(p);
        }
        InsertAfter(L, P, p);
    }
}

void DelFirst (List *L, address *P)
{
    *P = First(*L);
    if (First(*L) == Last(*L)){
        First(*L) = Nil;
        Last(*L) = Nil;
    } else {
        Prev(Next(First(*L))) = Nil;
        First(*L) = Next(*P);
    }
}

void DelLast (List *L, address *P)
{
    *P = Last(*L);
    if(First(*L) == Last(*L)){
        First(*L) = Nil;
        Last(*L) = Nil;
    } else {
        Next(Prev(Last(*L))) = Nil;
        Last(*L) = Prev(*P);
    }
}

void DelP (List *L, infotype X)
{
    address p = Search(*L, X);
    address loc;
    if (p == First(*L)){
        DelFirst(L, &p);
    } else if (p == Last(*L)){
        DelLast(L, &p);
    } else if (p != Nil){
        loc = Prev(p);
        DelAfter(L, &p, loc);
    }
}

void DelAfter (List *L, address *Pdel, address Prec)
{
    if (Prec != Last(*L)){
        *Pdel = Next(Prec);
        if(*Pdel == Last(*L)){
            DelLast(L, Pdel);
        } else {
            Next(Prec) = Next(Next(Prec));
            Prev(Next(Prec)) = Prec;
        }
    }
}

void DelBefore (List *L, address *Pdel, address Succ)
{
    if (Succ != First(*L)){
        *Pdel = Prev(Succ);
        if (*Pdel == First(*L)){
            DelFirst(L, Pdel);
        } else {
            Prev(Succ) = Prev(Prev(Succ));
            Next(Prev(Succ)) = Succ;
        }
    }
}

void PrintForward (List L)
{
    address p = First(L);
    printf ("[");
    while (p != Last(L)){
        printf("%d, ", Info(p));        
        p = Next(p);
    }
    printf("%d", Info(p));
    printf("]");
}

void PrintBackward (List L)
{
    address p = Last(L);
    printf ("[");
    while (p != First(L)){
        printf("%d, ", Info(p));
        p = Prev(p);
    }
    printf("%d", Info(p));
    printf("]");
}

// int main()
// {
//     List L;
//     CreateEmpty(&L);
//     infotype X;
//     X = 10;
//     address p,x;
//     x = Alokasi(X);
//     InsertLast(&L, x);
//     X = 20;
//     p = Alokasi(X);
//     InsertLast(&L, p);
//     X = 30;
//     p = Alokasi(X);
//     InsertBefore(&L, p, Last((L)));
//     X = 40;
//     p = Alokasi(X);
//     PrintForward(L);
//     PrintBackward(L);

//     return 0;
// }
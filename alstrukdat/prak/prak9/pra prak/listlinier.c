//NIM: 18221168
//Nama: Rania Sasi Kirana
//Tanggal: 5 November 2022
//Topik Praktikum: Struktur berkait
//Deskripsi: Pra prak no 1
//Implementasi listlinier.h

#include <stdio.h>
#include <stdlib.h>
#include "listlinier.h"

boolean IsEmpty (List L)
{
    return (First(L) == Nil);
}

void CreateEmpty (List *L)
{
    First(*L) = Nil;
}

address Alokasi (infotype X)
{
    address P = (address) malloc (sizeof(ElmtList));
    if (P != Nil){  // alokasi berhasil
        Info(P) = X;
        Next(P) = Nil;
        return P;
    } else {
        return Nil;
    }
}

void Dealokasi (address *P)
{
    free(*P);
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
    if (p != Nil){          // Alokasi berhasil
        InsertFirst(L, p);
    }
}

void InsVLast (List *L, infotype X)
{
    address p = Alokasi(X);
    if (p != Nil){              // Alokasi berhasil
        InsertLast(L, p);
    }
}

void DelVFirst (List *L, infotype *X)
{
    address p;
    DelFirst(L, &p);
    *X = Info(p);
    Dealokasi(&p);
}

void DelVLast (List *L, infotype *X)
{
    address p;
    DelLast(L, &p);
    *X = Info(p);
    Dealokasi(&p);
}

void InsertFirst (List *L, address P)
{
    Next(P) = First(*L);
    First(*L) = P;
}

void InsertAfter (List *L, address P, address Prec)
{
    Next(P) = Next(Prec);
    Next(Prec) = P; 
}

void InsertLast (List *L, address P)
{
    if (IsEmpty(*L)){
        Next(P) = Nil;
        First(*L) = P;
    } else {
        address last = First(*L);
        while (Next(last) != Nil){
            last = Next(last);
        }
        Next(last) = P;
    }
}

void DelFirst (List *L, address *P)
{
    *P = First(*L);
    if (Next(*P) == Nil){
        First(*L) = Nil;
    } else {
        First(*L) = Next(*P);
        Next(*P) = Nil;
    }
}

void DelP (List *L, infotype X)
{  
    address p = Search(*L, X);
    if (p != Nil){              // alokasi berhasil
        if (p == First(*L)){    // X ada di elemen pertama
            DelFirst(L, &p);
        } else {
            address prev = First(*L);
            while (Next(prev) != p && Next(prev) != Nil){
                prev = Next(prev);
            }
            Next(prev) = Next(p);
            Next(p) = Nil;
        }
        Dealokasi(&p);
    }
}

void DelLast (List *L, address *P)
{
    if (Next(First(*L)) == Nil){    // hanya ada satu elemen
        DelFirst(L, P);
    } else {
        address last = First(*L);
        while (Next(Next(last)) != Nil){
            last = Next(last);
        }
        DelAfter(L, P, last);
    }
}

void DelAfter (List *L, address *Pdel, address Prec)
{
    *Pdel = Next(Prec);
    if (Next(*Pdel) == Nil){    // Pdel adalah elemen terakhir
        Next(Prec) = Nil;
    } else {
        Next(Prec) = Next(*Pdel);
        Next(*Pdel) = Nil;
    }
}

void PrintInfo (List L)
{
    printf ("[");
    address p = First(L);
    while (p != Nil){
        printf("%d", Info(p));
        p = Next(p);
        if (p != Nil){
            printf(",");
        }
    }
    printf("]");
}

int NbElmt (List L)
{
    int count = 0;
    if (!(IsEmpty(L))){
        address p = First(L);
        while (p != Nil){
            count++;
            p = Next(p);
        }
    }
    return count;
}

infotype Max (List L)
{
    address p = First(L);
    infotype max = Info(p);
    while (p != Nil){
        if (max<Info(p)){
            max = Info(p);
        }
        p = Next(p);
    }
    return max;
}

address AdrMax (List L)
{
    infotype max = Max(L);
    address p = First(L);
    while (p != Nil && Info(p) != max){
        p = Next(p);
    }
    return p;
}

infotype Min (List L)
{
    address p = First(L);
    infotype min = Info(p);
    while (p != Nil){
        if (min>Info(p)){
            min = Info(p);
        }
        p = Next(p);
    }
    return min;   
}

address AdrMin (List L)
{
    infotype min = Min(L);
    address p = First(L);
    while (p != Nil && Info(p) != min){
        p = Next(p);
    }
    return p;
}

float Average (List L)
{
    float sum = 0;
    address p = First(L);
    while (p != Nil){
        sum += Info(p);
        p = Next(p);
    }
    return (sum/NbElmt(L));
}

void InversList (List *L)
{
    if (!(IsEmpty(*L))){
        address p = First(*L);
        address last;
        while (Next(p) != Nil){
            p = Next(p);
        }
        last = p;
        address prev;
        while (p != First(*L)){
            prev = First(*L);
            while (Next(prev) != p){
                prev = Next(prev);
            }
            Next(p) = prev;
            p = prev;
        }
        Next(p) = Nil;
        First(*L) = last;
    }
}

void Konkat1 (List *L1, List *L2, List *L3)
{
    CreateEmpty(L3);
    First(*L3) = First(*L1);
    First(*L1) = Nil;
    address last = First(*L3);
    while (Next(last) != Nil){
        last = Next(last);
    }

    Next(last) = First(*L2);
    First(*L2) = Nil;
}
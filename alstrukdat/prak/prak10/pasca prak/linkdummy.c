// NIM: 18221168
// Nama: Rania Sasi Kirana
// Tanggal: 14 November 2022
// Topik Praktikum: ADT List dengan Double Pointer
// Deskripsi: Prak No.3
// Implementasi linkdummystack.h

#include <stdio.h>
#include <stdlib.h>
#include "linkdummy.h"

// elemen dummy adalah elemen dengan Info(dummy) = 0

/* PROTOTYPE */
/****************** TEST LIST KOSONG ******************/
boolean IsEmpty(List L)
/* Mengirim true jika list kosong: First(L) = dummy@
dan Last(L) = dummy@ */
{
    return (First(L) == Last(L));
}

/****************** PEMBUATAN LIST KOSONG ******************/
void MakeEmpty(List *L)
/* I.S. sembarang */
/* F.S. Terbentuk list L kosong, dengan satu elemen dummy */
/* Jika gagal maka First = Last = Nil dan list gagal terbentuk */
{
    address dummy = Alokasi(0);
    if (dummy != Nil){
        First(*L) = dummy;
        Last(*L) = dummy;
    } else {
        First(*L) = Nil;
        Last(*L) = Nil;
    }
}

/****************** MANAJEMEN MEMORI ******************/
address Alokasi (ElType X)
/* Mengirimkan address hasil alokasi sebuah elemen */
/* Jika alokasi berhasil, maka address tidak nil. */
/* Misalnya: menghasilkan P, maka Info(P)=X, Next(P)=Nil, Prev(P)=Nil */
/* Jika alokasi gagal, mengirimkan Nil. */
{
    address p;
    p = (address) malloc (sizeof(Node));
    if (p != Nil){
        Info(p) = X;
        Next(p) = Nil;
    }
    return p;
}
void Dealokasi (address P)
/* I.S. P terdefinisi */
/* F.S. P dikembalikan ke sistem */
/* Melakukan dealokasi/pengembalian address P */
{
    free(P);
}

/****************** SEARCHING ******************/
address Search(List L, ElType X)
/* Mencari apakah ada node list dengan info(P) = X */
/* Jika ada, mengirimkan address node tersebut. */
/* Jika tidak ada, mengirimkan Nil */
{
    boolean found = false;
    address p = First(L);
    if (First(L) != Last(L)){
        while (p != Last(L) && !found){
            if (Info(p) == X){
                found = true;
            } else {
                p = Next(p);
            }
        }
    }

    if (found){
        return p;
    } else {
        return Nil;
    }
}

/****************** PRIMITIF BERDASARKAN NILAI ******************/
/*** PENAMBAHAN ELEMEN ***/
void InsertFirst(List *L, ElType X)
/* I.S. List L terdefinisi */
/* F.S. Menambahkan elemen X sebagai elemen pertama List L */
{
    address p = Alokasi(X);
    if (p != Nil){
        Next(p) = First(*L);
        First(*L) = p;
    }
}
void InsertLast(List *L, ElType X)
/* I.S. List L terdefinisi */
/* F.S. X ditambahkan sebagai elemen terakhir yang baru, */
/* yaitu menjadi elemen sebelum elemen dummy */
/* Alamat elemen dummy tidak berubah */
{
    address p = Alokasi(X);
    if (p != Nil){
        if (IsEmpty(*L)){
            InsertFirst(L, X);
        } else {
            address last = First(*L);
            while (Next(last) != Last(*L)){
                last = Next(last);
            }
            Next(last) = p;
            Next(p) = Last(*L);
        }
    }
}

/*** PENGHAPUSAN ELEMEN ***/
void DeleteFirst(List *L, ElType *X)
/* I.S. List tidak kosong */
/* F.S. X adalah elemen pertama list sebelum penghapusan */
/* Elemen list berkurang satu (mungkin menjadi kosong) */
/* First element yg baru adalah suksesor elemen pertama yang lama */
{
    address p = First(*L);
    *X = Info(p);
    First(*L) = Next(First(*L));
    free(p);
}
void DeleteLast(List *L, ElType *X)
/* I.S. List tidak kosong */
/* F.S. X adalah terakhir sebelum dummy pada list sebelum penghapusan */
/* Elemen list berkurang satu (mungkin menjadi kosong) */
{
    address last, prevlast;
    last = First(*L);
    prevlast = Nil;

    while (Next(last) != Last(*L)){
        prevlast = last;
        last = Next(last);
    }

    *X = Info(last);
    if (prevlast == Nil){
        First(*L) = Last(*L);
    } else {
        Next(prevlast) = Last(*L);
    }
    free(last);
}

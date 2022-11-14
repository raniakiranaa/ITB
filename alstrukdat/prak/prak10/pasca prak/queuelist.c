// NIM: 18221168
// Nama: Rania Sasi Kirana
// Tanggal: 14 November 2022
// Topik Praktikum: ADT List dengan Double Pointer
// Deskripsi: Prak No.1
// Implementasi queuelist.h

#include <stdio.h>
#include <stdlib.h>
#include "queuelist.h"

/* Prototype manajemen memori */
void Alokasi(address *P, infotype X)
/* I.S. Sembarang */
/* F.S. Alamat P dialokasi, jika berhasil maka Info(P)=X dan
        Next(P)=Nil */
/*      P=Nil jika alokasi gagal */
{
    *P = (address) malloc (sizeof(ElmtQueue));
    if (*P != Nil){
        Info(*P) = X;
        Next(*P) = Nil;
    } else {
        *P = Nil;
    }
}
void Dealokasi(address P)
/* I.S. P adalah hasil alokasi, P != Nil */
/* F.S. Alamat P didealokasi, dikembalikan ke sistem */
{
    free(P);
}
boolean IsEmpty(Queue Q)
/* Mengirim true jika Q kosong: HEAD(Q)=Nil and TAIL(Q)=Nil */
{
    return (Head(Q) == Nil && Tail(Q) == Nil);
}
int NbElmt(Queue Q)
/* Mengirimkan banyaknya elemen queue. Mengirimkan 0 jika Q kosong */
{
    int count = 0;
    if (!(IsEmpty(Q))){
        address p = Head(Q);
        count++;
        while (p != Tail(Q)){
            p = Next(p);
            count++;
        }
    }
    return count;
}
/*** Kreator ***/
void CreateEmpty(Queue *Q)
/* I.S. sembarang */
/* F.S. Sebuah Q kosong terbentuk */
{
    Head(*Q) = Nil;
    Tail(*Q) = Nil; 
}
/*** Primitif Add/Delete ***/
void Enqueue(Queue *Q, infotype X)
/* Proses: Mengalokasi X dan menambahkan X pada bagian TAIL dari Q
   jika alokasi berhasil; jika alokasi gagal Q tetap */
/* Pada dasarnya adalah proses insert last */
/* I.S. Q mungkin kosong */
/* F.S. X menjadi TAIL, TAIL "maju" */
{
    address p;
    Alokasi(&p, X);
    if (p != Nil){
        if (IsEmpty(*Q)){
            Head(*Q) = p;
        } else {
            Next(Tail(*Q)) = p;
        }
        Tail(*Q) = p;
    }
}
void Dequeue(Queue *Q, infotype *X)
/* Proses: Menghapus X pada bagian HEAD dari Q dan mendealokasi
   elemen HEAD */
/* Pada dasarnya operasi delete first */
/* I.S. Q tidak mungkin kosong */
/* F.S. X = nilai elemen HEAD pd I.S., HEAD "mundur" */
{
    *X = InfoHead(*Q);
    if (Head(*Q) == Tail(*Q)){
        Head(*Q) = Nil;
        Tail(*Q) = Nil;
    } else {
        address p = Head(*Q);
        Head(*Q) = Next(p);
        Dealokasi(p);
    }
}
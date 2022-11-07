//NIM: 18221168
//Nama: Rania Sasi Kirana
//Tanggal: 29 Oktober 2022
//Topik Praktikum: Set dan Map
//Deskripsi: Pra prak no. 3
//Implementasi hashmap.h

#include <stdio.h>
#include "hashmap.h"

/**
 * Modul Hash HashMap
 * Implementasi Hash HashMap dengan Open Addressing
*/

/* ********* Prototype ********* */

/* *** Konstruktor/Kreator *** */
void CreateEmpty(HashMap *M)
{
/* I.S. Sembarang */
/* F.S. Membuat sebuah HashMap M kosong berkapasitas MaxEl */
/* Ciri HashMap kosong : count bernilai Nil dengan seluruh isi key & value map Undefined */
    (*M).Count = Nil;
    int i;
    for(i=0; i<MaxEl; i++){
        (*M).Elements[i].Key = Undefined;
        (*M).Elements[i].Value = Undefined;
    }
}

/* *** Index Penyimpanan dengan modulo *** */
address Hash(keytype K)
{
/* Menghasilkan indeks penyimpanan dengan operasi modulo ke MaxEl */
    return (K % MaxEl);
}

/* ********** Operator Dasar HashMap ********* */
valuetype Value(HashMap M, keytype k)
{
/* Mengembalikan nilai value dengan key k dari M */
/* Jika tidak ada key k pada M, akan mengembalikan Undefined */
    boolean found = false;
    int i = 0;
    while (i < MaxEl && (!found)){
        if (M.Elements[i].Key == k){
            found = true;
        } else {
            i++;
        }
    }

    if (found){
        return (M.Elements[i].Value);        
    } else {
        return Undefined;
    }
}

void Insert(HashMap *M, keytype k, valuetype v)
{
/* Menambahkan Elmt sebagai elemen HashMap M. */
/* I.S. M mungkin kosong, M tidak penuh
        M mungkin sudah beranggotakan v dengan key k */
/* F.S. v menjadi anggota dari M dengan key k. Jika k sudah ada, operasi tidak dilakukan 
        index yang digunakan untuk menyimpan v adalah hash dari k
        gunakan open addressing linear probing dengan interval 1 jika index sudah terisi    */
    address index = Hash(k);
    boolean found = false;
    while (!found){
        if ((*M).Elements[index].Key != Undefined){     // ada key di M
            if ((*M).Elements[index].Key == k){         // key di index = k
                (*M).Elements[index].Value = v;         // replace value k yang udah ada dengan v
                found = true;
            } else {                                    // key di index != k                       
                index = (index + 1) % MaxEl;            // linear probing
            }
        } else {                                        // tidak ada key di M
            (*M).Elements[index].Key = k;
            (*M).Elements[index].Value = v;
            (*M).Count++;
            found = true;
        }
    }
}

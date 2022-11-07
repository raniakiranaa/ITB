//NIM: 18221168
//Nama: Rania Sasi Kirana
//Tanggal: 1 November 2022
//Topik Praktikum: Set dan Map
//Deskripsi: Pasca prak no. 6
//Implementasi set.h

#include <stdio.h>
#include "set.h"

/* Definisi Set S kosong : S.Count = Nil */
/* S.Count = jumlah element Set */
/* S.Elements = tempat penyimpanan element Set */

/* ********* Prototype ********* */

/* *** Konstruktor/Kreator *** */
void CreateEmpty(Set *S)
{
    (*S).Count = Nil;
}
/* I.S. Sembarang */
/* F.S. Membuat sebuah Set S kosong berkapasitas MaxEl */
/* Ciri Set kosong : count bernilai Nil */

/* ********* Predikat Untuk test keadaan KOLEKSI ********* */
boolean IsEmpty(Set S)
{
    return (S.Count == Nil);
}
/* Mengirim true jika Set S kosong*/
/* Ciri Set kosong : count bernilai Nil */

boolean IsFull(Set S)
{
    return (S.Count == MaxEl);
}
/* Mengirim true jika Set S penuh */
/* Ciri Set penuh : count bernilai MaxEl */

/* ********** Operator Dasar Set ********* */
void Insert(Set *S, infotype Elmt)
{
    if (!(IsMember(*S, Elmt))){
        (*S).Elements[(*S).Count] = Elmt;
        (*S).Count++;
    }
}
/* Menambahkan Elmt sebagai elemen Set S. */
/* I.S. S mungkin kosong, S tidak penuh
        S mungkin sudah beranggotakan Elmt */
/* F.S. Elmt menjadi anggota dari S. Jika Elmt sudah merupakan anggota, operasi tidak dilakukan */

void Delete(Set *S, infotype Elmt)
{
    if (IsMember(*S, Elmt)){
        boolean found = false;
        int i = 0;
        while (i<(*S).Count && !found){
            if ((*S).Elements[i] == Elmt){
                found = true;
            } else {
                i++;
            }
        }

        int j;
        for (j=i; j<(*S).Count-1; j++){
            (*S).Elements[j] = (*S).Elements[j+1];
        }
        (*S).Count--;
    }
}
/* Menghapus Elmt dari Set S. */
/* I.S. S tidak kosong
        Elmt mungkin anggota / bukan anggota dari S */
/* F.S. Elmt bukan anggota dari S */

boolean IsMember(Set S, infotype Elmt)
{
    boolean found = false;
    int i = 0;
    while (i<S.Count && !found){
        if (S.Elements[i] == Elmt){
            found = true;
        } else {
            i++;
        }
    }

    return found; 

}
/* Mengembalikan true jika Elmt adalah member dari S */

Set SetUnion(Set s1, Set s2)
{
    Set s;
    CreateEmpty(&s);
    int i;
    for(i=0; i<s1.Count; i++){
        Insert(&s, s1.Elements[i]);
    }

    for (i=0; i<s2.Count; i++){
        Insert(&s, s2.Elements[i]);
    }

    return s;
}
// Mengembalikan set baru yang berisi elemen-elemen yang terdapat pada s1 atau s2
// Contoh: [1, 2] U [2, 3] = [1, 2, 3]

Set SetIntersection(Set s1, Set s2)
{
    Set s;
    CreateEmpty(&s);
    int i;
    for (i=0; i<s1.Count; i++){
        if (IsMember(s2, s1.Elements[i])){
            Insert(&s, s1.Elements[i]);
        }
    }

    return s;
}
// Mengembalikan set baru yang berisi elemen-elemen dari s1 dan s2 yang terdapat pada kedua set
// Contoh: [1, 2] ∩ [2, 3] = [2]

Set SetSymmetricDifference(Set s1, Set s2)
{
    Set s, intersect;
    CreateEmpty(&s);
    CreateEmpty(&intersect);
    intersect = SetIntersection(s1, s2);
    int i;
    for (i=0; i<s1.Count; i++){
        if (!(IsMember(intersect, s1.Elements[i]))){
            Insert(&s, s1.Elements[i]);
        }
    }

    for (i=0; i<s2.Count; i++){
        if (!(IsMember(intersect, s2.Elements[i]))){
            Insert(&s, s2.Elements[i]);
        }
    }

    return s;
}
// Mengembalikan set baru yang berisi elemen yang ada di s1 atau s2, tapi tidak pada keduanya
// Contoh: [1, 2] ⊖ [2, 3] = [1, 3]

Set SetSubtract(Set s1, Set s2)
{
    Set s;
    CreateEmpty(&s);
    int i;
    for(i=0; i<s1.Count; i++){
        if (!(IsMember(s2, s1.Elements[i]))){
            Insert(&s, s1.Elements[i]);
        }
    }

    return s;

}
// Mengembalikan set baru yang berupa hasil pengurangan s1 dengan s2
// Contoh:
// s1 = [1, 2] s2 = [2, 3]
// s1 - s2 = [1]

/*
void printSet(Set S)
{
    int i;
    printf("[%d", S.Elements[0]);
    for (i=1; i<S.Count; i++){
        printf(", %d", S.Elements[i]);
    }
    printf("]\n");
}

int main(){
    Set s1, s2;
    CreateEmpty(&s1);
    CreateEmpty(&s2);
    Insert(&s1, 1);
    Insert(&s1, 2);
    Insert(&s1, 5);
    Insert(&s2, 2);
    Insert(&s2, 4);
    Insert(&s2, 3);
    printSet(s1);
    // [1, 2]
    printSet(s2);
    // [2]

    Set Union, intersect, symmetric, substract;
    CreateEmpty(&Union);
    CreateEmpty(&intersect);
    CreateEmpty(&symmetric);
    CreateEmpty(&substract);

    Union = SetUnion(s1, s2);
    intersect = SetIntersection(s1, s2);
    symmetric = SetSymmetricDifference(s1, s2);
    substract = SetSubtract(s1, s2);

    printf("Union: ");
    printSet(Union);
    // [1, 2]
    printf("intersect: ");
    printSet(intersect);
    // [2]
    printf("symmetric: ");
    printSet(symmetric);
    // [1]
    printf("substract: ");
    printSet(substract);
    // [1]

}
*/ 
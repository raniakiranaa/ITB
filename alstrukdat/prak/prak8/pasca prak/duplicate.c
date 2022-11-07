//NIM: 18221168
//Nama: Rania Sasi Kirana
//Tanggal: 1 November 2022
//Topik Praktikum: Set dan Map
//Deskripsi: Pasca prak no. 4
//Implementasi duplicate.h

#include <stdio.h>
#include "duplicate.h"
/*
    Masukkan semua elemen array arr ke suatu Set, kemudian kembalikan Set tersebut
        Contoh:
            arrToSet
                <- arr = [1, 1, 3]
                <- arrSize = 3
            -> [1, 3]
*/
Set arrToSet(int* arr, int arrSize)
{
    Set s;
    CreateEmpty(&s);
    int i;
    for(i=0; i<arrSize; i++){
        if (!(IsMember(s, arr[i]))){
            Insert(&s, arr[i]);
        }
    }
    return s;
}

/*
    Dengan memanfaatkan fungsi arrToSet, hapuslah elemen duplikat pada array arr
    kemudian kembalikan isinya secara menurun

    Penjelasan Parameter:
    Parameter 1: arr, merupakan array masukan yang perlu dihapus elemen duplikatnya
    Parameter 2: arrSize, merupakan panjang arr
    Parameter 3: arrRes, merupakan array keluaran, hasil pengapusan elemen duplikat
        dan elemen-elemennya terurut menurun
    Parameter 4: arrResSize, merupakan panjang arrRes

    Contoh: 
        removeDuplicate
            <- arr = [1, 1, 2, 3]
            <- arrSize = 4
            -> arrRes = [3, 2, 1]
            -> arrResSize = 3
        removeDuplicate
            <- arr = [3, 1, 1]
            <- arrSize = 3
            -> arrRes = [3, 1]
            -> arrResSize = 2
*/

void removeDuplicateDesc(int* arr, int arrSize, int* arrRes, int* arrResSize)
{
    Set s;
    s = arrToSet(arr, arrSize);
    *arrResSize = s.Count;

    // Algoritma Sorting
    int i, k, temp;
    for (i=1; i<s.Count; i++){
        for(k=i; k>0; k--){
            if (s.Elements[k]>s.Elements[k-1]){
                temp = s.Elements[k];
                s.Elements[k] = s.Elements[k-1];
                s.Elements[k-1] = temp;
            }
        }
    }

    // set ke arr
    for (i=0; i<s.Count; i++){
        arrRes[i] = s.Elements[i];
    }
}

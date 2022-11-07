//NIM: 18221168
//Nama: Rania Sasi Kirana
//Tanggal: 1 November 2022
//Topik Praktikum: Set dan Map
//Deskripsi: Pasca prak no. 5
//Implementasi union_map.h

#include <stdio.h>
#include "union_map.h"

/*
void printMap(Map M){
    int i;
    printf("{");
    printf("<%d,%d>", M.Elements[0].Key, M.Elements[0].Value);
    for (i=1; i<M.Count; i++){
        printf(", <%d,%d>", M.Elements[i].Key, M.Elements[i].Value);
    }
    printf("}\n");
}
*/

Map UnionMap(Map m1, Map m2, boolean key_based)
{
    Map m;
    CreateEmpty(&m);

    // masukkan semua m1 dan m2 ke m
    int i=0;
    while (i<m1.Count){
        Insert(&m, m1.Elements[i].Key, m1.Elements[i].Value);
        i++;
    }

    int j=0;
    while (j<m2.Count){
        // jika key sama pada m1 dan m2, value yang ditambah m1
        if (m2.Elements[j].Key != m1.Elements[i].Key){
            Insert(&m, m2.Elements[j].Key, m2.Elements[j].Value);
        }
        j++;
    }

    int k;
    infotype temp;
    if (key_based == true){
        // elemen dalam map baru ditambahkan mengurut membesar berdasarkan key
        // Algoritma sorting
        for (i=1; i<m.Count; i++){
            for (k=i; k>0; k--){
                if (m.Elements[k].Key<m.Elements[k-1].Key){
                    temp = m.Elements[k];
                    m.Elements[k] = m.Elements[k-1];
                    m.Elements[k-1] = temp;
                }
            }
        }
    } else {
        // elemen dalam map baru ditambahkan mengurut membesar berdasarkan value
        // Algoritma sorting
        for (i=1; i<m.Count; i++){
            for (k=i; k>0; k--){
                if (m.Elements[k].Value<m.Elements[k-1].Value){
                    temp = m.Elements[k];
                    m.Elements[k] = m.Elements[k-1];
                    m.Elements[k-1] = temp;
                }
            }
        }
    }

    return m;
}

/*
int main(){
    Map m, m1, m2;
    CreateEmpty(&m);
    CreateEmpty(&m1);
    CreateEmpty(&m2);

    Insert(&m1, 7, 1);
    Insert(&m1, 1, 2);
    Insert(&m1, 20, 3);
    printMap(m1);

    Insert(&m2, 8, 100);
    Insert(&m2, 11, 10);
    Insert(&m2, 1, 3);
    printMap(m2);

    m = UnionMap(m1, m2, true);
    printMap(m);

    m = UnionMap(m1, m2, false);
    printMap(m);

    return 0;    
}
*/
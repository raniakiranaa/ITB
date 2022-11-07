//NIM: 18221168
//Nama: Rania Sasi Kirana
//Tanggal: 22 Oktober 2022
//Topik Praktikum: ADT Stack
//Desrkripsi: Pra Prak No. 2
//Cek input palindrom atau bukan
 
#include <stdio.h>
#include "stack.h"

int main(){
    int x;
    Stack s;
    CreateEmpty(&s);
    scanf("%d", &x);
    while (x != 0){
        Push(&s, x);
        scanf("%d", &x);
    }

    if (IsEmpty(s)){
        printf("Stack kosong\n");
    } else {
        Stack temp1, temp2;
        CreateEmpty(&temp1);
        CreateEmpty(&temp2);
        int y;
        while (!(IsEmpty(s))){
            Pop(&s, &y);
            Push(&temp1, y);
            Push(&temp2, y);
        }

        while (!(IsEmpty(temp1))){
            Pop(&temp1, &y);
            Push(&s, y);
        }

        int z;
        boolean cek = true;
        while(!(IsEmpty(temp2)) && cek){
            Pop(&temp2, &y);
            Pop(&s, &z);
            if (y != z){
                cek = false;
            }
        }

        if (cek){
            printf("Palindrom\n");
        } else {
            printf("Bukan Palindrom\n");
        }
    }

    return 0;
}
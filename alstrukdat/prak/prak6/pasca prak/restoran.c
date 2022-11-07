// Nama : Rania Sasi Kirana
// NIM : 18221168
// Tanggal : 17 Oktober 2022
// Topik Praktikum : Queue
// Pasca Praktikum 6 No. 6
// Deskripsi:
// Spesifikasi Program:
// Input berupa angka, yaitu 0, 1, dan 2. 0 berarti program berhenti menerima masukan. 
// 1 berarti menerima permintaan (dengan tambahan parameter adalah waktu yang dibutuhkan 
// dan waktu yang tidak valid akan diabaikan). 2 berarti menyajikan masakan.\
// Output berupa jumlah masakan yang disaji, waktu minimal yang dibutuhkan, dan waktu 
// maksimal yang dibutuhkan (diikuti dengan newline). Default value adalah 0.

// contoh Input
// 1 2
// 1 5
// 2
// 0

// output
// 1
// 2
// 2

// penjelasan : Karena hanya menyajikan 1 masakan, maka total adalah 1, 
// waktu minimal dan waktu maksimal yang dibuutuhkan adalah 2

// contoh input
// 1 2
// 2
// 1 5
// 2
// 0

// contoh output
// 2
// 2
// 2

// penjelasan : Karena menyajikan 2 masakan, maka total adalah 2, dan waktu 
// minimal yang dibutuhkan adalah 2 (pada pesanan pertama) dan waktu maksimal 
// yang dibutuhkan adalh 5 (pada pesanan kedua).

#include <stdio.h>
#include "queue.h"

int main(){
    Queue q;
    int total_saji = 0;
    int min = 99999;
    int max = -99999;
    int x, time, val;
    CreateQueue(&q);
    scanf("%d", &x);

    while (x != 0){
        if (x == 1){
            scanf("%d", &time);
            if (time>0 && !(isFull(q))){
                enqueue(&q, time);
            }
        } else if (x == 2){
            if (!(isEmpty(q))){
                dequeue(&q, &val);

                if (val > max){
                    max = val;
                }

                if (val < min){
                    min = val;
                }

                total_saji++;
            }
        }
        scanf("%d", &x);
    }

    if (total_saji == 0){
        min = 0;
        max = 0;
    }

    printf("%d\n", total_saji);
    printf("%d\n", min);
    printf("%d\n", max);

    return 0;
}
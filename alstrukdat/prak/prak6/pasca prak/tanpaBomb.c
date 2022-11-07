// Nama : Rania Sasi Kirana
// NIM : 18221168
// Tanggal : 17 Oktober 2022
// Topik Praktikum : Queue
// Pasca Praktikum 6 No. 4
// Deskripsi: Implementasi tanpaBomb.h

#include <stdio.h>
#include "tanpaBomb.h"

Queue tanpaBomb(Queue queue, ElType bomb)
{
    /* Mengembalikan sebuah queue yang sudah tidak memiliki nilai bomb */

    /*
        Contoh input:
            queue : [2,3,4,5,6] // 2 adalah head, 6 adalah tail
            bomb : 3
        Contoh output: [2,4,5,6]

        Contoh input:
            queue : [2,3,4,5,6] // 2 adalah head, 6 adalah tail
            bomb : 7
        Contoh output: [2,3,4,5,6]

    */
    boolean found = false;
    int i=0;
    // cari nilai bomb di dalam queue
    while (i<length(queue) && !(found)){
        if (queue.buffer[i] == bomb){
            found = true;
        } else {
            i++;
        }
    }

    // menghapus bomb
    int j;
    for (j=i; j<length(queue); i++){
        queue.buffer[j] = queue.buffer[j+1];
    }
    
    return queue;
}

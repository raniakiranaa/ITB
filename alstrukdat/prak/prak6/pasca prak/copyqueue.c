// Nama : Rania Sasi Kirana
// NIM : 18221168
// Tanggal : 17 Oktober 2022
// Topik Praktikum : Queue
// Pasca Praktikum 6 No. 5
// Deskripsi: Implementasi copyqueue.h

#include <stdio.h>
#include "copyqueue.h"

// Menyalin queue.
void copyQueue(Queue *queueInput, Queue *queueOutput)
{
/* Proses: Menyalin isi dari queueInput ke queueOutput */
/* I.S. queueInput mungkin kosong, tabel penampung elemen queueInput TIDAK penuh */
/* F.S. queueOutput memiliki isi queue yang sama */
/*
    Contoh input:
    queueInput : [2,3,4,5,6] // 2 adalah head, 6 adalah tail
    queueOutput: queue kosong

    Contoh output:
    queueInput:  [2,3,4,5,6]
    queueOutput: [2,3,4,5,6]
*/

/*
    Catatan
    - Hati-hati jangan sampai algoritma Anda mengubah hasil akhir dari queueInput juga.
      Elemen di queueInput harus tetap sama setelah algoritma dijalankan.
    Hint
    - Buat queue baru selain queueInput dan queueOutput untuk tempat penyimpanan
      queueInput sementara.
*/

    if (!isEmpty(*queueInput)){
        int i=0, pjg = length(*queueInput), temp;
        while (i<pjg){
            dequeue(queueInput, &temp); //ambil head di queueInput
            enqueue(queueInput, temp); // masukkan kembali di queueInput agar hasil akhir queueInput tdk berubah
            enqueue(queueOutput, temp); // masukkan di queueOutput
            i++;
        }
    }
}
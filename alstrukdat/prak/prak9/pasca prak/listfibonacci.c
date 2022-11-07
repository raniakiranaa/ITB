// NIM: 18221168
// Nama: Rania Sasi Kirana
// Tanggal: 5 November 2022
// Topik Praktikum: Struktur berkait
// Deskripsi: Pasca prak no 4
// list fibonacci

#include <stdio.h>
#include "listlinier.h"

int main() {
    List fibonacci;
    CreateEmpty(&fibonacci);

    infotype el;
    scanf("%d", &el);

    if (el == 0) {

    } else if (el == 1) {
        int x;
        scanf("%d", &x);
        InsVFirst(&fibonacci, x);
    } else {
        int x1, x2, x3;
        scanf("%d %d", &x1, &x2);
        InsVLast(&fibonacci, x1);
        InsVLast(&fibonacci, x2);
        int i;
        for (i=2; i<el; i++){
            x3 = x1 + x2;
            InsVLast(&fibonacci, x3);
            x1 = x2;
            x2 = x3;
        }
    }

    PrintInfo(fibonacci);
    return 0;
}
// NIM: 18221168
// Nama: Rania Sasi Kirana
// Tanggal: 4 Oktober 2022
// Topik Praktikum: ADT Mesin Kata
// Deskripsi: Pasca Prak No. 5
// Caesar cipher adalah sebuah metode enkripsi dimana setiap karakter dari teks awal/plaintext 
// diganti dengan karakter lain dengan selisih tertentu dalam alfabet. Contohnya plaintext ABC 
// menjadi BCD apabila dilakukan penggeseran sebanyak 1 huruf.

#include <stdio.h>
#include "mesinkata.h"

int main()
{
    STARTWORD();
    int panjang = currentWord.Length % 26;
    Word tempWord;
    int i;
    for (i=0; i<currentWord.Length; i++){
        tempWord.TabWord[i] = currentWord.TabWord[i] + panjang;
        if (tempWord.TabWord[i]>90){
            tempWord.TabWord[i] -= 26;
        }
        printf("%c", tempWord.TabWord[i]);
    }
    ADVWORD();
    while(!(isEndWord())){
        printf(" ");
        for (i=0; i<currentWord.Length; i++){
            tempWord.TabWord[i] = currentWord.TabWord[i] + panjang;
            if (tempWord.TabWord[i]>90){
                tempWord.TabWord[i]-=26;
            }
            printf("%c", tempWord.TabWord[i]);
        }
        ADVWORD();
    }
    printf(".\n");
    return 0;
}
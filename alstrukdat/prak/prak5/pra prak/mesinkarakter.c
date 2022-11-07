// NIM: 18221168
// Nama: Rania Sasi Kirana
// Tanggal: 1 Oktober 2022
// Topik Praktikum: Mesin Karakter
// Deskripsi: pra prak no 1
// Implementasikan mesinkarakter.h dan submit file mesinkarakter.c

/* File: mesinkarakter.h */
/* Implementasi Mesin Karakter */

#include <stdio.h>
#include "mesinkarakter.h"

char currentChar;
boolean EOP;

static FILE *pita;
static int retval;

void START()
{
    /* Mesin siap dioperasikan. Pita disiapkan untuk dibaca.
    Karakter pertama yang ada pada pita posisinya adalah pada jendela.
    Pita baca diambil dari stdin.
    I.S. : sembarang
    F.S. : currentChar adalah karakter pertama pada pita
          Jika currentChar != MARK maka EOP akan padam (false)
          Jika currentChar = MARK maka EOP akan menyala (true) */
    
    /* Algoritma */
    pita = stdin;
    ADV();
}
void ADV()
{
    /* Pita dimajukan satu karakter.
    I.S. : Karakter pada jendela = currentChar, currentChar != MARK
    F.S. : currentChar adalah karakter berikutnya dari currentChar yang lama,
        currentChar mungkin = MARK
        Jika  currentChar = MARK maka EOP akan menyala (true) */
    
    /* Algoritma */
    retval = fscanf(pita, "%c", &currentChar);
    EOP = (currentChar == MARK);
    if (EOP){
        fclose(pita);
    }
}
char GetCC()
{
    /* Mengirimkan currentChar */

    /* Algoritma */
    return (currentChar);
}
boolean IsEOP()
{
    /* Mengirimkan true jika currentChar = MARK */

    /* Algoritma */
    return (currentChar == MARK);
}
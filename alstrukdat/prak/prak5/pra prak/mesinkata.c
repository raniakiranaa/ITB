// NIM: 18221168
// Nama: Rania Sasi Kirana
// Tanggal: 1 Oktober 2022
// Topik Praktikum: ADT Mesin Kata
// Deskripsi: pra prak no 3
// implementasi ADT Mesin Kata

/* File: mesinkata.h */
/* Definisi Mesin Kata: Model Akuisisi Versi I */

#include <stdio.h>
#include "mesinkata.h"

boolean EndWord;
Word currentWord;

void IgnoreBlanks()
{
    /* Mengabaikan satu atau beberapa BLANK
    I.S. : currentChar sembarang
    F.S. : currentChar ≠ BLANK atau currentChar = MARK */

    /* Algoritma */
    while (currentChar == BLANK && currentChar != MARK){
        ADV();
    }
}

void STARTWORD()
{
    /* I.S. : currentChar sembarang
    F.S. : EndWord = true, dan currentChar = MARK;
        atau EndWord = false, currentWord adalah kata yang sudah diakuisisi,
        currentChar karakter pertama sesudah karakter terakhir kata */

    /* Algoritma */
    START();
    IgnoreBlanks();
    if (currentChar == MARK){
        EndWord = true;
    } else {
        EndWord = false;
        CopyWord();
    }
}

void ADVWORD()
{
    /* I.S. : currentChar adalah karakter pertama kata yang akan diakuisisi
    F.S. : currentWord adalah kata terakhir yang sudah diakuisisi,
        currentChar adalah karakter pertama dari kata berikutnya, mungkin MARK
        Jika currentChar = MARK, EndWord = true.
    Proses : Akuisisi kata menggunakan procedure SalinWord */

    /* Algoritma */
    IgnoreBlanks();
    if (currentChar == MARK){
        EndWord = true;
    } else {
        EndWord = false;
        CopyWord();
        IgnoreBlanks();
    }
}

void CopyWord()
{
    /* Mengakuisisi kata, menyimpan dalam currentWord
    I.S. : currentChar adalah karakter pertama dari kata
    F.S. : currentWord berisi kata yang sudah diakuisisi;
        currentChar = BLANK atau currentChar = MARK;
        currentChar adalah karakter sesudah karakter terakhir yang diakuisisi.
        Jika panjang kata melebihi NMax, maka sisa kata "dipotong" */

    /* Algoritma */
    int i = 0;
    while (currentChar != MARK && currentChar != BLANK){
        currentWord.TabWord[i] = currentChar;
        ADV();
        i++;
    }

    if (i>NMax){
        currentWord.Length = NMax;
    } else {
        currentWord.Length = i;
    }
}
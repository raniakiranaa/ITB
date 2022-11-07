// NIM: 18221168
// Nama: Rania Sasi Kirana
// Tanggal: 4 Oktober 2022
// Topik Praktikum: ADT Mesin Kata
// Deskripsi: Pasca Prak No. 6
// menghitung jumlah kata yang bersifat anagram dengan alstrukdat

#include <stdio.h>
#include "anagramalstrukdat.h"

/*  Menerima sebuah parameter string bertipe string
    Mengirimkan panjang sebuah string */
int stringLength (char* string)
{
    int count = 0;
    while (string[count] != '\0'){
        count++;
    }
    return count;
}

/*  Menerima sebuah paramater command bertipe string
    Mengirimkan kata yang elemen of arraynya berasal dari command */
Word toKata(char* command)
{
    int i;
    Word kata;
    for (i=0; i<stringLength(command); i++){
        kata.TabWord[i] = command[i];
    }
    kata.Length = stringLength(command);
    return kata;
}

/*  Menerima dua buah parameter yaitu string1 dan string2
    Mengembalikan true apabila string2 merupakan anagram dari string1
    Mengembalikan false apabila string2 bukan merupakan anagram dari string1
    String dianggap anagram apabila disusun dari huruf yang tepat sama */
boolean isAnagram(Word string1, Word string2)
{
    int arr1[26] = {0};
    int arr2[26] = {0};

    if (string1.Length != string2.Length){
        return false;
    } else {
        int i;
        for(i=0; i<string1.Length; i++){
            if(string1.TabWord[i]>=65 && string1.TabWord[i]<=90){
                string1.TabWord[i] += 32;

            }
            arr1[string1.TabWord[i]-97]++;
        }

        for(i=0; i<string2.Length; i++){
            if(string2.TabWord[i]>=65 && string2.TabWord[i]<=90){
                string2.TabWord[i] += 32;

            }
            arr2[string2.TabWord[i]-97]++;
        }

        for (i=0; i<26; i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }

        return true;
    }
}

/*  Mengembalikan jumlah frekuensi kemunculan anagram alstrukdat 
    pada argumen frek */
void anagramalstrukdat(int* frek)
{
    Word alstrukdat = toKata("alstrukdat");
    int count = 0;
    STARTWORD();
    while (!(isEndWord())){
        if (isAnagram(alstrukdat, currentWord)){
            count ++;
        }
        ADVWORD();
    }
    *frek = count;
}
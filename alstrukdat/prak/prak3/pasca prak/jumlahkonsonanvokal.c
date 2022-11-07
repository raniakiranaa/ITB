#include <stdio.h>
#include "jumlahkonsonanvokal.h"

// Boolean
#define boolean unsigned char
#define true 1
#define false 0

boolean isAlphabet(char c)
{
    return ((c>='A' && c<='Z') || (c>='a' && c<='z'));
}

boolean isVowel(char c)
{
    return (c == 'A' || c == 'I' || c == 'U' || c == 'E' || c == 'O' || c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o' );
}

void jumlahKonsonanVokal(char*s, int*k, int*v)
// Parameter pertama merupakan kalimat
// Parameter kedua merupakan jumlah huruf konsonan
// Parameter ketiga merupakan jumlah huruf vokal
{
    int i = 0;
    while (s[i] != '\0'){
        if (isAlphabet(s[i])){
            if (isVowel(s[i])){
                (*v)++;
            } else {
                (*k)++;
            }
        }
        i++;
    }
}

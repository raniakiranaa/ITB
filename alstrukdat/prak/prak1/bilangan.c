/*
Deskripsi : Menentukan apakah suatu bilangan merupakan bilangan subset genap
(bilangan yg dpt dibentuk dari penjumlahan 2 bil genap asli)
*/

#include <stdio.h>

int main()
{
    int bil;
    scanf("%d", &bil);
    if (bil>2){
        if ((bil%2) == 0){
            printf("%s\n", "Ya");
        } else {
            printf("%s\n", "Tidak");
        }
    } else {
        printf("%s\n", "Tidak");
    }
    return 0;
}
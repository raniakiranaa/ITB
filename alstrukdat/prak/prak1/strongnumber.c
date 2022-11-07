/*
Deskripsi : strong number apabila jumlah dari faktorial tiap-tiap digitnya
sama dengan bilangan itu sendiri.
*/

#include <stdio.h>

int faktorial(int digit)
{
    int hasil = 1;
    while(digit!=0){
        hasil *= digit;
        digit--;
    }
    return hasil;
}

int main()
{
    int bil;
    scanf("%d", &bil);
    int sum = 0, num = bil;
    while (bil!=0){
        sum += faktorial(bil%10);
        bil = bil/10;
    }
    if (sum == num){
        printf("%c\n", 'Y');
    } else {
        printf("%c\n", 'N');
    }
    return 0;
}
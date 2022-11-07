#include <stdio.h>
/*
Nama : Rania Sasi Kirana
NIM : 18221168
DESKRIPSI : menjumlahkan semua digit bilangan dalam integer input
*/

int main()
{
    int num;
    scanf("%d", &num);
    int sum = 0;
    while(num != 0){
        sum += num%10;
        num = num/10;
    }
    printf("%d\n", sum);
    return 0;
}
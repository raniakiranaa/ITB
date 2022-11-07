/*
Rania Sasi Kirana
18221168
PASCA PRAK NO 5
*/

#include <stdio.h>

int main()
{
    int bil, sum=0;
    scanf("%d", &bil);
    while (bil!=0){
        sum += (bil%10);
        bil /= 10;
    }
    printf("%d\n", sum);
    return 0;
}
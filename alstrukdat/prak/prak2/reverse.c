/*
Rania Sasi Kirana
18221168
PASCA PRAK NO 4
*/

#include <stdio.h>

int main()
{
    int bil;
    scanf("%d", &bil);

    while (bil != 0){
        printf("%d", (bil % 10));
        bil /= 10;
    }
    printf("\n");

    return 0;
}
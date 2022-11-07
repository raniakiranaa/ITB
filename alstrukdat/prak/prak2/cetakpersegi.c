/*
Rania Sasi Kirana
18221168
PASCA PRAK NO 1
*/

#include <stdio.h>

int main()
{
    int N, sisi,i,j;
    scanf("%d", &N);
    sisi = 2*N-1;

    for (i=1; i<=sisi; i++){
        for (j=1; j<=sisi; j++){
            if (i%2==1){
                if (j%2==1){
                    printf("%c",'O');
                } else {
                    printf("%c",'X');
                }
            } else {
                if (j%2==1){
                    printf("%c",'X');
                } else {
                    printf("%c",'O');
                }
            }
        }
        printf("\n");
    }

    return 0;
}
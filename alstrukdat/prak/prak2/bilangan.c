/*
Rania Sasi Kirana
18221168
PASCA PRAK NO 6
*/

#include <stdio.h>

int main()
{
    int N,M,i,j;
    scanf("%d", &N);
    for (i=0;i<N;i++){
        scanf("%d", &M);
        int sum = 0;
        for (j=1; j<=M; j++){   // cek di rentang M
            int temp = j;
            int done = 0;
            while (temp != 0 && done == 0){
                // cari yang digit belakangnya 7
                if (temp % 10 == 7){
                    done++;
                    sum += j;
                }
                temp /= 10; // asumsi temp bisa lebih dari 2 digit
            }

            // yang bisa dibagi dengan 7
            if (done == 0 && j % 7 == 0){
                sum += j;
            }
        }
        printf("%d\n", sum);
    }
    
    return 0;
}
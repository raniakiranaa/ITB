#include <stdio.h>

int main()
{
    int n;
    scanf("%d", &n);
    int sisi = 2*n-1;
    int i,j,start=1;

    while (start<=sisi){
        if (start%2==1){
            printf("%c", 'O');
            for (i=1; i<sisi; i++){
                if (i%2==0){
                    printf("%c", 'O');
                } else {
                    printf("%c", 'X');
                }
            }
        } else {
            printf("%c", 'X');
            for (i=1; i<sisi; i++){
                if (i%2==0){
                    printf("%c", 'X');
                } else {
                    printf("%c", 'O');
                }
            }
        }
        start++;
        printf("\n");
    }
    return 0;
}
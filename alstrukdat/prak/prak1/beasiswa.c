#include <stdio.h>

int main()
{
    float ip, pot;
    scanf("%f", &ip);
    scanf("%f", &pot);
    if (ip>=3.5){
        printf("%d\n", 4);
    } else if (ip<3.5 && pot<1){
        printf("%d\n", 1);
    } else if (ip<3.5 && pot>=1 && pot<5){
        if (ip>=2.0){
            printf("%d\n", 3);
        }
        else {
            printf("%d\n", 2);
        }
    } else {
        printf("%d\n", 0);
    }
    return 0;
}
#include <stdio.h>
#include <string.h>

int main()
{
    char str[10];
    scanf("%s", str);
    int angka[10];
    int i;

    //inisiasi array output
    for (i=0;i<10;i++){
        angka[i] = 0;
    } 

    //menghitung kemunculan angka menggunakan ascii
    for (i=0;i<strlen(str);i++){
        if(str[i]>=48 && str[i]<=57){
            angka[str[i]-48]++;
        }
    }

    //output
    for (i=0; i<10; i++){
        printf("%d", angka[i]);
    }
    
    printf("\n");
    return 0;
}
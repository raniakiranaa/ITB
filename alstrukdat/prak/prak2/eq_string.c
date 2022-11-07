/*
Rania Sasi Kirana
18221168
PASCA PRAK NO 2
*/

#include <stdio.h>
#include <string.h>

int main()
{
    int i, salah=0;
    char str1[100], str2[100];
    scanf("%s", str1);
    scanf("%s", str2);

    if (strlen(str1)==strlen(str2)){
        for (i=0; i<strlen(str1); i++){
            if (str1[i]!=str2[i] && str1[i]!=str2[i]-32 && str1[i]!=str2[i]+32){
                salah++;
            }
        } 
        if (salah==0){
            printf("Ya\n");
        } else {
            printf("Tidak\n");
        }       
    } else {
        printf("Tidak\n");
    }
    return 0;
}
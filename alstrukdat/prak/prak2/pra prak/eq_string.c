#include <stdio.h>
#include <string.h>

int main()
{
    char str1[100];
    char str2[100];
    scanf("%s", str1);
    scanf("%s", str2);
    int i, salah=0;

    if (strlen(str1) == strlen(str2)){
        for (i=0; i<strlen(str1); i++){
            if(str1[i] != str2[i] && str1[i] != str2[i]+32 && str1[i] != str2[i]-32){
                salah++;
            }
        }
        if (salah==0){
            printf("%s\n", "Ya");
        } else {
            printf("%s\n", "Tidak");
        }
    } else {
        printf("%s\n", "Tidak");
    }
    return 0;
}
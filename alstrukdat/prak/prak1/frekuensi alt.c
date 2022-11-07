/*
Deskripsi :
*/

#include <stdio.h>
#include <string.h>

int main()
{
    char string[10];
    scanf("%s", string);
    int len = strlen(string);
    int arr[10] = {0,0,0,0,0,0,0,0,0,0};

    /*alt hitung pjg str gapake strlen :
        int len = 0;
        while (string[len] != '\0'){
            len++;
        }
    */

    for (int i = 0; i<len; i++){
        if(string[i]=='0'){
            arr[0]++;
        } else if (string[i]=='1'){
            arr[1]++;
        } else if (string[i]=='2'){
            arr[2]++;
        } else if (string[i]=='3'){
            arr[3]++;
        } else if (string[i]=='4'){
            arr[4]++;
        } else if (string[i]=='5'){
            arr[5]++;
        } else if (string[i]=='6'){
            arr[6]++;
        } else if (string[i]=='7'){
            arr[7]++;
        } else if (string[i]=='8'){
            arr[8]++;
        } else if (string[i]=='9'){
            arr[9]++;
        }
    }
    char output[10];
    for(int i=0;i<10;i++){
        output[i] = arr[i] + '0';
    }
    printf("%s\n", output);
    return 0;
}
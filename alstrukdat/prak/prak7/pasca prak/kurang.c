//NIM: 18221168
//Nama: Rania Sasi Kirana
//Tanggal: 25 Oktober 2022
//Topik Praktikum: ADT Stack
//Deskripsi: Pasca Prak No. 5
//

#include <stdio.h>
#include "string.h"
#include "stack.h"

void strtoStack(Stack *s, char* str){
    int temp;
    int i=0;
    while (str[i] != '\0'){
        Push(s, (str[i]-48)); // ubah str ke int, push ke stack
        i++;
    }
}

boolean isGreater(char *str1, char *str2){
    // mengembalikan true jika str1>=str2
    int pjg1 = strlen(str1);
    int pjg2 = strlen(str2);
    if (pjg1>pjg2){
        return true;
    } else if (pjg1<pjg2){
        return false;
    } else {                    // pjg1 = pjg2
        for (int i=0; i<pjg1; i++){
            if (str1[i]>str2[i]){
                return true;
            } else if (str1[i]<str2[i]){
                return false;
            }
        }
        return true;            // str1 = str2
    }
}

void hitung (Stack S1, Stack S2, Stack *ans){
    // prekondisi : S1 > S2
    int temp1, temp2;
    while (!(IsEmpty(S1)) || !(IsEmpty(S2))){
        if (!(IsEmpty(S2))){
            Pop(&S1, &temp1);
            Pop(&S2, &temp2);
            int hasil;
            if (temp1 < temp2){  
                temp1 += 10;        
                int top;
                Pop(&S1, &top);
                top--;
                Push(&S1, top);
            }
            Push (ans, temp1 - temp2);
        } else {
            Pop(&S1, &temp1);
            Push(ans, temp1);
        }
    }
}

void removeTrailingZero(Stack *ans){
    // ex ans: 0100 -> 100
    int temp;
    while (!(IsEmpty(*ans))){
        if (InfoTop(*ans) == 0){
            Pop(ans, &temp);
        } else {
            break;
        }
    }

    if(IsEmpty(*ans)){
        Push(ans, 0);
    }
}

void printStack (Stack ans){
    int top;
    while (!(IsEmpty(ans))){
        Pop(&ans, &top);
        printf("%d", top);
    }
    printf("\n");
}

int main(){
    char s1[100], s2[100];
    scanf("%s", s1);
    scanf("%s", s2);

    Stack S1, S2, ans;
    CreateEmpty(&S1);
    CreateEmpty(&S2);
    CreateEmpty(&ans);

    strtoStack(&S1, s1);
    strtoStack(&S2, s2);

    boolean greater = isGreater(s1, s2);
    if (greater){
        hitung(S1, S2, &ans);
    } else {
        printf("-");
        hitung(S2, S1, &ans);
    }

    removeTrailingZero(&ans);
    printStack(ans);
    return 0;
}
//NIM: 18221168
//Nama: Rania Sasi Kirana
//Tanggal: 25 Oktober 2022
//Topik Praktikum: ADT Stack
//Deskripsi: Pasca Prak No. 6
//Implementasi valid.h

#include <stdio.h>
#include "valid.h"

Stack validParantheses(char* input, int length)
{
/* Proses: Memasukkan parantheses (dari input) yang valid secara berurutan ke dalam Stack */
/* I.S. input adalah string, yang berisi parantheses baik secara acak maupun teratur, dan panjang dari string */
/* Contoh input dan hasil parantheses yang valid:
    1. () 2 -> ()
    2. []) 3 -> []
    3. {[} 3 -> --kosong--
    4. ()[]{} 6 -> ()[]{}
*/
    char temp;
    Stack s;
    CreateEmpty(&s);
    temp = input[0];
    int i;
    for(i=1; i<length; i++){
        if (temp == '[' && input[i] == ']' || temp == '(' && input[i] == ')' || temp == '{' && input[i] == '}'){
            Push(&s, temp);
            Push(&s, input[i]);
        } else {
            temp = input[i];
        }
    }

    return s;
}

// void printstack(Stack s){
//    infotype temp;
//    while(!(IsEmpty(s))){
//        printf("%c", InfoTop(s));
//        Pop(&s, &temp);
//    }
//}

//int main(){
//    char input[5] = "](){}";
//    printstack(validParantheses(input, 5));
//}
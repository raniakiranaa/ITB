//NIM: 18221168
//Nama: Rania Sasi Kirana
//Tanggal: 22 Oktober 2022
//Topik Praktikum: ADT Stack
//Desrkripsi: Pra Prak No. 3
//Implementasi aritmatika.h

#include <stdio.h>
#include "aritmatika.h"

boolean isOperator(char input)
{
/* Proses: Mengecek apakah input merupakan operator */
/*         input adalah operator jika input merupakan salah
           satu dari berikut:
                - +
                - -
                - *
                - /
*/
    return (input == '+' || input == '-' || input == '*' || input == '/');
}
int hitung(int angka1, int angka2, char op)
{
/* Proses: Menghitung ekspresi */
/*
    Contoh input / output:
    angka1 : 2
    angka2 : 10
    op     : -

    return : -8 (penjelasan: 2 - 10 = 8)
*/
    int hasil;
    if (op == '+'){
        hasil = angka1 + angka2;
    } else if (op == '-'){
        hasil = angka1 - angka2;
    } else if (op == '*'){
        hasil = angka1 * angka2;
    } else if (op == '/'){
        hasil = angka1 / angka2;
    }

    return hasil;
}

int eval(char *input, int length)
{
/* Proses: Menghitung keseluruhan ekspresi */
/* I.S. input adalah string. setiap operand dipastikan < 10 */
/*
    Contoh input / output:
    input   : 23+
    output  : 5 (penjelasan: ekspresi ekuivalen dengan 2 + 3)

    input   : 9423+*5/-
    output  : 5 (penjelasan: ekspresi ekuivalen dengan 9-(4*(2+3))/5)

*/
    Stack s;
    CreateEmpty(&s);
    int i;
    for (i=0; i<length; i++){
        if (!(isOperator(input[i]))){
            Push(&s, input[i]-48); //-48 ngubah dr string jd integer
        } else {
            int angka1, angka2;
            Pop(&s, &angka2);
            Pop(&s, &angka1);
            Push(&s, hitung(angka1, angka2, input[i]));
        }
    }
    return (s.T[s.TOP]);
}
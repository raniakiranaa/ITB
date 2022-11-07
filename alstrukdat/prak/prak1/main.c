#include <stdio.h>

int main()
{
    int input;
    scanf("%d", &input);
    int jam, menit, detik;
    jam = input / 3600;
    menit = (input%3600) / 60;
    detik = (input%3600)%60;
    printf("%d detik = %d jam %d menit %d detik\n", input, jam, menit, detik);
    return 0;
}
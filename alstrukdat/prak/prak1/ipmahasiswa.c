#include <stdio.h>

int main()
{
    float ip, jumlah = 0;
    int mahasiswa = 0, lulus = 0, tidaklulus = 0;
    while (ip != -999){
        scanf("%f", &ip);
        if (ip>=0 && ip<=4){
            mahasiswa ++;
            jumlah += ip;
            if (ip>=2.75){
                lulus ++;
            } else{
                tidaklulus ++;
            }
        }
    }
    if (jumlah!=0){
        printf("%d\n", mahasiswa);
        printf("%d\n", lulus);
        printf("%d\n", tidaklulus);
        printf("%.2f\n", jumlah/mahasiswa);
    } else {
        printf("Tidak ada data\n");
    }
}
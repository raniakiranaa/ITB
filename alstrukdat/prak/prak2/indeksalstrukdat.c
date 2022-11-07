/*
Rania Sasi Kirana
18221168
PASCA PRAK NO 5
*/

#include <stdio.h>

int main()
{
    int ip, jumlah=0, lulus=0;
    float sum=0, rata=0;
    char indeks;

    while (ip!=-999){
        scanf("%d", &ip);
        if(ip>=0 && ip<=4){
            sum = sum + ip;
            if (ip>=3){
                lulus++;
            }
            jumlah++;
        }
    }

    if (jumlah!=0){
        rata = sum/jumlah;
        if(rata == 4){
            indeks = 'A';
        } else if (rata>=3 && rata<4){
            indeks = 'B';
        } else if (rata>=2 && rata<3){
            indeks = 'C';
        } else if (rata>=1 && rata<2){
            indeks = 'D';
        } else {
            indeks = 'E';
        }

        printf("Jumlah mahasiswa yang lulus = %d\n", lulus);
        printf("Nilai rata-rata = %.2f\n", rata);
        printf("Indeks akhir kelas = %c\n", indeks);
    } else {
        printf("Tidak ada data\n");
    }
    return 0;
}
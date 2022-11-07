//NIM: 18221168
//Nama: Rania Sasi Kirana
//Pasca Praktikum No. 5
//Deskripsi: 
// Diberikan suatu array dengan ukuran N. Anggaplah isi dari array tersebut diulang tak hingga kali.
// Kemudian, diberikan rentang l dan r sebanyak q kali, hitunglah penjumlahan bilangan dari posisi l sampai posisi ke r!

//Batasan Input
//1 ≤ N ≤ 1000
//1 ≤ q ≤ 1000
//1 ≤ l ≤ r ≤ 1000

//Baris pertama N, menyatakan jumlah bilangan dalam array
//Baris kedua, berisi N buah bilangan dalam array
//Baris ketiga q, menyatakan jumlah query
//q baris selanjutnya berisi bilangan l & r, menyatakan rentang posisi

//contoh input
/*  4
    1 2 3 4
    2
    1 2
    1 10
*/
//Output
//  3
//  23

/*Penjelasan:
Array [1, 2, 3, 4] jika diulang tak hingga kali menjadi: [1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, ...]. Untuk rentang pertama {1, 2} berarti jumlahkan bilangan 
posisi 1 sampai posisi 2 (bukan index) sehingga 1+2 = 3. Untuk rentang kedua {1, 10} berarti jumlahkan bilangan posisi 1 sampai 10, jika dihitung didapatkan 23.*/

#include <stdio.h>

int main(){
    int N, q, l, r;
    scanf("%d", &N);
    int c[1000];
    int i;
    for (i=1; i<=N; i++){
        scanf("%d", &c[i]);
    }

    // Membuat pengulangan array hingga mencapai batasan input
    for (i=N+1; i<=1000; i++){
        c[i] = c[i-N];
    }

    scanf("%d", &q);
    for (i=1; i<=q; i++){
        scanf("%d %d", &l, &r);
        int sum=0,j;
        for (j=l; j<=r; j++){
            sum += c[j];
        }
        printf("%d\n", sum);
    }
    
    return 0;
}
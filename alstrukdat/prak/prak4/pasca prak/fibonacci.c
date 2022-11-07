#include <stdio.h>
#include "fibonacci.h"

// Deret bilangan fibonacci adalah deret angka yang susunan angkanya
// merupakan penjumlahan dari dua angka sebelumnya.
// Contoh:
// Fib 0: 1
// Fib 1: 1
// Fib 2: 1 + 1 = 2
// Fib 3: 2 + 1 = 3
// Fib 4: 3 + 2 = 5
// Fib 5: 5 + 3 = 8

// Menerima argument sebuah integer n dan mengembalikan
// nilai suku ke-n dari deret fibonacci ke argumen result
// Contoh:
// n = 5
// Nilai argumen result = 8
void fibonacci1(int n, int *result)
{
    int fib_0, fib_1, i, fib_2;
    fib_0 = 1;
    fib_1 = 1;
    for (i=2; i<=n; i++){
        fib_2 = fib_0 + fib_1;
        fib_0 = fib_1;
        fib_1 = fib_2;
    }
    *result = fib_1;
} 

// Menerima argument sebuah integer n dan mengembalikan
// nilai suku ke-n dari deret fibonacci
int fibonacci2(int n)
{
    int hasil;
    fibonacci1(n, &hasil);
    return hasil;
}
// Menerima argument sebuah integer n
// Output adalah argumen result yang bertipe pointer int digunakan sebagai array
// Tuliskan semua nilai deret fibonacci dari 0 - n ke argumen result
// n = 5
// result = [1, 1, 2, 3, 5, 8]
void fibonacci3(int n, int *result)
{
    int i;
    for (i=0; i<=n; i++){
        fibonacci1(i, &result[i]);
    }
}

// driver
int main(){
    int n,i;
    int result;
    int result2[100];

    printf("Masukkan nilai n: ");
    scanf("%d", &n);

    fibonacci1(n, &result);
    printf("Fibonacci1: %d \n", result);

    result = fibonacci2(n);
    printf("Fibonacci2: %d \n", result);

    fibonacci3(n, result2);
    printf("Fibonacci3: ");
    for (i = 0; i <= n; i++)
    {
        printf("%d ", result2[i]);
    }

    return 0;
}
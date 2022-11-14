#include <stdio.h>
#include "listsirkuler.c"

int main()
{
    List L;
    CreateEmpty(&L);
    address p,x, p1, p2;
    p2 = Alokasi(10);
    InsertLast(&L, p2);
    x = Alokasi(20);
    InsertLast(&L, x);
    p = Alokasi(30);
    InsertLast(&L, p);
    PrintInfo(L);
    printf("\n");
    p1 = Alokasi(40);
    InsertAfter(&L, p1, p2);
    PrintInfo(L);
    return 0;
}

// compile: gcc driverlistsirkuler.c listsirkuler.c -o driver
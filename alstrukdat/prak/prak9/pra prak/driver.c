#include <stdio.h>
#include "listlinier.c"

// insertafter
// Delp
// void DelP (List *L, infotype X)
// {
//     address p = First(*L);
//     address loc = Nil;
//     boolean found = false;
//     while (Next(p) != Nil && !found){
//         if (Info(p) == X){
//             found = true;
//         }
//         loc = p;
//         p = Next(p);
//     }

//     if (found){
//         if (loc == Nil && Next(p) == Nil){  // List jadi kosong
//             First(*L) = Nil;
//             free(p);
//         } else {
//             Next(loc) = Next(p);
//             free(p);
//         }
//     }
// }

// delete last
// void DelLast (List *L, address *P)
// {
//     address last = First(*L);
//     address loc = Nil;
//     while (Next(last) != Nil){
//         loc = last;
//         last = Next(last);
//     }

//     if (loc == Nil){
//         First(*L) = Nil;
//     } else {
//         Next(loc) = Nil;
//     }

//     *P = last;
//     free(last);
// }

int main()
{
    List L;
    CreateEmpty(&L);
    address p;
    PrintInfo(L);
    infotype x;
    int n;
    for (n=0; n<3; n++){
        InsVFirst(&L, n+1);
    }
    // InsVFirst(&L, 1);
    DelP(&L, 0);
    PrintInfo(L);

    return 0;
}


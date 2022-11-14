// NIM: 18221168
// Nama: Rania Sasi Kirana
// Tanggal: 13 November 2022
// Topik Praktikum: ADT List dengan Double Pointer
// Deskripsi: Pra prak No.3
// elemenken.c

#include <stdio.h>
#include "listsirkuler.h"

int ElemenKeN(List L, int r) {
    if (IsEmpty(L)){
      return 0;
    } else {
      int count = 0;
      address p = First(L);
      while (count != r){
        p = Next(p);
        count++;
      }
      return Info(p);
    }
}

int main () {
  List L;
  int r;
  int isi;
  CreateEmpty(&L);
  scanf("%d", &isi);
  while (isi != 0){
    InsVLast(&L, isi);
    scanf("%d", &isi);
  }
  scanf("%d", &r);
  int temp = ElemenKeN(L, r);
  if (temp == 0){
    printf("List Kosong\n");
  }
  else{
    printf("%d\n", temp);
  }
  return 0;
}
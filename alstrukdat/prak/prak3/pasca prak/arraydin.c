#include <stdio.h>
#include <stdlib.h>
#include "arraydin.h"

ArrayDin MakeArrayDin()
{
    ArrayDin A;
    A.A = (ElType *) malloc(InitialSize * sizeof(ElType));
    A.Capacity = InitialSize;
    A.Neff = 0;
    return A;
}

void DeallocateArrayDin(ArrayDin *array)
{
    free((*array).A);
}

boolean IsEmpty(ArrayDin array)
{
    return(array.Neff == 0);
}

int Length(ArrayDin array)
{
    return(array.Neff);
}

ElType Get(ArrayDin array, IdxType i)
{
    return(array.A[i]);
}

int GetCapacity(ArrayDin array)
{
    return(array.Capacity);
}

void InsertAt(ArrayDin *array, ElType el, IdxType i)
{
    if ((*array).Neff == (*array).Capacity){
        (*array).Capacity *= 2;
        (*array).A = (ElType *)realloc((*array).A, (*array).Capacity * sizeof(ElType));
    }
    int j;
    for (j=(*array).Neff; j>i; j--){
        (*array).A[j] = (*array).A[j-1];
    }
    (*array).A[i] = el;
    (*array).Neff ++;
}

void InsertLast(ArrayDin *array, ElType el)
{
    InsertAt(array, el, (*array).Neff);
}

void InsertFirst(ArrayDin *array, ElType el)
{
    InsertAt(array, el, 0);
}

void DeleteAt(ArrayDin *array, IdxType i)
{
    int j;
    for(j=i; j<(*array).Neff; j++){
        (*array).A[j] = (*array).A[j+1];
    }
    (*array).Neff--;
}

void DeleteLast(ArrayDin *array)
{
    DeleteAt(array, (*array).Neff-1);
}

void DeleteFirst(ArrayDin *array)
{
    DeleteAt(array, 0);
}

void PrintArrayDin(ArrayDin array)
{
    printf("[");
    if (array.Neff==0){
        printf("]\n");
    } else {
        int j;
        printf("%d", (array).A[0]);
        for(j=1;j<(array).Neff;j++){
            printf(", ");
            printf("%d", (array).A[j]);
        }
        printf("]\n");
    }
}

void ReverseArrayDin(ArrayDin *array)
{
    ArrayDin Temp;
    Temp.Neff = (*array).Neff;
    Temp.Capacity = (*array).Capacity;
    Temp.A = (ElType *) malloc(Temp.Capacity * sizeof(ElType));

    int i, j=(*array).Neff-1;
    for(i=0; i<(*array).Neff; i++){
        Temp.A[i] = (*array).A[j];
        j--;
    }

    int k;
    for(k=0; k<(*array).Neff; k++){
        (*array).A[k] = Temp.A[k];
    }
}

ArrayDin CopyArrayDin(ArrayDin array)
{
    ArrayDin A;
    A.Neff = (array).Neff;
    A.Capacity = (array).Capacity;
    A.A = (ElType *) malloc(array.Capacity * sizeof(ElType));

    int i;
    for (i = 0; i<(array).Neff; i++){
        A.A[i] = array.A[i];
    }
    return A;
}

IdxType SearchArrayDin(ArrayDin array, ElType el)
{
    int i;
    for (i=0; i<(array).Neff; i++){
        if ((array).A[i]==el){
            return i;
        }
    }
    return -1;
}
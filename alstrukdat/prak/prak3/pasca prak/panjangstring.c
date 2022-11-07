#include <stdio.h>
#include "panjangstring.h"

int panjangString(char*s)
{
    int count = 0;
    while (s[count] != '\0'){
        count ++;
    }
    return count;
}
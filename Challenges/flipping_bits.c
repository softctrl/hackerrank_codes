#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include <stdint.h>

int main() {

    int count = 0;
    scanf("%d", &count);
    uint32_t t = 0;
    while (count--) {
        scanf("%u", &t);
        printf("%u\n", ~t);
    }
    return 0;

}

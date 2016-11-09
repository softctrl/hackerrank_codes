#include <stdio.h>
#include <stdlib.h>

int main() {
  
    int a = 0; scanf("%d", &a);
    int b = 0; scanf("%d", &b);
    int value = 0;
    
    for (value = a; value<=b; value++) {
        if (value ==1) {
            printf("one\n");
        } else if (value ==2){
            printf("two\n");
        } else if (value ==3){
            printf("three\n");
        } else if (value ==4){
            printf("four\n");
        } else if (value ==5){
            printf("five\n");
        } else if (value ==6){
            printf("six\n");
        } else if (value ==7){
            printf("seven\n");
        } else if (value ==8){
            printf("eight\n");
        } else if (value ==9){
            printf("nine\n");
        } else {
            if ((value % 2) ==0) {
                printf("even\n");
            } else {
                printf("odd\n");
            }
        }
    }
    return 0;

}

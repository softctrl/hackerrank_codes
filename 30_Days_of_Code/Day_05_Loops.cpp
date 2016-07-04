#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {

    int n;
    if( scanf( "%d", &n ) == 1 ) {
        int i=0;
        while ((i++)<10) {
            printf("%d x %d = %d\n",n, i, (n*i));    
        }
        return 0;
    } else {
        exit(1);
    }

}

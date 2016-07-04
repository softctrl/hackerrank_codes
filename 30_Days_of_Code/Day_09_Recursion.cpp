#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int factorial(int value) {
    if ((value <= 1)) {
        return 1;
    } else {
        return value * (factorial(value-1));
    }
}

int main() {
    int n;
    cin >> n;
    if (n >= 2 && n <=12) {
       cout << factorial(n) << endl; 
    }
    return 0;
}

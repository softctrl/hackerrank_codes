#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <map>
using namespace std;

int main() {
    map<string, string> agenda;
    int n;
    cin >> n;
    while (n--) {
        string name;
        string phone_number;
        cin >> name >> phone_number;
        agenda.insert(make_pair(name, phone_number));
    }
    
    string query;
    while (cin >> query) {
        map<string, string>::iterator pos = agenda.find(query);
        if (pos == agenda.end()) {
            cout << "Not found" << endl;
        } else {
            cout << query << "=" << pos->second << endl;
        }
    }
    return 0;
}

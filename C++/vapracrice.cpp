#include<iostream>
#include<stdarg.h>

using namespace std;

void print(int n, ...){
    va_list list;
    va_start(list, n);

    for(int i = 0; i < n; i++){
        cout << va_arg(list, int) << endl;
    }

    va_end(list);
    
}


int main(int argc, const char** argv) {

    print(5, 1, 2, 3, 4, 5, 6);
    return 0;
}
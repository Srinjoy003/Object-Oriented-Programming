#include <iostream>
#include "classheader.h"

using namespace std;



int main(){
    Calc cal;

    cal.input();
    cout << cal.cal_add();
    return 0;
}
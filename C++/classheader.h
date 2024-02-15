#include "operations.h"
#include <iostream>

using namespace std;

class Calc{

    private:
        int a;
        int b;
    
    public:

        Calc() {
            a = 0;
            b = 0;
        }

        void input(){
            cout << "Enter two numbers: ";
            cin >> a >> b;
        }

        int cal_add(){
            return Add(a, b);
        }
};
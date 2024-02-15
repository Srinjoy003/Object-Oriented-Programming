#include <iostream>

using namespace std;

struct Complex{
    int real; 
    int imag;
};

void Add(struct Complex c1, struct Complex c2){
    c1.real += c2.real;
    c1.imag += c2.imag;

    cout << c1.real << " + " << c1.imag << "i" << endl;

}

void Multiply(struct Complex c1, struct Complex c2){
    int x = c1.real*c2.real - c1.imag*c2.imag;
    int y = c1.real*c2.imag + c1.imag*c2.real;

    cout << x << " + " << y << "i" << endl;

}


int main(){
    
    struct Complex c1, c2;

    c1.real = 1;
    c1.imag = 2;

    c2.real = 3;
    c2.imag = 4;

 
    Multiply(c1, c2);

    return 0;
}
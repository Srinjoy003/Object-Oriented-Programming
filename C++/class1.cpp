#include <iostream>

using namespace std;

class Complex{

    public:
        int real;
        int imag;


        Complex () 
            : real {0}, imag {0} {
        }
        
        Complex (int real_val) 
            :  real {real_val}, imag {0}{
        }
        
        Complex (int real_val, int imag_val) 
            :  real {real_val}, imag {imag_val}{
        }


        ~Complex(){
            cout << "Destructor executed" << endl;
        }

        

        void Add (Complex c2){
            real += c2.real;
            imag += c2.imag;
            cout << real << " + " << imag << "i" << endl;
           
        }

        void Sub (Complex c2){
            real -= c2.real;
            imag -= c2.imag;
            cout << real << " + " << imag << "i" << endl;

        }

        void Mul (Complex c2){
            int x = real*c2.real - imag*c2.imag;
            int y = real*c2.imag + imag*c2.real;
            cout << x << " + " << y << "i" << endl;

        
        }


        

};

int main(){

    Complex c1 {10,20};
    Complex c2 ;

    c1.Add(c2);

    return 0;

}
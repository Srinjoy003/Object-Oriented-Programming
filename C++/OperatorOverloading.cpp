
// 1.   Class Test has an integer array which stores marks of various tests. For example, if the array is marks[] then
// marks[1] stores the marks of subject1, marks[2] stores the marks for subject2 and so on. Overload the subscript operator so that that you can compare the marks of each subject for two objects of the test class.

// 3. Write a Java program to play lottery. The program randomly generates a lottery of a 2-digit number, prompts
// the user to enter a two-digit number and determines whether the user wins according to the following rule:
//   If the user input matches the lottery in exact order, the award is Rs.10000.
//   If the user input matches the lottery, the award is Rs.3000
//   If one digit in the user input matches a digit in the lottery, the award is Rs. 1000.




#include <iostream>

using namespace std;
 
class Complex
{
private:
    int real, imag;
public:
    Complex(int r = 0, int i =0){
        real = r;
        imag = i; 
    }

    void operator +=(Complex& C){
        this->real += C.real;
        this->imag += C.imag;
    }

    Complex operator +(Complex& C){
        int Real = real + C.real;
        int Imag = imag + C.imag;

        Complex Cn(Real, Imag);

        return Cn;
    }

    void operator ++(){
        real += 1;
        imag += 1;
    }

    void operator ++(int){
        real += 1;
        imag += 1;

    }

    Complex operator &&(Complex& C){
        Complex C3;
        C3.real = real + C.imag;
        return C3;
    }

    int& operator [] (int index){
        if (index == 0)
            return real;
        
        return imag;
    }


    friend ostream& operator << (ostream &out, Complex &c);
    friend istream& operator >> (istream &in,  Complex &c);
};
 
ostream & operator << (ostream &out, Complex &c)
{
    out << c.real;
    out << " + " << c.imag << "i" << endl;
    return out;
}
 
istream & operator >> (istream &in,  Complex &c)
{
    cout << "Enter Real Part ";
    in >> c.real;
    cout << "Enter Imaginary Part ";
    in >> c.imag;
    return in;
}

int main(){
    Complex C1(2, 4);
    Complex C2(1, 3);
    ++C1;
    cout << C1;

    Complex C3 = C1 && C2;
    C1 += C3;

    C3[0] = 4;
    cout << C3[0];
}
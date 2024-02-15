#include<iostream>
#include<cmath>
#include<string>

using namespace std;

class TriangleException{
    public:
        string show(){
            string msg = "Invalid Triangle";
            return msg;
        }   
};

float TriangleArea(float a, float b, float c){
    if(a + b <= c || b + c <= a || c + a <= b)
        throw TriangleException();

    float s = (a + b + c) / 2;
    float area = sqrt(s *(s-a)*(s-b)*(s-c));

    return area;
}

int main(){
    int a, b, c;
    cout << "Enter 3 sides of triangle: ";
    cin >> a >> b >> c;

    try{
        float area = TriangleArea(a, b, c);
        cout << "Triangle Area: " << area << endl;
    }

    catch(TriangleException T){
        cerr << T.show() << endl;
    }
    return 0;
}
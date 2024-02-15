/*  In a triangle, the sum of two sides is greater than the third. 
If we are given three values a, b ,c then a+b>c; b+c>a; c+a>b. 
Write an exception class of your own in C++ that will be thrown if any one of the above conditions are not satisfied. 
Else evaluate the area of a triangle and display the output.*/

#include <iostream>
#include <cmath>
#include<string>

using namespace std;

// Custom exception class for invalid triangle
class InvalidTriangleException : public exception{
    private:
        string msg = "Invalid Triangle";
    public:

        string what(){
            return "hello";
        }
        
        string GetMessage(){
            return msg;
        }
    
};

// Function to calculate the area of a triangle
double calculateTriangleArea(double a, double b, double c){
    if (a + b <= c || b + c <= a || c + a <= b) {
        throw InvalidTriangleException();
    }

    // Calculate the area using Heron's formula
    double s = (a + b + c) / 2.0;
    double area = sqrt(s * (s - a) * (s - b) * (s - c));
    return area;
}

int main() {
    double a, b, c;

    cout << "Enter the lengths of the three sides of the triangle: ";
    cin >> a >> b >> c;

    try {
        double area = calculateTriangleArea(a, b, c);
        cout << "The area of the triangle is: " << area << endl;
    } 
    catch (InvalidTriangleException e) {
        cerr << e.what() << endl;
    }

    return 0;
}

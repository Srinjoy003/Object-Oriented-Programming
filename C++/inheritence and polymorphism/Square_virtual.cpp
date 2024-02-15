#include<iostream>
using namespace std;

/*
Class square and class rectangle inherit from class shape. Do the following:-
    a)  Class shape has a method area() which is overridden in all it's child classes. 
        Use a pointer of type base class and make sure that the correct version of area() is called. 
        That is either the area defined in shape or square or rectangle will be called.

    b)  Class shape has a method perimeter() which has to be overridden in all it's child classes. How would you ensure that?
*/


class Shape{ // Abstract class = class with a pure virtual function, obkect cannot be created

    public:
        virtual void Area(){
            cout << "Undefined Area!!!" << endl;
        }

        virtual void Perimeter() = 0; //Pure virtual function
};

class Square : public Shape{
    private:
        int side;
    
    public:

        Square(int side_val) : side {side_val}{}

        void Area(){
            cout << "Square Area: " << side*side << endl;
        }

        void Perimeter(){
            cout << "Square Perimeter: " << side*4 << endl;

        }

};

class Rectangle : public Shape{
    private:
        int length;
        int breadth;
    
    public:

        Rectangle(int length_val, int breadth_val) : length {length_val}, breadth {breadth_val}{}

        void Area(){
            cout << "Rectangle Area: " << length*breadth << endl;
        }

        void Perimeter(){
            cout << "Rectangle Perimeter: " << 2*(length + breadth) << endl;

        }

};

int main(){

    Square Sq (2);
    Rectangle Rect (2, 3);
    Shape* ptr1 = &Sq;
    Shape* ptr2 = &Rect;

    ptr1->Area();
    ptr1->Perimeter();
    
    ptr2->Area();
    ptr2->Perimeter();

    
    return 0;
}

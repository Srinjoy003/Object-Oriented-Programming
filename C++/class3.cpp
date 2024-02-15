#include <iostream>
#include <cstdlib>

using namespace std;

class Shape{
    protected:
        int side;

    public:
        Shape() : side {0} {}
        Shape(int side_val) : side {side_val} {}

        void ShapeArea(){
            cout << "Area = " << side * side << endl;
        }



};

class Square : public Shape{
    public:
        Square() : Shape() {}
        Square(int side_val) : Shape(side_val) {}

        void SquareArea(){
            cout << "Square ";
            ShapeArea();
        }

};

class Rectangle : public Shape{
    private:
        int side2;

    public:
        Rectangle() {
            Shape();
            side2 = 0;

        }
        Rectangle(int side_val, int side2_val){
            side = side_val;
            side2 = side2_val;
        }

        void RectArea(){
            cout << "Rectangle Area = " << side * side2 << endl;
            
        }

};

int main(){
    Shape S1(5);
    Square Sq(7);
    Rectangle Rect(5, 7);

    S1.ShapeArea();
    Sq.SquareArea();
    Rect.RectArea();

    
    return 0;
};
#include <iostream>

using namespace std;

class Vehicle{

    protected:
        int wheels;
        int mileage;
        int speed;
};

class TwoWheeler : public Vehicle{
    private:
        int wheels {2};

    public:
        TwoWheeler(){
            mileage = 0;
            speed = 0;
        }

        void Set(int mileage_val, int speed_val){
            mileage = mileage_val;
            speed = speed_val;
        }

        void Display(){
            cout << "Wheels:" << wheels << " Mileage:" << mileage << " Speed:" << speed << endl;
        }
    
};

class FourWheeler : public Vehicle{
    private:
        int wheels {4};
        int capacity;

    public:
        void Set(int mileage_val, int speed_val, int capacity_val){
            mileage = mileage_val;
            speed = speed_val;
            capacity = capacity_val;
        }

        void Display(){
            cout << "Wheels:" << wheels << " Mileage:" << mileage << " Speed:" << speed << " Capacity:"<< capacity << endl;;
        }
    
};

int main(){

    TwoWheeler bike;
    FourWheeler car;

    bike.Set(10, 100);
    bike.Display();
    car.Set(20, 200 ,5);
    car.Display();

    return 0;
}
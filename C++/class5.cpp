#include <iostream>
#include <string>

using namespace std;


class Employee{

    private:
        string name;
        int age;
    
    public:
        int salary;

        Employee(){
            name = "None";
            age = 0;
            salary = 0;
        }

        Employee(string name_val, int age_val){
            name = name_val;
            age = age_val;
            salary = 0;
        }

        void Name(){
            cout << "Enter name: ";
            cin >> name;
        }

        void Age(){
            cout << "Enter age: ";
            cin >> age;
        }

        void Display(){
            cout << "Name: " << name << endl << "Age: " << age << endl;
        }
};

class Boss{

    public:
        void SetSalary(Employee& emp, int sal){
            emp.salary = sal;
        }

        void IncSalary (Employee& emp, int increment){
            emp.salary += increment;
        }

};


int main(){

    Boss baby;
    Employee A;

    A.Age();
    A.Name();
    A.Display();

    baby.SetSalary(A, 20000);
    cout << A.salary << endl;

    baby.IncSalary(A, 1000);
    cout << A.salary << endl;




    return 0;
}
#include<iostream>

using namespace std;


template<class T, class U>
U add(T a, U b){

    for(int i = 0; i < a; i++)
        b += b;
    return b;
}

template <>
int add(int a, int b){
    return a + b;
}

template<class T>
class MyClass {
    T name;

    public:

        MyClass(T name){
            this->name = name;
        }
        void display(){
            cout << "name: " << name << endl;
        }
};

template<>
class MyClass <int> {
    int id;

     public:

        MyClass(int id){
            this->id = id;
        }
        void display(){
            cout << "id: " << id << endl;
        }
};

int main(){

    // cout << add <int, string> (1, "hello");
    // cout << add(1, 2);

    MyClass <int> C(1);
    C.display();

    return 0;
}
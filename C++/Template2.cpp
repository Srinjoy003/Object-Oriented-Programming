#include <iostream>
#include <cstring>

using namespace std;

string upper(string a) {

    int size = a.length();

    for (int i = 0; i < size; i++){
        if (a[i] >= 'a' && a[i] <= 'z')
            a[i] += 'A' - 'a';
    
    }
    
    return a;
}

string lower(string a) {

    int size = a.length();

    for (int i = 0; i < size; i++){
        if (a[i] >= 'A' && a[i] <= 'Z')
            a[i] -= 'A' - 'a';
    
    }
    
    return a;
}

template <class T>
class MyClass {
 
    public:
        T add(T a, T b){
            return a + b;
        }

        T sub(T a, T b){
            return a - b;
        }

        T mul(T, T);
};

template <class T>
T MyClass<T> :: mul(T a, T b){

    return a * b;
}

template <>
class MyClass <char> {

    public:
        void Choice(string a, string b) {

            int choice;

            cout << "Enter choice(1.concat 2.upper 3.lower): ";
            cin >> choice;

            cout << "Output: ";

            if (choice == 1)
                cout << a + b << endl;
            
            else if (choice == 2)
                cout << upper(a) << " " << upper(b) << endl;

            
            else if (choice == 3)
                cout << lower(a) << " " << lower(b) << endl;

            
            else
                cout << "Invalid Choice" << endl;
            

        }
};


int main(){

    MyClass <int> myint;
    MyClass <float> myfloat;
    MyClass <char> mychar;

    cout << "Int: " << myint.add(1, 2) << " " << myint.add(1, 2) << " " << myint.mul(1, 2) << endl;
    cout << "Float: " << myfloat.add(1.1, 2.1) << " " << myfloat.add(1.1, 2.1) << " " << myfloat.mul(1.1, 2.1) << endl;

    mychar.Choice("Aa", "Bb");

    
    



    return 0;
}
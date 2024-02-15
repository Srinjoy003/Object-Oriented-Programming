

#include <iostream>

using namespace std;

int IsPrime(int num){
   
    int i;

    for (i = 2; i < num; i++){

        if (num % i == 0)
            return 0;
    }

    return 1;
}

int IsFib(int num){
    int a {0};
    int b {1};
    int c {0};

    if (num == 0)
        return 1;

    while (c <= num){
        c = a + b;
        a = b;
        b = c;

        if (c == num)
            return 1;
    }

    return 0;

}

int main(){


   
    
    int num;
    cout << "Enter the number: ";
    cin >> num;

    if (IsPrime(num))
        cout << "Prime" << endl;
    else    
        cout << "Not Prime" << endl;


    if (IsFib(num))
        cout << "Fibonacci" << endl;
    else    
        cout << "Not Fibonacci" << endl;
    

    return 0;
}
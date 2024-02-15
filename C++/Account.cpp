#include <iostream>
#include <cstdlib>
#include <string>

using namespace std;

class Account{

    private:
        int AccNo;
        int balance;
        string name;

    public:

        Account(string name_val, int balance_val){
            name = name_val;
            balance = balance_val;
            AccNo = rand();
        }

        void Transfer(Account& A, int val){
            
            if (val > balance)
                cout << "Insufficient Funds for Transfer" << endl;
            
            else{

                A.balance += val;
                balance -= val;
            }
        }

        void Transfer(Account* A, int val){
            
            if (val > balance)
                cout << "Insufficient Funds for Transfer" << endl;
            
            else{

                A -> balance += val;
                balance -= val;
            }
        }

        Account transfer(Account A, int val){
            
            if (val > balance)
                cout << "Insufficient Funds for Transfer" << endl;
            
            else{

                A.balance += val;
                balance -= val;
            }

            return A;
        }

        void Display() {

            cout << "Account no: "<< AccNo << " Name: " << name << " Balance: " << balance << endl;
        }
};

int main(){

    Account A ("Jack", 1000);
    Account B ("James", 10000);

    Account *a = &A;
    Account *b = &B;

    A.Display();
    B.Display();

    cout << endl << endl;

    B = A.transfer(B, 500);

    A.Display();
    B.Display();

    cout << endl << endl;

    A = B.transfer(A, 6000);

    A.Display();
    B.Display();


}
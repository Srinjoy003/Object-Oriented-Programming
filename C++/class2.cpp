#include <iostream>
#include <cstdlib>

using namespace std;

class Toss{

    private:
        bool call;
        bool outcome;
    
    public:

        Toss(){
            call = 0;
            outcome = 0;
        }

        void CallInput(){
            cout << "Enter H/T: ";
            cin >> call;
        }

        void TossCoin(){
            outcome = rand() % 2;

            if (outcome == 0)
                cout << "Tails" << endl;
            else    
                cout << "Heads" << endl;
        }

        void Output(){
            if (outcome == call)
                cout << "You Won" << endl;
            
            else    
                cout << "You Lost" << endl;

        }


};

int main(){

    Toss Coin1;

    Coin1.CallInput();
    Coin1.TossCoin();
    Coin1.Output();

    return 0;
}
#include <iostream>
#include <cstdlib>
#include <string>

using namespace std;

class Objects{

    private:
        string name;
        
        

    public:
        static int count;

        Objects(){
            count++;
        }


        Objects(string name_val){

            name = name_val;
            count++;
        }

        ~Objects(){
            cout << "Destructor called for" << name << endl;
            count--;
        }

        static void GetCount(){
            cout << count << endl;
        }
        
        
};

int Objects::count = 0;

int main(){

    {Objects A ("A");
    cout << Objects::count << endl;
    
    }
    Objects B ("B");
    cout << Objects::count << endl;
    Objects C ("C");

    cout << Objects::count << endl;

    return 0;
}
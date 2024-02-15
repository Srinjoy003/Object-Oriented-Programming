#include <iostream>

using namespace std;

struct Time{
    int hour;
    int min;
    int sec;
};

void Add(struct Time t1, struct Time t2){

    t1.hour += t2.hour;
    t1.min += t2.min;
    t1.sec += t2.sec;

    t1.min += t1.sec / 60;
    t1.sec = t1.sec % 60;
    t1.hour += t1.min / 60;
    t1.min = t1.min % 60;

    cout << t1.hour << ":" << t1.min << ":" << t1.sec << endl;
}

int main(){

    struct Time t1,t2;
    t1.hour = 10;
    t1.min = 50;
    t1.sec = 30;

    t2.hour = 9;
    t2.min = 10;
    t2.sec = 40;

    Add(t1, t2);

    return 0;
}
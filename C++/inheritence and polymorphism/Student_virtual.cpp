#include<iostream>
using namespace std;

/*
Class student has member variable roll, a setter method and a display method for roll.
Class ‘test’ inherits from class ‘student’ and has variable marks, a setter and a display method for marks. 
Class sports also inherits from student and has a variable ‘score’, a setter method and a display method which displays score. 
Class result inherits from class test and class sports, has a variable total= marks+ roll and displays score, marks ,roll and total.
*/

class Student{
    protected:
        int roll;
    
    public:
       void SetRoll(int roll_val){
        roll = roll_val;
       }

        void Display(){
            cout << "Roll: " << roll << endl;
        }

};

class Test : virtual public Student{
    protected:
        int marks;

    public:
       void SetMarks(int marks_val){
            marks = marks_val;
       }

        void Display(){
            cout << "Marks: " << marks << endl;
        }
        

};


class Sports : virtual public Student{
    protected:
        int score;
    
    public:
        void SetScore(int score_val){
            score = score_val;
       }

        void Display(){
            cout << "Score: " << score << endl;
        }

};



class Result : public Test, public Sports{
    private:
        int total;
    
    public:

        void Display(){
            total = score + roll;

            cout << "Roll: " << roll << " Marks: " << marks << " Score: " << score << endl;
            cout << "Total: " << total<< endl;
        }

};



int main(){

    Result R;
    R.SetRoll(2151058);
    R.SetMarks(100);
    R.SetScore(100);
    R.Display();

    return 0;
}



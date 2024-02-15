#include <iostream>
#include <string>

using namespace std;

class Publication {

    private:
        string title;
        int price;
    
    public:

        Publication(){
            title = "";
            price = 0;
        }
        Publication(string title_val, int price_val){
            title = title_val;
            price = price_val;
        }

        void set(string title_val, int price_val){
            title = title_val;
            price = price_val;
        }
        void get() {
            cout << "Title: " << title << " Price: " << price << endl;
        }


};

class Sales {

    private:
        int printed;
        int sold;
    
    public:

        Sales(){
            printed = 0;
            sold = 0;
        } 

        Sales(int printed_val, int sold_val){
            printed = printed_val;
            sold = sold_val;
        }

        void set(int printed_val, int sold_val){
            printed = printed_val;
            sold = sold_val;
        }

        void get() {
            cout << "Printed: " << printed << " Sold: " << sold << endl;
        }

};

class Book {

    private:
        Publication pub; //public to use set from main through book
        Sales sales;
        int pages;
        

    public:

        // Publication pub; //public to use set from main through book
        // Sales sales;
        // int pages;

      

        Book (string title, int price, int printed, int sold, int pages_val) : pub(title, price), sales(printed, sold){
            pages = pages_val;
        }
     

        void get() {
            cout << endl;
            pub.get();
            sales.get();
            cout << "Pages: " << pages << endl << endl;;
        }

};

int main(){

    Book A ("times", 25, 100, 10, 100);
    A.get();

    // B.pub.set("TImes2", 2000);

}

#include<iostream>
#include<string>
using namespace std;

/*
 Class Product has properties product_name and product_price. 
 Class GST has property gst_rate. Both the classes have properties to to set their respective methods.

 Function finalPrice, outside both the classes and friend of both the classes, 
  calculate the total price of a product and displays it along with the product name.

*/

class GST;

class Product{

    private:
        string product_name;
        int product_price;
    
    public:
        Product(string product_name_val, int product_price_val){
            product_name = product_name_val;
            product_price = product_price_val;
        }

        void set(string product_name_val, int product_price_val){
            product_name = product_name_val;
            product_price = product_price_val;
        }

        friend void FinalPrice(Product, GST);
};

class GST{

    private:
        float gst_rate;
    
    public:
        GST(float gst_rate_val)
            : gst_rate {gst_rate_val} {

        }

        void set(float gst_rate_val){
            gst_rate = gst_rate_val;
        }

        friend void FinalPrice(Product, GST);
};

void FinalPrice(Product P, GST G){
    float price = P.product_price *(1 + G.gst_rate);

    cout << "Name: " << P.product_name << " Total Price: " <<  price << endl;
}

int main(){

    Product P ("potato",50);
    GST G (0.555);
    FinalPrice(P, G);

    return 0;
}
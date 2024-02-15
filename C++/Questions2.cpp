#include <iostream>
#include <string>
#include <stdarg.h>

using namespace std;

void swap(int& a, int& b){
    
    int temp = a;
    a = b;
    b = temp;

}

void Sort(int arr[], int size){

    for(int i = 0; i < size; i++){
        for(int j = 0; j < size-i; j++){

            if (arr[j] < arr[j+1])
                swap(arr[j], arr[j+1]);
        }
    }
}

void marks(int num, ...){

    va_list list;
    va_start (list, num);

    int arr[5];
    for (int i = 0; i < num; i++){
        arr[i] = va_arg(list, int);      
    }

    Sort(arr, num);

    cout << arr[0] << " " << arr[1] << " " << arr[2] << " " << arr[0] + arr[1] + arr[2] << endl;

    va_end(list);

}

int main(){

    marks(5, 5, 4, 3, 2, 6);
    marks(3, 5, 1, 3, 2, 6);

    return 0;

}
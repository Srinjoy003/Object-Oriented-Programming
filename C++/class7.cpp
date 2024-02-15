#include <iostream>

using namespace std;

int main(){

    int arr[] {1, 2, 3, 4};

    for (int i : arr){
        cout << i << " ";
    }
    cout << endl;

    int* ptr = arr;
    int size = sizeof(arr) / sizeof(arr[0]);
    int* arr2[size];

    for (int i = 0; i < size; i++){
        arr2[i] = ptr + i;
    }

    for (int* i : arr2){
        cout << *i << " ";
    }
    cout << endl; =




    return 0;
}
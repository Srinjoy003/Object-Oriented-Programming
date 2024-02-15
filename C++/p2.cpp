#include <iostream>
#include <cstdlib>


using namespace std;

int BinarySearch(int arr[], int num, int size){
    int low {0};
    int high = size - 1;

    while (low <= high){

        int mid = (low + high) / 2;
        
        if (arr[mid] == num){
            return mid;
        }

        else if (arr[mid] < num){
            low = mid + 1;
        }

        else
            high = mid - 1;

        
    }

    return -1;


}

void InsertionSort(int arr[], int size){

    int i {0}, j, x;

    for (i = 0; i < size; i++){
        j = i - 1;
        x = arr[i];
        

        while(j > -1 && arr[j] > x){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = x;
        
    }
}

int main(){

    int N, i;
    cout << "Enter size of array: ";
    cin >> N;

    int arr[N];

    for(i = 0; i < N; i++){
        arr[i] = rand() % 10;
        cout << arr[i] << " ";
    }
    cout << endl;

    InsertionSort(arr, N);

    for(i = 0; i < N; i++){
        cout << arr[i] << " ";
    }
    cout << endl;

    cout << BinarySearch(arr,4, N) << BinarySearch(arr,26, N);

    return 0;
}
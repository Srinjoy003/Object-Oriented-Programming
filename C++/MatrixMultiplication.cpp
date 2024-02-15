#include <iostream>
#include <cstdlib>

using namespace std;

void Fill(int** arr, int row, int col){

    for (int i = 0; i < row; i++){
        for (int j = 0; j < col; j++){
            arr[i][j] = rand() % 10;
        }
    }

}

void Create(int** arr, int row, int col){
    for (int i = 0; i < row; i++)
        arr[i] = new int[col];
}

void Print (int** arr, int row, int col){

    for (int i = 0; i < row; i++){
        for (int j = 0; j < col; j++){
            cout << arr[i][j] << " ";
        }
        cout << endl;
    }
    cout << endl << endl;
}

void Delete (int** arr, int row){

    for(int i = 0; i < row; i++)
        delete[] arr[i];
    delete[] arr;
}

int main(){

    srand(time(NULL));

    int r1 = 5, c1 = 4, r2 = 4,c2 = 6, sum; 

    int** arr1 = new int*[r1];
    int** arr2 = new int*[r2];
    int** arr3 = new int*[r1];

    


    // for (int i = 0; i < r1; i++)
    //     arr1[i] = new int[c1];

    // for (int i = 0; i < r1; i++){
    //     for (int j = 0; j < c1; j++){
    //         arr1[i][j] = rand() % 10;
    //     }
    // }

    // for (int i = 0; i < r1 ;i++){
    //     for (int j = 0; j < c1; j++){
    //         cout << arr1[i][j] << " ";
    //     }
    //     cout << endl;
    // }
    // cout << endl << endl;

    // for (int i = 0; i < r2; i++)
    //     arr2[i] = new int[c2];

    // for (int i = 0; i < r1; i++)
    //     arr3[i] = new int[c2];

    

    Create(arr1, r1, c1);
    Create(arr2, r2, c2);
    Create(arr3, r1, c2);

    Fill(arr1, r1, c1);
    Fill(arr2, r2, c2);

    Print(arr1, r1, c1);
    Print(arr2, r2, c2);


    



    
    for (int i = 0; i < r1; i++){
        sum = 0;
        for (int j = 0; j < c2; j++){
            for (int k = 0; k < c1; k++){
                sum += arr1[i][k] * arr2[k][i];
            }
            arr3[i][j] = sum;
        }

    }

    Print(arr3, r1, c2);
    Delete(arr1, r1);


    return 0;
}
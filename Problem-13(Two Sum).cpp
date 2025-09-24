#include<iostream>
using namespace std;
int main()
{
    int arr[4] = {2, 7, 11, 5};
    int target = 12;
    for(int i = 0; i < 4; i++) {
        for(int j = 0; j < 4; j++) {
            int sum = arr[i] + arr[j];
            if(sum == target) {
                cout << "Got Target for " << arr[i] << " & " << arr[j];
                break;
            }
            else {
                cout << "Target Not Found" << endl;
                cout << "Searching for Target...." << endl; 
            }
        }
    }
    return 0;
}
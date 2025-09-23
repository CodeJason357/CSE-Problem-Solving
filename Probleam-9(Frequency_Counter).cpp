#include<iostream>
using namespace std;
int main()
{
    int arr[7] = {5,2,7,5,2,5,9};
    int n = 7;
    int counter[7] = {0}; 
    bool visited[7] = {false}; // Track করার জন্য

    for(int i = 0; i < n; i++) {
        if(visited[i] == true) continue; // Already counted হলে skip করবো

        for(int j = 0; j < n; j++) {
            if(arr[i] == arr[j]) {
                counter[i]++;
                visited[j] = true; // Same element পাওয়া গেলে mark করে দিলাম
            }
        }
        cout << arr[i] << " occurs " << counter[i] << " times." << endl;
    }

    return 0;
}
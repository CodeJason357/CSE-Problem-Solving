#include <iostream>
using namespace std;

void left_rotate(int arr[], int n) {
    // Save the first element
    int temp = arr[0];

    // Shift all elements one step left
    for (int i = 0; i < n-1; i++) {
        arr[i] = arr[i+1];
    }

    // Put first element at the end
    arr[n-1] = temp;

    // Print rotated array
    for (int i = 0; i < n; i++ ) {
        cout << arr[i] << " ";
    }
    cout << endl;
}

void right_rotate(int arr[], int n) {
    // Save the last element
    int temp = arr[n-1];

    // Shift all elements one step right
    for (int i = n-1; i > 0; i--) {
        arr[i] = arr[i-1];
    }

    // Put last element at the front
    arr[0] = temp;

    // Print rotated array
    for (int i = 0; i < n; i++ ) {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main() {
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;
    
    int arr[n];
    
    cout << "Enter " << n << " elements:\n";
    for (int i = 0; i < n; ++i) {
        cout << "Element " << i + 1 << ": ";
        cin >> arr[i];
    }

    cout << "Left rotated array: ";
    left_rotate(arr, n);

    cout << "Right rotated array: ";
    right_rotate(arr, n);

    return 0;
}

/*
🔸 Problem Description:
একটা array দেওয়া থাকবে। সেটাকে এক ধাপ rotate করতে হবে।
- Left Rotate → প্রথম element শেষে চলে যাবে।
- Right Rotate → শেষ element সামনে চলে আসবে।

উদাহরণ:
Input: 1 2 3 4 5
Left Rotate → 2 3 4 5 1
Right Rotate → 5 1 2 3 4

---

🔸 Hints:
1. Left rotation এর জন্য → প্রথম element টাকে save করে রাখো, 
   তারপর সব element এক ধাপ করে left shift করো, শেষে saved value টা বসাও।
2. Right rotation এর জন্য → শেষ element টাকে save করে রাখো, 
   তারপর সব element এক ধাপ করে right shift করো, প্রথম index এ saved value বসাও।

---

🔸 Dry Run (Left Rotate):
arr = [1, 2, 3, 4, 5]
temp = 1

Shift → arr = [2, 3, 4, 5, ?]
Put temp at end → arr = [2, 3, 4, 5, 1]

---

🔸 Dry Run (Right Rotate):
arr = [1, 2, 3, 4, 5]
temp = 5

Shift → arr = [?, 1, 2, 3, 4]
Put temp at start → arr = [5, 1, 2, 3, 4]

---

🔸 তোমার লেখা আগের version (Buggy):
void left_rotate(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }
    for (int i = 0; i < n; i++ ) {
        cout << arr[i] << " ";
    }
}
void right_rotate(int arr[], int n) {
    for (int i = n-1; i >= 0; i--) {
        int temp = arr[i];
        arr[i] = arr[i-1];
        arr[i-1] = temp;
    }
    for (int i = 0; i < n; i++ ) {
        cout << arr[i] << " ";
    }
}

---

🔸 Improvements:
1. এই কোড এখন এক ধাপ rotate করছে। যদি multiple step rotate করতে চাও,
   তাহলে loop চালিয়ে বারবার rotate করতে পারো।
2. Efficient version এর জন্য array reverse method ব্যবহার করা যায়।
*/
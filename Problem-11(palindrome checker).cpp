#include<iostream>
using namespace std;

int main() {
    const int n = 7;
    int arr[n];

    // Input array elements
    for(int i = 0; i < n; i++) {
        cout << "Enter " << i+1 << " = ";
        cin >> arr[i];
    }

    // Palindrome check
    bool isPalindrome = true;
    for(int i = 0; i < n / 2; i++) {
        if(arr[i] != arr[n - 1 - i]) {
            isPalindrome = false;
            break;
        }
    }

    if(isPalindrome)
        cout << "Array is a palindrome\n";
    else
        cout << "Array is not a palindrome\n";

    return 0;
}

/*
🔸 Problem Description:
একটা array দেওয়া আছে। চেক করতে হবে array টা palindrome কিনা।
Palindrome মানে হলো প্রথম থেকে পড়লে আর শেষ থেকে পড়লে elements একই হবে।

👉 Example 1:
Input: 1 2 3 2 1
Output: Array is a palindrome

👉 Example 2:
Input: 1 2 3 4 5
Output: Array is not a palindrome

---

🔸 Hints:
1. Palindrome check করতে হলে শুধু শুরু আর শেষের elements compare করলেই যথেষ্ট।
2. arr[i] == arr[n-1-i] কিনা চেক করতে হবে।
3. mismatch পাওয়া মাত্রই palindrome না বলে দেওয়া যাবে।
4. যদি কোনো mismatch না মেলে → সেটা palindrome।

---

🔸 Improvements:
1. তোমার code একদম ঠিক আছে ✅
2. Optional improvement: palindrome হলে পুরো array টাও print করা যায় (extra clarity এর জন্য)।

---

🔸 Dry Run (Input: 1 2 3 2 1):
n = 5
Loop steps:
i=0 → arr[0]=1, arr[4]=1 → equal
i=1 → arr[1]=2, arr[3]=2 → equal
Loop ends → কোনো mismatch নাই
Result: Array is a palindrome ✅

🔸 Dry Run (Input: 1 2 3 4 5):
n = 5
i=0 → arr[0]=1, arr[4]=5 → mismatch
Result: Array is not a palindrome ❌
*/
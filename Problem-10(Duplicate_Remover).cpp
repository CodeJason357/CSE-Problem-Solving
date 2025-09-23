#include<iostream>
using namespace std;
int main()
{
    const int n = 7;
    int arr[n] = {0};
    bool checker[n] = {false};

    // Input array elements
    for(int i = 0; i < n; i++) {
        cout<<"Enter " << i+1 << " = ";
        cin >> arr[i];
    }

    // Print unique elements (ignoring duplicates)
    for(int i = 0; i < n; i++) {
        if(checker[i] == true) continue;
        for(int j = 0; j < n; j++) {
            if(arr[i] == arr[j]) {
                checker[j] = true;
            }
        }
        cout << arr[i] << endl;
    }
    return 0;
}

/*
🔸 Problem Description:
একটা array দেওয়া আছে। এর মধ্যে যদি repeated elements থাকে, 
তাহলে duplicate বাদ দিয়ে শুধু unique values print করতে হবে।

উদাহরণ:
Input: 5 2 5 7 2 9 7
Output: 5 2 7 9

---

🔸 Hints:
1. প্রতিটা element কে traverse করতে হবে।
2. প্রতিটা element এর duplicate index খুঁজে বের করে mark করতে হবে (bool array দিয়ে)।
3. যদি কোনো element আগেই marked থাকে, তাহলে skip করবে।
4. যেটা প্রথমবার আসছে সেটা print করবে।

---

🔸 Improvements:
1. inner loop `j=0` থেকে না চালিয়ে `j=i+1` থেকে চালানো যায়।
   এতে নিজের index কে unnecessarily mark করতে হবে না।
2. বর্তমানে কোড কাজ করে ঠিকই, কিন্তু unnecessary self-mark করছে।
   তাই optimized logic: 
   ```cpp
   for(int j = i+1; j < n; j++) {
       if(arr[i] == arr[j]) checker[j] = true;
   }
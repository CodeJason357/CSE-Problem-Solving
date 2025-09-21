import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n;
       System.out.print("Enter number of elements you want to input in Array = ");
       n = input.nextInt();
       int[] arr = new int[n];

       // Array input
       for (int i = 0; i < n;i++) {
          System.out.print("Enter element" + (i+1) + " = ");
          arr[i] = input.nextInt();
        }

       // Print Initial Array
       System.out.print("Initial Array > ");
       for (int i = 0; i < n; i++) {
          System.out.print("[" + arr[i] + "]");
       }

       // Better readability: add a newline before reversed array
       System.out.println();  

       // Print Reversed Array
       System.out.print("Reversed Array > ");
       for (int j= n-1; j >= 0 ; j--) {
          System.out.print("[" + arr[j] + "]");
       }

       input.close();
    }
}

/*
🔸 Problem: Reverse an Array
Description:
একটা array input নিতে হবে, তারপর সেটার reversed version print করতে হবে।

👉 Example:
Input: 1 2 3 4 5
Output: 5 4 3 2 1

---

💡 Hints:
1. আগে array টা normal ভাবে input নাও।
2. Initial array print করতে পারো readability বাড়ানোর জন্য (optional)।
3. Reverse করতে হলে loop টাকে শেষ index (n-1) থেকে শুরু করতে হবে।
4. ধাপে ধাপে index কমাতে হবে → j--।
5. প্রতিটা element print করলে array টা উল্টোদিক থেকে দেখাবে।

---
🔧 Small Improvement:
- Reverse print করার আগে একটা newline দিলে output সুন্দর দেখাবে।
*/
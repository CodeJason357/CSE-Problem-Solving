import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements in array = ");
        int n = input.nextInt();
        int arr[] = new int[n];
        int even_sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element " + (i+1) + " = ");
            arr[i] = input.nextInt();
            if (arr[i] % 2 == 0) {
                even_sum = even_sum + arr[i];
            }
        }

        System.out.println("Sum of Even Numbers = " + even_sum);
        input.close();
    }
}

/*
 🔸 Problem 2: Even Sum Finder
 Description:
 একটা integer array থাকবে। তোমাকে সব even সংখ্যার যোগফল বের করতে হবে।

 Example:
 Input: 3 8 12 7 10
 Output: 30

 🔸 How to Think:
 - Even চেনার rule: (num % 2 == 0)।
 - শুরুতে sum=0 রাখো।
 - প্রতিবার even পেলেই sum = sum + num করো।
*/
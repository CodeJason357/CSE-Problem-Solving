import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements in array = ");
        int n = input.nextInt();
        int arr[] = new int[n];
        int oddCounter = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element " + (i+1) + " = ");
            arr[i] = input.nextInt();
            if (arr[i] % 2 != 0) {
                oddCounter++;
            }
        }

        System.out.println("Odd Numbers in array = " + oddCounter);
        input.close();
    }
}

/*
 🔸 Problem 1: Odd Number Counter
 Description:
 একটা integer array থাকবে। তোমাকে বের করতে হবে array-তে কতগুলো odd number আছে।

 Example:
 Input: 2 7 9 4 11 16 18 21 5 10
 Output: 5

 🔸 How to Think:
 - অনেক সংখ্যার মধ্যে odd খুঁজতে চাই।
 - Odd চেনার rule: (num % 2 != 0)।
 - প্রতিবার odd পেলে counter++ করে রাখো।
*/
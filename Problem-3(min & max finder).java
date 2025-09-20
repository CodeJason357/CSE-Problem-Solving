import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements in array = ");
        int n = input.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element " + (i+1) + " = ");
            arr[i] = input.nextInt();
        }

        int maxNum = arr[0];
        int minNum = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
            if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }

        System.out.println("Biggest Number in array = " + maxNum);
        System.out.println("Smallest Number in array = " + minNum);
        input.close();
    }
}

/*
 🔸 Problem 3: Min & Max Finder
 Description:
 একটা integer array থাকবে। তোমাকে সবচেয়ে বড় আর সবচেয়ে ছোট সংখ্যাটা বের করতে হবে।

 Example:
 Input: 2 7 9 4 11 16
 Output: Biggest = 16, Smallest = 2

 🔸 How to Think:
 - অনেক সংখ্যা থাকলে দুটো কাজ করতে হবে → সবচেয়ে বড় খুঁজব + সবচেয়ে ছোট খুঁজব।
 - প্রথমে arr[0] ধরে নাও দুটোই।
 - তারপর একে একে check করো:
    - যদি এর চেয়ে বড় পাই → biggest update।
    - যদি এর চেয়ে ছোট পাই → smallest update।
*/
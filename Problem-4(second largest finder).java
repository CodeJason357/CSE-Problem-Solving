import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements in array = ");
        int n = input.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element " + (i + 1) + " = ");
            arr[i] = input.nextInt();
        }

        int maxNum = arr[0];
        int minNum = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
            if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }

        int secondMax = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < maxNum && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second Max Number = " + secondMax);
        input.close();
    }
}

/*
 🔸 Problem 4: Second Largest Finder
 Description:
 একটা integer array থাকবে। তোমাকে second largest number বের করতে হবে।

 Example:
 Input: 2 7 9 4 11 16
 Output: Second Largest = 11

 🔸 How to Think:
 - প্রথমে max বের করো (সবচেয়ে বড়)।
 - তারপর আবার traverse করে খুঁজবে → যে সংখ্যাটা max এর চেয়ে ছোট কিন্তু সবার থেকে বড়।
 - মানে "just ছোট" biggest number।
*/
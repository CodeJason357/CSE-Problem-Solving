import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements in array = ");
        int n = input.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element " + (i + 1) + " = ");
            arr[i] = input.nextInt();
            sum = sum+arr[i];
        }
        float average = (float)sum/(float)n;
        System.out.println("Average is = " + average);
        input.close();
    }
}

// ✅ Works fine
// 💡 Improvement: You can use `double average = (double) sum / n;`
//    → gives more precision than float
/*
 * 👉 Hints:

প্রথমে sum বের করো।

তারপর সেই sum কে ভাগ করো total element দিয়ে।

Double ব্যবহার করলে fraction (decimal) গড়ও আসবে।

 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements in array = ");
        int n = input.nextInt();
        int arr[] = new int[n];
        int x;
        System.out.print("Enter x = ");
        x = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element " + (i + 1) + " = ");
            arr[i] = input.nextInt();
            if(arr[i] % x == 0) {
                System.out.println(arr[i] + " is Multiples of " + x);
            }
        }
        input.close();
    }
}

// ✅ Works fine
// 💡 Improvement: If no element is multiple of X → it will print nothing.
//    Suggestion: Add a counter to check at least one found, otherwise print "No multiples found".
/*
👉 Hints:

num % X == 0 হলে multiple।

Input থেকে X নিতে ভুলবে না।

Loop-এর মধ্যে check করো, valid হলে print করো।
 */
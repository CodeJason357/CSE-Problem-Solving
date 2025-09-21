import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements in array = ");
        int n = input.nextInt();
        int arr[] = new int[n];
        int positive_counter = 0, negative_counter = 0, zero_counter = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element " + (i + 1) + " = ");
            arr[i] = input.nextInt();
            if(arr[i] > 0) {
                positive_counter++;
            }
            else if(arr[i] < 0) {
                negative_counter++;
            }
            else {
                zero_counter++;
            }
        }
        System.out.println("Number of Positive Integers = " + positive_counter);
        System.out.println("Number of Negative Integers = " + negative_counter);
        input.close();
    }
}

// ✅ Works correctly
// 💡 Improvement: Print Zero count too → System.out.println("Zeros = " + zero_counter);
/*👉 Hints:

num > 0 → Positive counter++

num < 0 → Negative counter++

num == 0 → ignore (বা চাইলে Zero counter আলাদা রাখতে পারো)।
*/
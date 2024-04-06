import java.util.Scanner;

public class FibonacciSeries {

    /**
     * This method generates the nth Fibonacci number using recursion.
     * Time Complexity: O(2^n)
     * - The method makes two recursive calls in each step, resulting in an exponential time complexity.
     * - Each recursive call branches into two more calls, leading to a binary tree-like recursion tree.
     * @param n The index of the Fibonacci number to be generated.
     * @return The nth Fibonacci number.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: for n=0 and n=1, return n
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call to generate Fibonacci number
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        // Generate the nth Fibonacci number
        int fib = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fib);
    }
}

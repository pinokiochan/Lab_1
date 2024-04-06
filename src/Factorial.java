import java.util.Scanner;

public class Factorial {

    /**
     * This method calculates the factorial of a non-negative integer.
     * Time Complexity: O(n)
     * - The method makes a recursive call 'n' times, decrementing 'n' by 1 in each call.
     * - Each recursive call performs constant-time operations.
     * @param n The integer whose factorial is to be calculated.
     * @return The factorial of the integer.
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base cases: factorial of 0 and 1 is 1
        } else {
            return n * factorial(n - 1); // Recursive call to calculate factorial
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        // Calculate the factorial of the number
        int fact = factorial(num);
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}

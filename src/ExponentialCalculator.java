public class ExponentialCalculator {

    /**
     * This method calculates the exponentiation of a number 'a' to the power of 'n' using recursion.
     * Time Complexity: O(n)
     * - The method makes a recursive call 'n' times (or |n| times for negative exponents).
     * - Each recursive call performs constant-time operations.
     * @param a The base number.
     * @param n The exponent.
     * @return The result of 'a' raised to the power of 'n'.
     */
    public static double power(double a, int n) {
        if (n == 0) {
            return 1; // Base case: any number raised to the power of 0 is 1
        } else if (n > 0) {
            return a * power(a, n - 1); // Recursive call to calculate exponentiation
        } else {
            return 1 / (a * power(a, -n - 1)); // For negative exponents, return 1 / (a^n)
        }
    }

    public static void main(String[] args) {
        double a = 2;
        int n = 10;

        // Calculate a^n
        double result = power(a, n);
        System.out.println(a + " raised to the power of " + n + " is: " + result);
    }
}

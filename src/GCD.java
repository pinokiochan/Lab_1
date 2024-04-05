import java.util.Scanner;

public class GCD {

    /**
     * This method calculates the greatest common divisor (GCD) of two numbers using recursion.
     * @param a The first number.
     * @param b The second number.
     * @return The GCD of the two numbers.
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; // Base case: GCD(a, 0) = a
        } else {
            return gcd(b, a % b); // Recursive call to find GCD
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers to find their GCD: ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = gcd(n, k);
        System.out.println("GCD: " + result);
        scanner.close();
    }
}

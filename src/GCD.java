import java.util.Scanner;

public class GCD {

    /**
     * This method calculates the greatest common divisor (GCD) of two numbers using recursion.
     * @param a The first number.
     * time complexity: O(n/2), where n is the given number
     * the method iterates through numbers from n/2 to 1,
     * resulting in linear time complexity
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

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers to find their GCD: ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long startTime = System.nanoTime();
        int result = gcd(n, k);
        double runtime = (double)(System.nanoTime() - startTime)/1000000000;
        System.out.println("runtime: "+runtime + "\ntime complexity: O(n/2)");
        System.out.println("GCD: " + result);
        scanner.close();
    }
}

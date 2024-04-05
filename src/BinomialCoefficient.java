import java.util.Scanner;

public class BinomialCoefficient {

    /**
     * This method calculates the binomial coefficient C(n, k) using recursion.
     * @param n The total number of items.
     * @param k The number of items to choose.
     * @return The binomial coefficient C(n, k).
     */
    public static int binomialCoeff(int n, int k) {
        // Base cases: C(n, 0) and C(n, n) are both 1
        if (k == 0 || k == n) {
            return 1;
        } else {
            // Recursive call to calculate C(n-1, k-1) and C(n-1, k)
            return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers to find Binomial Coefficient (n k): ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = binomialCoeff(n, k);
        System.out.println("C(" + n + ", " + k + ") = " + result);
        scanner.close();
    }
}

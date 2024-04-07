import java.util.Scanner;

public class WhereIsMyPrime {

    /**
     * This method checks if a given number is prime.
     * Time Complexity: O(sqrt(n))
     * - The method iterates through numbers from 2 to sqrt(n) to check for divisibility.
     * - If n is divisible by any number in this range, it's not prime.
     * @param n The number to be checked.
     * @return True if the number is prime, otherwise false.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 1 and numbers less than or equal to 1 are not prime
        }

        // Check divisibility by numbers from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // If n is divisible by any number in this range, it's not prime
            }
        }

        return true; // If n is not divisible by any number in the range, it's prime
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }



    }
}

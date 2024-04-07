import java.util.Scanner;

public class IsDigitAll {

    /**
     * This method checks if a given string consists only of digits using recursion.
     * @param input The string to be checked.
     * @return True if the string consists only of digits, otherwise false.
     */
    public static boolean isAllDigit(String input) {
        // Base case: if the input string is empty, it consists only of digits
        if (input.isEmpty()) {
            return true;
        } else {
            char firstChar = input.charAt(0); // Get the first character of the string
            if (Character.isDigit(firstChar)) {
                // If the first character is a digit, recursively check the remaining characters
                return isAllDigit(input.substring(1));
            } else {
                // If the first character is not a digit, the string doesn't consist only of digits
                return false;
            }
        }
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        // Check if the input string consists only of digits
        if (isAllDigit(input)) {
            System.out.println(input + " : Yes");
        } else {
            System.out.println(input + " : No");
        }

        scanner.close();
    }
}

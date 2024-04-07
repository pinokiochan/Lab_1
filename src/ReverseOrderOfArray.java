import java.util.Scanner;

public class ReverseOrderOfArray {

    /**
     * This method prompts the user to enter the size of the array
     * and then calls the Reverse_Of_Sequence method to reverse the order of elements.
     *  The command-line arguments (not used).
     */
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements of the array:");
        long startTime = System.nanoTime();
        Reverse_Of_Sequence(n, scanner);
        double runtime = (double)(System.nanoTime() - startTime)/1000000000;
        System.out.println("runtime: "+runtime + "\ntime complexity: O(n/2)");
        scanner.close();
    }

    /**
     * This method reads the elements of the array from the user in reverse order using recursion.
     * @param n The number of elements to be entered.
     * @param scanner The Scanner object for input.
     */
    public static void Reverse_Of_Sequence(int n, Scanner scanner) {
        if (n > 0) {
            int num = scanner.nextInt();
            Reverse_Of_Sequence(n - 1, scanner);
            System.out.print(num + " ");
        }
    }
}

import java.util.Scanner;

public class MinimumElementFinder {

    /**
     * This method finds the minimum element in an array.
     * Time Complexity: O(n)
     * - The method iterates through the array once, comparing each element with the current minimum.
     * @param arr The input array.
     * @return The minimum element in the array.
     */
    public static int findMinimum(int[] arr) {
        int min = arr[0]; // Initialize min with the first element of the array

        // Traverse through the array to find the minimum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min if the current element is smaller
            }
        }

        return min;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        // Find the minimum element in the array
        int min = findMinimum(arr);
        System.out.println("Minimum element in the array: " + min);
    }
}

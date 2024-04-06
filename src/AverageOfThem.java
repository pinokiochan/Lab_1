import java.util.Scanner;

public class AverageOfThem {

    /**
     * This method calculates the average of elements in an array.
     * Time Complexity: O(n)
     * - The method iterates through the array once to calculate the sum of elements.
     * - It then performs constant-time operations to calculate the average.
     * @param arr The input array.
     * @return The average of elements in the array.
     */
    public static double calculateAverage(int[] arr) {
        int sum = 0; // Initialize sum to 0

        // Calculate the sum of elements in the array
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Calculate the average by dividing the sum by the number of elements
        double average = (double) sum / arr.length;

        return average;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        // Calculate the average of elements in the array
        double average = calculateAverage(arr);
        System.out.println("Average of elements in the array: " + average);
    }
}

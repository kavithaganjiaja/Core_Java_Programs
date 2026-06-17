package ArrayTasks;

import java.util.Scanner;

public class FindDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input array size
            System.out.print("Enter the number of elements in the array: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                return;
            }
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Array size must be greater than 0.");
                return;
            }

            int[] arr = new int[n];

            // Input array elements
            System.out.println("Enter " + n + " integer values:");
            for (int i = 0; i < n; i++) {
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter integers only.");
                    return;
                }
                arr[i] = scanner.nextInt();
            }

            boolean foundDuplicate = false;
            System.out.println("Duplicate values in the array:");

            // Nested for loop to find duplicates
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println(arr[i]);
                        foundDuplicate = true;
                        break; // Avoid printing the same duplicate multiple times
                    }
                }
            }

            if (!foundDuplicate) {
                System.out.println("No duplicates found.");
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}



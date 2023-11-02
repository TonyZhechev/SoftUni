package FundamentalsExercise;

import java.util.Scanner;

public class EqualArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        // Initialize arrays
        int[] array1 = new int[size];
        int[] array2 = new int[size];

        // Read elements for the first array

        for (int i = 0; i < size; i++) {
            array1[i] = scanner.nextInt();
        }

        // Read elements for the second array

        for (int i = 0; i < size; i++) {
            array2[i] = scanner.nextInt();
        }

        // Compare arrays
        int sum = 0;
        int diffIndex = -1;
        boolean areIdentical = true;

        for (int i = 0; i < size; i++) {
            if (array1[i] != array2[i]) {
                areIdentical = false;
                diffIndex = i;
                break;
            }
            sum += array1[i];
        }

        // Print the result based on the comparison
        if (areIdentical) {
            System.out.println("Arrays are identical. Sum: " + sum);
        } else {
            System.out.println("Arrays are not identical. Found difference at " + diffIndex + " index.");
        }
    }
}

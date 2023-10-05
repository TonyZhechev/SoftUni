package FundamentalsMoreExercise;

import java.util.Scanner;

public class ReversString {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the method to reverse the string
        String reversedString = reverseString(inputString);

        // Output the reversed string
        System.out.println("Reversed string: " + reversedString);

        // Close the scanner
        scanner.close();
    }

    // Method to reverse a string
    public static String reverseString(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Initialize pointers for reversing the array
        int left = 0;
        int right = charArray.length - 1;

        // Reverse the characters in the array
        while (left < right) {
            // Swap characters at left and right pointers
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }

        // Convert the character array back to string
        return new String(charArray);
    }
}


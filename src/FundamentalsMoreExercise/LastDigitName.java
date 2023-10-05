package FundamentalsMoreExercise;

import java.util.Scanner;

public class LastDigitName {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Input number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call the method and print the result
        String lastDigitName = getLastDigitName(number);
        System.out.println("The English name of the last digit is: " + lastDigitName);

        // Close the scanner
        scanner.close();
    }

    // Method to return the English name of the last digit of a number
    public static String getLastDigitName(int number) {
        // Get the last digit of the number
        int lastDigit = Math.abs(number % 10);

        // Array to store English names of digits from 0 to 9
        String[] digitNames = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        // Return the English name of the last digit
        return digitNames[lastDigit];
    }
}


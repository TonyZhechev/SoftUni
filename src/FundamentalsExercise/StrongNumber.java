package FundamentalsExercise;

import java.util.Scanner;

public class StrongNumber {
    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            int fact = 1;
            for (int i = 2; i <= num; i++) {
                fact *= i;
            }
            return fact;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int temp = number;
        int sumOfFactorials = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sumOfFactorials += factorial(digit);
            temp /= 10;
        }

        if (sumOfFactorials == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

package FundamentalsExercise;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          int StartSum=Integer.parseInt(scanner.nextLine());
          int FinalSum=Integer.parseInt(scanner.nextLine());
int sum = 0;
        for (int number = StartSum; number <=FinalSum ; number++) {
            System.out.print(number + " ");
            sum = sum + number;

        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}

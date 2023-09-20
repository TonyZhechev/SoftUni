package NestedLoops;

import java.util.Scanner;

public class Travelling {   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    while (!"End".equals(input)) {
        String country = input;
        double neededMoney = Double.parseDouble(scanner.nextLine());
        while (true) {
            double amount = Double.parseDouble(scanner.nextLine());
            neededMoney -= amount;
            if (neededMoney <= 0) {
                System.out.printf("Going to %s!%n", country);
                break;
            }
        }
        input = scanner.nextLine();
    }
}
}

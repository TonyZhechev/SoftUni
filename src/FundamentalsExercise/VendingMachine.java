package FundamentalsExercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double totalMoney = 0;

        while (!input.equals("Start")) {
            double coin = Double.parseDouble(input);
            switch ((int) (coin * 10)) {
                case 1, 2, 5, 10, 20 -> totalMoney += coin;
                default -> System.out.printf("Cannot accept %.2f%n", coin);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("End")) {
            double price;
            switch (input) {
                case "Nuts" -> price = 2.0;
                case "Water" -> price = 0.7;
                case "Crisps" -> price = 1.5;
                case "Soda" -> price = 0.8;
                case "Coke" -> price = 1.0;
                default -> {
                    System.out.println("Invalid product");
                    input = scanner.nextLine();
                    continue;
                }
            }

            if (totalMoney >= price) {
                totalMoney -= price;
                System.out.printf("Purchased %s%n", input);
            } else {
                System.out.println("Sorry, not enough money");
            }

            input = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", totalMoney);
    }
}


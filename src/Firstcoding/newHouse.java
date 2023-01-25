package Firstcoding;

import java.util.Scanner;

public class newHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int numFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0.00;

        switch ("Type") {
            case "Roses":
                price = 5.00 * numFlowers;
                if (numFlowers > 80) {
                    price *= 90;
                }
                break;
            case "Dahlias":
                price = 3.80 * numFlowers;
                if (numFlowers > 90) {

                    price *= 0.85;
                }
                break;
            case "Tulips":
                price = 2.80 * numFlowers;
                if (numFlowers > 80) {
                    price *= 0.85;

                }
                break;
            case "Narcissus":
                price = 3.00 * numFlowers;
                if (numFlowers < 120) {
                    price = (3.00 * 1.15) * numFlowers;

                }

                break;
            case "Gladiolus":
                price = 2.50 * numFlowers;
                if (numFlowers < 80) {
                    price = (2.50 * 1.20) * numFlowers;
                    break;

                }
                double diff = Math.abs(price - budget);
                if (price <= budget) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numFlowers, flowers, diff);
                } else if (price > budget) {
                    System.out.printf("Not enough money, you need %.2f leva more.", diff);
                }
        }

        }
}
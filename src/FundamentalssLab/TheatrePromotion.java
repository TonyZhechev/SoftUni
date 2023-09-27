package FundamentalssLab;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;
        boolean isValid = true;
        if (age < 0 || age > 18) {
            if (age > 18 && age <= 64) {
                if (!day.equals("Weekday")) {
                    if (day.equals("Weekend")) {
                        price = 20;

                    } else if (day.equals("Holiday")) {
                        price = 12;

                    }
                } else {
                    price = 18;
                }
            } else if (age > 64 && age <= 122) {
                if (!day.equals("Weekday")) {
                    if (day.equals("Weekend")) {
                        price = 15;
                    } else if (day.equals("Holiday")) {
                        price = 10;
                    }
                } else {
                    price = 12;

                }
            } else {
                isValid = false;
            }
        } else {
            switch (day) {
                case "Weekday" -> price = 12;
                case "Weekend" -> price = 15;
                case "Holiday" -> price = 5;
                default -> throw new IllegalStateException("Unexpected value: " + day);
            }
        }
        if (!isValid) {
            System.out.println(price + "$");
        } else {
            System.out.println("Error");
        }

    }
}

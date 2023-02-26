package exams;

import java.util.Scanner;

public class ChristmasGifts { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String command = scanner.nextLine();
    int adultsCount = 0;
    int kidsCount = 0;

    while (!command.equals("Christmas")) {
        int age = Integer.parseInt(command);
        if (age <= 16) {
            kidsCount++;

        } else {
            adultsCount++;
        }

        command = scanner.nextLine();
    }
    int toys = 5 * kidsCount;
    int sweaters = 15 * adultsCount;
    System.out.printf("Number of adults: %d%nNumber of kids: %d%nMoney for toys: %d%nMoney for sweaters: %d%n"
            , adultsCount, kidsCount, toys, sweaters);

}
}

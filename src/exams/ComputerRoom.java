package exams;

import java.util.Scanner;

public class ComputerRoom {  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

    String month = scanner.nextLine();
    int hours = Integer.parseInt(scanner.nextLine());
    int people = Integer.parseInt(scanner.nextLine());
    String dayOrNight = scanner.nextLine();

    double total = 0;
    double pricePerPerson = 0;

    switch (dayOrNight) {
        case "day":
            switch (month) {
                case "march":
                case "april":
                case "may":
                    pricePerPerson = 10.50;
                    break;
                case "june":
                case "july":
                case "august":
                    pricePerPerson = 12.60;
                    break;
            }
            break;
        case "night":
            switch (month) {
                case "march":
                case "april":
                case "may":
                    pricePerPerson = 8.40;
                    break;
                case "june":
                case "july":
                case "august":
                    pricePerPerson = 10.20;
                    break;
            }
            break;
    }
    if (people >= 4) {
        pricePerPerson -= pricePerPerson * 0.10;
    }
    if (hours >= 5) {
        pricePerPerson = pricePerPerson / 2;
    }
    total = pricePerPerson * hours * people;
    System.out.printf("Price per person for one hour: %.2f%n", pricePerPerson);
    System.out.printf("Total cost of the visit: %.2f", total);
}

}

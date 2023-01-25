package lab;

import java.util.Scanner;

public class workorholiday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String days = scanner.nextLine();
        switch (days) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;
        }


    }
}

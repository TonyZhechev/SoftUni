package FundamentalsExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double lightPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double totalSaberCost = countStudents * lightPrice;

        double TotalRobeCost = countStudents * robePrice;

        int FreeBelts = countStudents / 6;
        int beltsNeeded = countStudents - FreeBelts;
        double TotalBeltsNeeded = beltsNeeded * beltPrice;

        double TotalCoast = totalSaberCost + TotalBeltsNeeded + TotalRobeCost;

        if (TotalCoast <= budget)
            System.out.printf("The money is enough - it would cost %.2flv.", TotalCoast
            );
        else {
            System.out.printf("George Lucas will need %.2flv more.", budget);
        }


    }
}

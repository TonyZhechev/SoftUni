package exams;

import java.util.Scanner;

public class GoldMine { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int locations = Integer.parseInt(scanner.nextLine());



    for (int i = 0; i < locations ; i++) {
        double averageGold = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        double totalForLocation = 0;
        for (int j = 0; j <days ; j++) {
            double goldPerDay = Double.parseDouble(scanner.nextLine());
            totalForLocation += goldPerDay;


        }

        double averageForDay = totalForLocation / days;

        if (averageGold <= averageForDay){
            System.out.printf("Good job! Average gold per day : %.2f\n",averageForDay);

        }else {
            System.out.printf("You need %.2f\n", averageGold - averageForDay);
        }


    }


}
}

package lab;

import java.util.Scanner;

public class veggetablemarket {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double kgVeggie=Double.parseDouble(scanner.nextLine());
        double kgFruit=Double.parseDouble(scanner.nextLine());
        int totalKgVeggie=Integer.parseInt(scanner.nextLine());
        int totalKgFruit=Integer.parseInt(scanner.nextLine());

        double costVeggie = kgVeggie*totalKgVeggie;
        double costFruit= kgFruit*totalKgFruit;
        double totalCost= costFruit+costVeggie;
        System.out.printf("%.2f",totalCost / 1.94 );


    }
}

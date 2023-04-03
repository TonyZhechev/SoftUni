package lab;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String FuelType = scanner.nextLine();
        int litres= Integer.parseInt(scanner.nextLine());
         boolean validFuel= FuelType.equals("Gasoline") || FuelType.equals("Diesel") || FuelType.equals("Gas");
        if (!validFuel){
            System.out.println("Invalid fuel!");
        }if (litres >= 25){
            System.out.printf("You have enough %s.",FuelType.toLowerCase());

        }else {
            System.out.printf("Fill your tank with %s!", FuelType.toLowerCase());
        }


    }
}

package Firstcoding;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Budged= Integer.parseInt(scanner.nextLine());
              String season = scanner.nextLine();
             int numFishMans=Integer.parseInt(scanner.nextLine());

        double rentprice= 0.0;

        switch (season) {
            case "Winter":
                rentprice=2600.0;
                break;
            case "Summer":
            case "Autumn":
                rentprice=4200.0;
                break;
            case "Spring":
                rentprice=3000.0;
                 break;
        }
        if (numFishMans<= 6 ) {
            rentprice *= 0.90;
        } else if (numFishMans <= 11) {
            rentprice *=0.85;
            
        }else {
            rentprice *=0.75;
        }
        if (numFishMans % 2 ==0 && !season.equals("Autumn"))
            rentprice *=0.95;

double diff = Math.abs( rentprice - Budged);

if (rentprice <= Budged){
    System.out.printf("Yes! You have %.2f leva left.",diff);

}else  {
    System.out.printf("Not enough money! You need %.2f leva.",diff);
}


    }
}

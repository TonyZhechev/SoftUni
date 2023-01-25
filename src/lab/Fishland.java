package lab;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ////⦁	Първи ред – цена на скумрията на килограм. Реално число в интервала [0.00…40.00]
        //⦁	Втори ред – цена на цацата на килограм. Реално число в интервала [0.00…30.00]
        //⦁	Трети ред – килограма паламуд. Реално число в интервала [0.00…50.00]
        //⦁	Четвърти ред – килограма сафрид. Реално число в интервала [0.00… 70.00]
        //⦁	Пети ред – килограма миди. Цяло число в интервала [0 ... 100]

        double Fish1Kg= Double.parseDouble(scanner.nextLine());
        double Fish2kg= Double.parseDouble(scanner.nextLine());
        double Fish3kg= Double.parseDouble(scanner.nextLine());
        double Fish4kg  = Double.parseDouble(scanner.nextLine());
        int clams=Integer.parseInt(scanner.nextLine());

        double priceOfFish3= Fish1Kg+Fish1Kg*60 ;
        double priceOfFish4= Fish2kg + Fish2kg * 80 ;
        double priceOfClams= 7.50 ;

        double sum = Fish3kg + priceOfFish3 * Fish4kg + priceOfFish4 * clams + priceOfClams;
        System.out.printf("%.2f",sum);

    }
}

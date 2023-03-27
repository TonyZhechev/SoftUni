package lab;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int VineYard = Integer.parseInt(scanner.nextLine());
        double Grapes= Double.parseDouble(scanner.nextLine());
        int Litres=Integer.parseInt(scanner.nextLine());
        int workers= Integer.parseInt(scanner.nextLine());

        double Harvest= (VineYard * 0.4) * Grapes;
        double wine = Harvest/2.5;
        double litersLeft=Math.abs(wine - Litres);
        double LitersPerPerson= litersLeft / workers;

        if (wine < Litres){
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(litersLeft));
        }else if (wine >= Litres){
            System.out.printf("Good harvest this year! Total wine: %.0f liters.", Math.floor(wine));
            System.out.println();
            System.out.printf("%s liters left -> %s liters per person.", (int)Math.ceil(litersLeft),(int) Math.ceil(LitersPerPerson));
        }

    }
}

package lab;

import java.util.AbstractCollection;
import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int numDays=Integer.parseInt(scanner.nextLine());
        int foodLeftKg=Integer.parseInt(scanner.nextLine());
        double DogFood= Double.parseDouble(scanner.nextLine());
        double CatFood=Double.parseDouble(scanner.nextLine());
        double turtleFood=Double.parseDouble(scanner.nextLine());

        double FoodForDogNeeded= numDays*DogFood;
        double FoodForCatNeeded= numDays * CatFood;
        double FoodForTurtleNeeded = (numDays * turtleFood) / 1000;
        double TotalFood= FoodForCatNeeded+FoodForTurtleNeeded+FoodForDogNeeded;
        double difference= Math.abs(foodLeftKg-TotalFood);
        if (TotalFood <=foodLeftKg){
            System.out.printf("%.0f kilos of food left.",difference);
        }else {
            System.out.printf("%.0f more kilos of food are needed.",difference);
        }
    }

}

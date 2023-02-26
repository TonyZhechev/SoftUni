package exams;

import java.util.Scanner;

public class beerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name= scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        double countBeers=Double.parseDouble(scanner.nextLine());
        double countChips=Double.parseDouble(scanner.nextLine());

        double wholeBeersPrice=countBeers * 1.20;
        double wholeChips= wholeBeersPrice * 0.45;
        double wholeChipsPrice= Math.ceil(wholeChips * countChips);
        double totalSum=wholeBeersPrice + wholeChipsPrice;

        double MoneyLeft=Math.abs(budget-totalSum);

        if (totalSum <= budget){
            System.out.printf("%s bought a snack and has %.2f leva left.",name,MoneyLeft);
        }else {
            System.out.printf("%s needs %.2f more leva!",name,MoneyLeft);
        }
    }

}

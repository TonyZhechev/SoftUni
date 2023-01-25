package Firstcoding;

import java.util.Scanner;

public class fooddelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ////Брой пилешки менюта – цяло число в интервала [0 … 99]
        //
        //· Брой менюта с риба – цяло число в интервала [0 … 99]
        //
        //· Брой вегетариански менюта – цяло число в интервала [0 … 99]
        int a = Integer.parseInt(scanner.nextLine());
        int b  = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        ////Пилешко меню – 10.35 лв.
        //
        //• Меню с риба – 12.40 лв.
        //
        //• Вегетарианско меню – 8.15 лв.
      double ChickenMenu = a * 10.35;
      double FishMenu = b * 12.40;
      double VeggieMenu= c * 8.15;
      double sum = ChickenMenu+FishMenu+VeggieMenu;
      double desert= sum * 20/100;
      double delivery= 2.50;
      double result = sum + desert + delivery;
        System.out.println(result);
      }





    }


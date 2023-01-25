package Firstcoding;

import java.util.Scanner;

public class godzilavskingkong {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        ////Бюджет за филма – реално число в интервала [1.00 … 1000000.00]
        //
        //Ред 2. Брой на статистите – цяло число в интервала [1 … 500]
        //
        //Ред 3. Цена за облекло на един статист – реално число в интервала [1.00 … 1000.00]
        double budget = Double.parseDouble(scanner.nextLine());
        int numStatist= Integer.parseInt(scanner.nextLine());
        double priceStatist= Double.parseDouble(scanner.nextLine());

        double Decor = budget * 10 / 100;
        double price = numStatist * priceStatist;
         if (numStatist > 150){
             price = price - price * 10/100;
         }

         price += budget;

         if (price > budget){
             System.out.printf("Not enough money!%nWingard needs %.2f leva more.",price - budget);
         }else {
             System.out.printf("Action!%nWingard starts filming with %.2f leva left.",budget - price);
         }



    }}


        
    


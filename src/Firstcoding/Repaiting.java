package Firstcoding;

import java.util.Scanner;

public class Repaiting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
////
        //Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]

        // Необходимо количество боя (в литри) - цяло число в интервала [1…100]

        // Количество разредител (в литри) - цяло число в интервала [1…30]

        // Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]
    int nylon = Integer.parseInt(scanner.nextLine()) + 2 ;
    int painting = Integer.parseInt(scanner.nextLine());
    int razr  = Integer.parseInt(scanner.nextLine());
    int hours = Integer.parseInt(scanner.nextLine());

    double nylonPrice= nylon * 1.50;
    double paintingPrice= painting * 14.50;
    paintingPrice = paintingPrice  +(paintingPrice * 10 / 100) ;
    double razrPrice= razr * 5.00;
    double sum = nylonPrice + paintingPrice + razrPrice + 40;
    double workers = (sum * 30 / 100 ) * hours;
    double result = sum + workers;
        System.out.println(result);


    }
}

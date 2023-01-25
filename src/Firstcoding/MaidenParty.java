package Firstcoding;

import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ///Цена на моминското парти - реално число в интервала [1.00 … 10000.00]
        //Брой любовни послания - цяло число в интервала [0… 1000]
        //Брой восъчни рози - цяло число в интервала [0 … 1000]
        //Брой ключодържатели - цяло число в интервала [0 … 1000]
        //Брой карикатури - цяло число в интервала [0 … 1000]
        //Брой късмети изненада - цяло число в интервала [0 … 1000]

        double priceParty=Double.parseDouble(scanner.nextLine());
        int love=Integer.parseInt(scanner.nextLine());
        int roses=Integer.parseInt(scanner.nextLine());
        int keys = Integer.parseInt(scanner.nextLine());
        int car=Integer.parseInt(scanner.nextLine());
        int surprise=Integer.parseInt(scanner.nextLine());

        ///Любовно послание - 0.60 лв.
        //Восъчна роза - 7.20 лв.
        //Ключодържател - 3.60 лв.
        //Карикатура - 18.20 лв.
        //Късмет изненада - 22 лв.
        double lovePrice=love * 0.60;
        double rosesPrice= roses* 7.20;
        double keysPrice=keys* 3.60;
        double carPrice=car*18.20;
        double surprisePrice=surprise * 22.00;
        double profit= lovePrice+rosesPrice+keysPrice+carPrice+surprisePrice;
        int Items= love+roses+keys+car+surprise;

        if (Items>=25) {
        profit=profit-(profit*35);

        }
        double totalProfit = profit - (profit*0.10);
        if (totalProfit>priceParty) {
            System.out.printf ("Yes! %.2f lv left.",totalProfit-priceParty);
        }
        else {
            System.out.printf("Not enough money! %.2f lv needed.",priceParty-totalProfit);
        }





    }
}

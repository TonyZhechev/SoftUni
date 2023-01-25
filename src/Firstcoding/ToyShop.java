package Firstcoding;


import java.util.Scanner;

public class ToyShop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //2. Брой пъзели - цяло число в интервала [0… 1000]

        //3. Брой говорещи кукли - цяло число в интервала [0 … 1000]

        //4. Брой плюшени мечета - цяло число в интервала [0 … 1000]

        //5. Брой миньони - цяло число в интервала [0 … 1000]

        //6. Брой камиончета - цяло число в интервала [0 … 1000]


        double holyDays = Double.parseDouble(scanner.nextLine());
        int puzzel = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int tedyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());


        double puzzelPrice= puzzel * 2.60;
        double dollsPrice= dolls * 3.00;
        double teddyBearPrice = tedyBears * 4.10;
        double MinionsPrice = minions * 8.20;
        double truckPrice = trucks * 2.00;

        double profit= puzzelPrice + dollsPrice + teddyBearPrice + MinionsPrice + truckPrice;
        int countToys = puzzel + dolls +minions + tedyBears + trucks;

        if (countToys >= 50){
            profit = profit - ( profit * 0.25);
        }
        double TotalProfit = profit - ( profit * 0.10);
        if (TotalProfit >= holyDays){
            System.out.printf("Yes! %.2f lv left.",TotalProfit - holyDays);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.",holyDays-TotalProfit);
        }


    }
}










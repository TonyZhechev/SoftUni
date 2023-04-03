package lab;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double FirstRow=Double.parseDouble(scanner.nextLine());
        double SecondRow=Double.parseDouble(scanner.nextLine());
        String thirdRow=scanner.nextLine();

        double price=0;
        double people= FirstRow+SecondRow;

        switch (thirdRow) {
            case "trail":
                price = FirstRow * 5.50 + SecondRow * 7.00;
                break;
            case "cross-country":
                if (people >= 50) {
                    price = (FirstRow * 8.00 + SecondRow * 9.50) * 0.75;
                } else
                    price = FirstRow * 8.00 + SecondRow * 9.50;
                break;
            case " downhill":
                price = FirstRow * 12.25 + SecondRow * 13.75;
                break;
            case "road":
                price= FirstRow * 20.00 + SecondRow * 21.50;
                break;
        }
        System.out.printf("%.2f",price*0.95);



    }
}

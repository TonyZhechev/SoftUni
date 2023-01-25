package lab;

import java.util.Scanner;

public class ExamExcursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       ///Броят на хората в групата – цяло число в интервала [0 … 50]
        //Броят на нощувките – цяло число в интервала [0 … 2000]
        //Броят на картите за транспорт – цяло число в интервала [0… 2000]
        //Броят на билетите за музеи – цяло число в интервала [0 … 2000]

        int numOfPeople= Integer.parseInt(scanner.nextLine());
        int numOfNights=Integer.parseInt(scanner.nextLine());
        int NumCards=Integer.parseInt(scanner.nextLine());
        int NumTickets=Integer.parseInt(scanner.nextLine());
        //Нощувка - 20 лв.
        //Карта за транспорт - 1.60 лв.
        //Билет за музей - 6 лв.


        double Nights =numOfNights *20.00;
        double cards = NumCards * 1.60;
        double tickets= NumTickets * 6.00;
        double onePeople= numOfNights+NumCards+NumTickets;

        double price= numOfNights + NumCards+NumTickets + onePeople;

        double TotalPrice =price * 25/100;

        System.out.println(TotalPrice);









    }
}

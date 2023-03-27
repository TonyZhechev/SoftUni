package lab;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nKm=Integer.parseInt(scanner.nextLine());
        String dayOrNight=scanner.nextLine();
        double price=0.0 ;
        double taxiRate= 0.0;

        if(dayOrNight.equals("day")){
            taxiRate=0.79;
        } if (dayOrNight.equals("night")){
            taxiRate=0.90;
        }
        if (nKm < 20){
            price=0.70 + (nKm * taxiRate);
        } else if (nKm< 100) {
            price=0.09 * nKm;
        }else {
            price=0.06 * nKm;
        }
        System.out.printf("%.2f",price);


    }
}

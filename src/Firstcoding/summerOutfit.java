package Firstcoding;

import java.util.Scanner;

public class summerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        String sweatshirt = "Sweatshirt";
        String shirt = "Shirt";
        String tShirt = "T-Shirt";
        String swimsuit="SwimSuit";
        String sneakers= "Sneakers";
        String moccasins= "Moccasins";
        String sandals = "Sandals";
        String bareFoot="BareFoot";


        boolean cold=degrees >= 10 && degrees <=18;
        boolean warm = degrees>18 && degrees<=24;
        boolean hot=degrees>= 25;


        String outfit="";
        String shoes="";

        switch (time){
            case "Morning":
                if (cold){
                    outfit = sweatshirt;
                    shoes = sneakers;

                }else if (warm){
                    outfit= shirt;
                    shoes= moccasins;
                    
                } else if (hot) {
                    outfit=tShirt;
                    shoes=sandals;


                }
                break;
                case "Afternoon":
                if (cold){
                    outfit = sweatshirt;
                    shoes = moccasins;

                }else if (warm){
                    outfit= tShirt;
                    shoes= sandals;

                } else if (hot) {
                    outfit = swimsuit;
                    shoes = bareFoot;
                }
                break;

            case "Evening":
                if (cold){
                    outfit = shirt;
                    shoes = moccasins;

                }else if (warm){
                    outfit= shirt;
                    shoes= moccasins;

                } else if (hot) {
                    outfit = shoes;
                    shoes = moccasins;
                }
                break;




        }System.out.printf("It's %d degrees, get your %s and %s.",degrees,outfit,shoes);





    }
}

package lab;

import java.util.Scanner;

public class FlowerShop { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m = Integer.parseInt(scanner.nextLine());
    int z = Integer.parseInt(scanner.nextLine());
    int r=Integer.parseInt(scanner.nextLine());
    int k = Integer.parseInt(scanner.nextLine());
    double gift= Double.parseDouble(scanner.nextLine());

    double profit= (m * 3.25 + z * 4.00 + r * 3.50 + k * 8.00) *0.95;

    if (profit >= gift){
        double left= Math.floor(profit-gift);
        System.out.printf("She is left with %.0f leva.",left);
    } else  {
        double left=Math.ceil(gift-profit);
        System.out.printf("She will have to borrow %.0f leva.",left);
    }


}
}

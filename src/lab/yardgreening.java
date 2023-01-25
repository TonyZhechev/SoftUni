package lab;

import java.util.Scanner;

public class yardgreening {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Double m2= Double.parseDouble((scan.nextLine()));
        Double priceM2 = 7.61;
        Double TotalPrice= m2 * priceM2;
        Double Discount= 0.18 * TotalPrice;
        Double Finalprice= TotalPrice - Discount;
 System.out.println("The final price is: " + Finalprice + " lv ");
 System.out.println("The discount is:" + Discount + " lv " );


}}

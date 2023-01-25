package Firstcoding;

import java.util.Scanner;

public class supliesforschool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int marks = Integer.parseInt(scanner.nextLine());
        int litres = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double pricePens= pens * 5.80;
        double priceMarks= marks * 7.20;
        double priceLitres= litres * 1.20;
         double sum = priceLitres + priceMarks + pricePens;
         double result= sum - (percentDiscount / 100.0 * sum);
        System.out.println(result);





    }}

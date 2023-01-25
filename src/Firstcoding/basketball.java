package Firstcoding;

import java.util.Scanner;

public class basketball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tax = Double.parseDouble(scan.nextLine());

        double trainers = tax - 40 / 100.00 * tax;
        double equip = trainers - 20 / 100.00 * trainers;
        double ball = equip / 4 ;
        double acc = ball / 5;
        double result= trainers + equip + ball + acc + tax;
        System.out.println(result);



    }
}

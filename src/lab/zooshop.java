package lab;

import java.util.Scanner;

public class zooshop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double dogfood= Double.parseDouble(scan.nextLine()) * 2.50;
        Double catfood= Double.parseDouble(scan.nextLine()) * 4.00;
        Double sum= dogfood+catfood;
        System.out.println(sum);
    }
}
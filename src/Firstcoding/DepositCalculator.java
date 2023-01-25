package Firstcoding;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double Deposid = Double.parseDouble(scanner.nextLine());
        int Period = Integer.parseInt(scanner.nextLine());
        Double Allnumbers = Double.parseDouble(scanner.nextLine());

        Double RatePerMounth = (Deposid / 100 * Allnumbers ) / 12;

        Double result= Deposid + Period * RatePerMounth;
        System.out.println(result);

    }
}

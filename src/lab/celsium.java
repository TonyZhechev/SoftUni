package lab;

import java.util.Scanner;

public class celsium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ////T (° F) = T (° C) × 9/5 + 32
        double Celsius= Double.parseDouble(scanner.nextLine());
        double result= Celsius * 9/5 + 32;
        System.out.printf("%.2f",result);
    }
}

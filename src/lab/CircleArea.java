package lab;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numR= Double.parseDouble(scanner.nextLine());
         double area= Math.PI * numR * numR;
         double perimeter= 2 * Math.PI * numR;
        System.out.printf ("%.2f%n%.2f",area,perimeter);


    }
}

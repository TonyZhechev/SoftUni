package Firstcoding;

import java.util.Scanner;

public class shpping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budged = Double.parseDouble(scanner.nextLine());
        int numCards = Integer.parseInt(scanner.nextLine());
        int processorsNum = Integer.parseInt(scanner.nextLine());
        int ramNum = Integer.parseInt(scanner.nextLine());
        Double total = (250 * numCards) + (((250 * numCards) * 0.35) * processorsNum) + (((250 * numCards) * 0.1) * ramNum);

        if (numCards>ramNum) {
    }   total *= 0.85;
     if (budged >= total) {
         System.out.printf("You have %.2f leva left!",budged-total);}

     else {
         System.out.printf("Not enough money! You need %.2f leva more!",total - budged);
     }
}}

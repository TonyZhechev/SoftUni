package Firstcoding;

import java.util.Scanner;

public class aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leight = Integer.parseInt(scanner.nextLine());
        int weight = Integer.parseInt(scanner.nextLine());
        int Height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        double volume = leight*weight*Height;
        double volumeLiters= volume/1000;
        double result= volumeLiters *(1-percent/100);
        System.out.println(result);


     }


}

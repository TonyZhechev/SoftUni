package Firstcoding;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Projection = scanner.nextLine();
        int row= Integer.parseInt(scanner.nextLine());
        int columns= Integer.parseInt(scanner.nextLine());
        double income = 0;

        if("Premiere".equals(Projection)) {
            income=row * columns * 12;

        }else if ("Normal".equals(Projection)){
            income= row * columns * 7.50;
            
        } else if ("Discount".equals(Projection)) {
            income=row * columns *5.00;

        }System.out.printf("%.2f leva",income);

    }
}

package exams;

import java.util.Scanner;

public class moon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double averageSpeed=Double.parseDouble(scanner.nextLine());
        double litersGasFor100=Double.parseDouble(scanner.nextLine());

        double distance = 384400 * 2;
        double time = distance / averageSpeed;
        double totalTime = time + 3;
        double fuel = litersGasFor100 * distance;

        System.out.printf("%.0f%n", Math.ceil(totalTime));
        System.out.printf("%.0f", fuel / 100);

    }
}

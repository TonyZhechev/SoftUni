package lab;

import java.util.Scanner;

public class triangleArea {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double High=Double.parseDouble(scanner.nextLine());
        double way=Double.parseDouble(scanner.nextLine());

        double area= High * way / 2;
        System.out.printf("%.2f",area);

    }
}

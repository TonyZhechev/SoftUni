package lab;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int number1 = Integer.parseInt(scanner.nextLine());
                boolean isValid = (number1 >=100 && number1 <=200 ||number1 == 0);
                if (!isValid)
        System.out.println("invalid");

    }
}

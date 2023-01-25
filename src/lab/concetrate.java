package lab;

import java.util.Scanner;

public class concetrate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String LastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town= scanner.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.",firstName,LastName,age,town);
    }
}

package FundamentalssLab;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Countries = scanner.nextLine();
        switch (Countries) {
            case ("England"), ("USA") -> System.out.println("English");
            case ("Spain"), ("Mexico"), ("Argentina") -> System.out.println("Spanish");
            default -> System.out.println("unknown");
        }

    }
}

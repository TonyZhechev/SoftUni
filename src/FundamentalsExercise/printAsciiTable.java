package FundamentalsExercise;

import java.util.Scanner;

public class printAsciiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int FirstRange= Integer.parseInt(scanner.nextLine());
        int LastRange= Integer.parseInt(scanner.nextLine());
        for (int i = FirstRange; i <= LastRange ; i++) {
            System.out.println((char)i +  "");

        }

    }
}

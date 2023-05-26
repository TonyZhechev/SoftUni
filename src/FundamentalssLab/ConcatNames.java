package FundamentalssLab;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        String name= scanner.nextLine();
        String lastname=scanner.nextLine();
        String delimiter=scanner.nextLine();

        String result= name + delimiter + lastname;

        System.out.println(result);
    }
}

package WhileLoop;

import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initSum= Integer.parseInt(scanner.nextLine());
        int sum= 0;
        while (sum < initSum){
            int currentNum= Integer.parseInt(scanner.nextLine());
        sum += currentNum;
        }
        System.out.println(sum);

    }
}

package WhileLoop;

import java.util.Scanner;

public class accountbalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inPut = scanner.nextLine();

        double sum = 0;

        while (!inPut.equals("No More Money")){
            double amount= Double.parseDouble(inPut);
            if (amount < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            sum = sum + amount;
            System.out.printf("Increase: %.2f%n",amount);
            inPut = scanner.nextLine();
        }

        System.out.printf("Total: %.2f%n",sum);



    }

}

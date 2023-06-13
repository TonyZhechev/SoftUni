package FundamentalsExercise;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] Array = scanner.nextLine()
                .split(" ");
        int countRotation = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <=  countRotation ; rotation++) {
            String firstElement = Array[0];

            for (int index  = 0; index  < Array.length - 1 ; index ++) {
                Array[index] = Array[index + 1];
                
            }
            Array[Array.length - 1]= firstElement;
        }
        System.out.println(String.join(" ",Array));


        
    }
}

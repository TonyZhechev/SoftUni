package FundamentalsExercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] firstArray= scanner.nextLine().split("\\s+");
        String [] secondArray = scanner.nextLine().split( " ");

        for (String el2 : secondArray){
            for (String el1 : firstArray){
                if (el2.equals(el1)){
                    System.out.println(el1 + " ");
                }

            }
        }
    }
}

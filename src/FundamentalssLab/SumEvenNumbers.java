package FundamentalssLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int[] numArr = Arrays.stream(input.split( " ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int sum = 0;
        for ( int i = 0; i < numArr.length ; i++) {
            int currentNum= numArr[i];
            if (currentNum % 2 == 0){
                sum +=currentNum;
            }
            
        }
        System.out.println(sum);
    }
}

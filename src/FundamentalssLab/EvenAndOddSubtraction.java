package FundamentalssLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split( " ")).mapToInt(e ->Integer.parseInt(e)).toArray();
        int evenSum=0;
        int OddSum=0;

        for (int i = 0; i <numArr.length ; i++) {
            int currentNum = numArr[i];
            if (currentNum % 2 == 0){
                evenSum += currentNum;
            }else {
                OddSum += currentNum;
            }
        }
        System.out.println(evenSum - OddSum);
            

    }
}

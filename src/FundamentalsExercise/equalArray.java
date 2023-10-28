package FundamentalsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class equalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] FirstArr = Arrays.stream(scanner.nextLine().split("")).mapToInt(Integer::parseInt).toArray();
        int[] SecondArr = Arrays.stream(scanner.nextLine().split("")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        int DiffIndex = -1;
        for (int i = 0; i < FirstArr.length; i++) {
            int FirstNum = FirstArr[i];
            int SecondNum = SecondArr[i];

            if (FirstNum == SecondNum) {
                sum += FirstNum;
            } else {
                DiffIndex = i;
                break;
            }
        }
        if (DiffIndex == -1) {
            System.out.printf("Arrays are identical. Sum: %d%n", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at 2 index.", DiffIndex);
        }
    }
}





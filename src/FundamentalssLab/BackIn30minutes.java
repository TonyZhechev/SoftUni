package FundamentalssLab;

import java.util.Scanner;

public class BackIn30minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours= Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int sumMin= (hours + 60) + min +  30;
        int resultHour= sumMin / 60;
        int resultMin= sumMin % 60;
        System.out.printf("%d:%d",resultHour,resultMin);

}}


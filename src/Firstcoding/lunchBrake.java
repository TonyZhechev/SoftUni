package Firstcoding;

import java.util.Scanner;

public class lunchBrake {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String tvSeries= scanner.nextLine();
        int durationOfTheEpisode=Integer.parseInt(scanner.nextLine());
        int durationOfTheBrake=Integer.parseInt(scanner.nextLine());
        double restOfTheBrake= durationOfTheBrake -(durationOfTheBrake / 8.0) - (durationOfTheBrake / 4.0);
        double diff=Math.ceil(Math.abs(restOfTheBrake - durationOfTheBrake));
        if(restOfTheBrake >= durationOfTheBrake) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",tvSeries,diff);
        }else {
    }
        System.out.printf("You don't have enough time to watch %s , you need %.0f more minutes.",tvSeries,diff);
}}

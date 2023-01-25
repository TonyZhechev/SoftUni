package Firstcoding;

import java.util.Scanner;

public class swimingRecord{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double recordInSec = Double.parseDouble(scanner.nextLine());
        double distanceMetres = Double.parseDouble(scanner.nextLine());
        double swimmingDistance= Double.parseDouble(scanner.nextLine());
       double Delay = Math.floor(distanceMetres / 15) * 12.5;
       double time = swimmingDistance * distanceMetres + Delay;
       if (time < recordInSec){
           System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",time);
       } else {
           System.out.printf("No, he failed! He was %.2f seconds slower.",time - recordInSec);
       }
    }
    }

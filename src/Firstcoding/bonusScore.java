package Firstcoding;

import java.util.Scanner;

public class bonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int number = Integer.parseInt(scanner.nextLine());
      double points = 0;
      if (number <= 100){
          points = 5;
      } else if (number > 1000){
          points= number * 10 / 100.00;
      } else {
          points = number * 20 / 100.00;
      }
      if (number % 2 == 0){
          points = points + 1;
      } if (number % 10==5){
            points= points += 2;
        }
        System.out.println(points);
        System.out.println(points + number);


    }

    }


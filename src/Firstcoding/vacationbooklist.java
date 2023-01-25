package Firstcoding;

import java.util.Scanner;

public class vacationbooklist {
    public static void main(String[] args) {
      Scanner scanner= new Scanner(System.in);
      int numDays=Integer.parseInt(scanner.nextLine());
      int numPages=Integer.parseInt(scanner.nextLine());
      int pages=Integer.parseInt(scanner.nextLine());
      int result= numDays / numPages / pages;
        System.out.println( result);

    }
}

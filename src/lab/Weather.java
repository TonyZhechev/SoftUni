package lab;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text= scanner.nextLine();
        if (text.equals("sunny")){
            System.out.println( "It's warm outside!");

        }else {
            System.out.println("It's cold outside!");
        }


    }
}

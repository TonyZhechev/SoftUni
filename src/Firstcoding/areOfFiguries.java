package Firstcoding;

import java.util.Scanner;

public class areOfFiguries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        if (shape.equals("square")){
            double strana= Double.parseDouble(scanner.nextLine());
            double area=strana * strana;
            System.out.printf("%.3f",area);
        } else if (shape.equals("rectangle")) {
            double strana1= Double.parseDouble(scanner.nextLine());
            double strana2=Double.parseDouble(scanner.nextLine());
            double area = strana2 * strana1;
            System.out.printf("%.3f",area);
            
        } else if (shape.equals("circle")) {
            double radius= Double.parseDouble(scanner.nextLine());
            double area = Math.PI * radius * radius;
            System.out.printf("%.3f", area);

            
        }else {
            double a = Double.parseDouble(scanner.nextLine());
            double hA= Double.parseDouble(scanner.nextLine());
            double area= a*hA/2;
            System.out.printf("%.3f",area);

        }


    }
    }




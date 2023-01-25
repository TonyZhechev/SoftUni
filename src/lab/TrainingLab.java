package lab;

import java.util.Scanner;




import java.util.Scanner;

    public class TrainingLab {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            double h = Double.parseDouble(scan.nextLine());
            double w = Double.parseDouble(scan.nextLine());

            h = h * 100;
            w = w * 100;
            int h1 = (int) Math.floor(h / 120);
            int w1 = (int) (Math.floor(w - 100)/ 70);

            int total = (w1 * h1) - 3;
            System.out.println(total);




        }
    }





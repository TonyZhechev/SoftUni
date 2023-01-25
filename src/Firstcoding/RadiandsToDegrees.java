package Firstcoding;

import java.util.Scanner;

public class RadiandsToDegrees {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 double radiands=Double.parseDouble(scan.nextLine());
 double degrees= radiands*180/ Math.PI;
        System.out.println(degrees);
    }
}

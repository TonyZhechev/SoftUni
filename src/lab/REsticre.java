package lab;

import java.util.Scanner;

public class REsticre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       String userPrint = scan.nextLine();
 Double userInPutAsDouble = Double.parseDouble (userPrint);
double result= userInPutAsDouble * 2.54;
System.out.println(result);

    }
}

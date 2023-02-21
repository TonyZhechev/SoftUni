package WhileLoop;

import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username= scanner.nextLine();
        String password = scanner.nextLine();

        String inPut= scanner.nextLine();
        while (!inPut.equals(password)){
            inPut=scanner.nextLine();
        }
        System.out.printf("Welcome %s!%n",username);
        }
    }


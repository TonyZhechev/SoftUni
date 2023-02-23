package WhileLoop;

import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inPut = scanner.nextLine();

        int minNum= Integer.MAX_VALUE;
        while (!inPut.equals("Stop")){
            int currentNum= Integer.parseInt(inPut);
            if (currentNum < minNum){
                minNum=currentNum;
            }
            inPut=scanner.nextLine();
        }System.out.println(minNum);
    }
}

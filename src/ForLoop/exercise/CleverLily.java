package ForLoop.exercise;

import java.util.Scanner;

public class CleverLily {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int age = Integer.parseInt(scanner.nextLine());
    double priceWashingMachine = Double.parseDouble(scanner.nextLine());
    int pricePerToy = Integer.parseInt(scanner.nextLine());

    //For Loop -> за всяка година
    //проверим дали е четна или нечетна -> четна - пари (брат и взема по 1лв), нечетна - играчка
    // пресмятаме колко пари е събрала -> броя на играяките * цената за 1 играчка + събраните пари от четните години
    // проверяваме дали парите стигат за пералня

    double sum = 0;
    int countToys = 0;
    double moneyEvenAge = 10;

    for (int currentAge = 1; currentAge <= age ; currentAge++) {

        if(currentAge % 2 == 0){
            //sum = sum + (currentAge * 5 - 1); // sum += currentAge * 5 - 1
            sum += moneyEvenAge;
            moneyEvenAge +=10;
            sum--;
        }else {
            countToys++;
        }

    }

    sum += countToys * pricePerToy;

    double diff = Math.abs(sum - priceWashingMachine);

    if (sum >= priceWashingMachine){
        System.out.printf("Yes! %.2f", diff);
    }else {
        System.out.printf("No! %.2f", diff);
    }


}
}

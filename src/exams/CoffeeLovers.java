package exams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoffeeLovers { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List <String> coffeList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
    int count = Integer.parseInt(scanner.nextLine());
    for (int i = 1; i <=count ; i++) {
        String input = scanner.nextLine();
        String[] commandsParts = input.split(" ");
        if(input.startsWith("Include")) {
            String currentElement = commandsParts[1];
            coffeList.add(currentElement);

        } else if(input.startsWith("Remove")) {
            if(commandsParts[1].equals("first")) {
                int countCoffeeToRemove = Integer.parseInt(commandsParts[2]);
                if(countCoffeeToRemove<=coffeList.size()) {
                    for (int j = 1; j <=countCoffeeToRemove ; j++) {
                        coffeList.remove(0);
                    }
                }
            } else if(commandsParts[1].equals("last")) {
                int countCoffeeToRemove = Integer.parseInt(commandsParts[2]);
                if(countCoffeeToRemove<=coffeList.size()) {
                    for (int j = 1; j <=countCoffeeToRemove ; j++) {
                        coffeList.remove(coffeList.size()-1);
                    }
                }

            }

        } else if (input.startsWith("Prefer")) {
            int firstIndex = Integer.parseInt(commandsParts[1]);
            int secondIndex = Integer.parseInt(commandsParts[2]);
            if(firstIndex>=0 && firstIndex<=coffeList.size()-1 && secondIndex>=0 && secondIndex<=coffeList.size()-1) {
                String firstCoffee = coffeList.get(firstIndex);
                String secondCoffe = coffeList.get(secondIndex);
                coffeList.set(firstIndex,secondCoffe);
                coffeList.set(secondIndex,firstCoffee);
            }
        } else if (input.startsWith("Reverse")) {

            Collections.reverse(coffeList);

        }
    }
    System.out.println("Coffees:");

    for (String element:coffeList) {
        System.out.printf("%s ",element);
    }
}
}

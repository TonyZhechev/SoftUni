package NestedLoops;

import java.util.Scanner;

public class Building {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int countOfFloors = Integer.parseInt(scanner.nextLine());
    int countOfRooms = Integer.parseInt(scanner.nextLine());

    for (int f = countOfFloors; f > 0; f--) {
        String type;
        if (f == countOfFloors) {
            type = "L";
        } else if (f % 2 == 1) {
            type = "A";
        } else {
            type = "O";
        }
        for (int r = 0; r < countOfRooms; r++) {
            System.out.printf("%s%d%d ", type, f, r);
        }
        System.out.println();
    }
}
}

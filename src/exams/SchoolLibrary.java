package exams;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class SchoolLibrary {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String initialShelfWithBooks = myObj.nextLine();
        LinkedList<String> shelfWithBooks = new LinkedList<String>();

        Collections.addAll(shelfWithBooks, initialShelfWithBooks.split("&"));

        String command = "";
        while(!(command = myObj.nextLine()).equals("Done")) {
            String[] commandArg = command.split(" ");
            System.out.println(command);
            System.out.println(commandArg[0]);
            System.out.println(commandArg[1]);
            System.out.println(commandArg[0].trim().toLowerCase());
            switch(commandArg[0].trim().toLowerCase()) {
                case "add book":
                    if(!shelfWithBooks.contains(commandArg[1].trim())) {
                        shelfWithBooks.addFirst(commandArg[1].trim());
                    }
                    break;
                case "take book":
                    if(shelfWithBooks.contains(commandArg[1].trim())) {
                        shelfWithBooks.remove(commandArg[1].trim());
                    }
                    break;
                case "swap book":
                    if(shelfWithBooks.contains(commandArg[1].trim()) && shelfWithBooks.contains(commandArg[2].trim())) {
                        Collections.swap(shelfWithBooks, shelfWithBooks.indexOf(commandArg[1].trim()), shelfWithBooks.indexOf(commandArg[2].trim()));
                    }
                    break;
                case "insert book":
                    if(!shelfWithBooks.contains(commandArg[1].trim())) {
                        shelfWithBooks.add(commandArg[1].trim());
                    }
                    break;
                case "check book":
                    if(shelfWithBooks.contains(commandArg[1].trim())) {
                        int index=Integer.parseInt(commandArg[1].trim());
                        System.out.println(shelfWithBooks.get(index));
                    }
                    break;
            }
        }

        System.out.print(shelfWithBooks.toString().substring(1, shelfWithBooks.toString().length()));


    }
}

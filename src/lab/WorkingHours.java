package lab;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int WorkingHours = Integer.parseInt(scanner.nextLine());
        String DaysOfWeek = scanner.nextLine();
        boolean IsWorkingDays = DaysOfWeek.equals("Monday") ||
                DaysOfWeek.equals("Tuesday") ||
                DaysOfWeek.equals("Wednesday") ||
                DaysOfWeek.equals("Thursday") ||
                DaysOfWeek.equals("Friday") ||
                DaysOfWeek.equals("Saturday");

        boolean iSWorkingHours = WorkingHours >= 10 && WorkingHours <= 18;
        if (iSWorkingHours && IsWorkingDays){
        System.out.println("open");}
        else  {
            System.out.println("closed");

        }


    }}

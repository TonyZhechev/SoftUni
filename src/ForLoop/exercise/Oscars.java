package ForLoop.exercise;

import java.util.Scanner;

public class Oscars { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Четем входните данни
    //Правим цикъл n -> в зависимост от броя оценяващи
    //Прочитаме името на оценяващия + оценката
    //Прибавяме към общата оценка -> дължината не името * оценката, която е дал / 2
    //Проверяваме дали актьорът е минал 1250.5 - > взема оскър
    //Проверяваме дали актьорът е минал 1250.5 и ако не ги е минал -> не взема оскър


    String actorName = scanner.nextLine();
    double academyPoints = Double.parseDouble(scanner.nextLine());
    int countExaminers = Integer.parseInt(scanner.nextLine());

    double sumAllPoints = academyPoints;

    for (int i = 1; i <= countExaminers ; i++) {

        String examinerName = scanner.nextLine();
        double currentPoint = Double.parseDouble(scanner.nextLine());

        sumAllPoints += (examinerName.length() * currentPoint) / 2;

        if (sumAllPoints >= 1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, sumAllPoints);
            break;
        }
    }

    if(sumAllPoints < 1250.5){

        System.out.printf("Sorry, %s you need %.1f more!", actorName, Math.abs(1250.5 - sumAllPoints));
    }


}
}

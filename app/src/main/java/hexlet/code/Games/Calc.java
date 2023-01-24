package hexlet.code.Games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void calc() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        int randomNumber;
        int randomNumber2;
        int randomNumberOfOperator;
        String operator;
        Random number = new Random();
        int count = 0;
        int result;

        do {
            randomNumber = number.nextInt(100) + 1;
            randomNumber2 = number.nextInt(100) + 1;
            randomNumberOfOperator = number.nextInt(4);

            if (randomNumberOfOperator == 0) {
                operator = "+";
                result = randomNumber + randomNumber2;
            } else if (randomNumberOfOperator == 1) {
                operator = "-";
                result = randomNumber - randomNumber2;
            } else if (randomNumberOfOperator == 2) {
                operator = "*";
                result = randomNumber * randomNumber2;
            } else {
                operator = ":";
                result = randomNumber / randomNumber2;
            }

            System.out.println("Question: " + randomNumber + " " + operator + " " + randomNumber2);
            System.out.print("Your answer: ");
            int answer = scan.nextInt();

            if (answer == result) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println( answer + " is wrong answer ;(. Correct answer was " + result + ".");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                break;
            }

        } while (count < 3);

        if (count == 3) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
}
package hexlet.code.Games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void progression() {
        Scanner scan = new Scanner(System.in);
        Random number = new Random();
        int startProgression;
        int stepInProgression;

        int count = 0;

        System.out.println("What number is missing in the progression?");

        do {
            int []numbersProgression = new int[5];
            StringBuilder stringQuestion = new StringBuilder();
            startProgression = number.nextInt(100) + 1;
            stepInProgression = number.nextInt(4) + 1;
            
            for (int i = 0; i < numbersProgression.length; i++) {
                numbersProgression[i] = startProgression;
                startProgression += stepInProgression;
            }

            for (int i = 0; i < numbersProgression.length; i++) {
                if (numbersProgression[i] == numbersProgression[stepInProgression]) {
                    stringQuestion.append("..").append(" ");
                } else {
                    stringQuestion.append(numbersProgression[i]).append(" ");
                }
            }

            System.out.println("Question: " + stringQuestion);
            System.out.print("Your answer: ");
            int answer = scan.nextInt();

            if (answer == numbersProgression[stepInProgression]) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println( answer + " is wrong answer ;(. Correct answer was " + numbersProgression[stepInProgression] + ".");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                break;
            }


        } while (count < 3);

        if (count == 3) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
}

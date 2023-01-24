package hexlet.code.Games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void gcd() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.");
        int randomNumber;
        int randomNumber2;
        Random number = new Random();
        int count = 0;
        int result = 1;

        do {
            randomNumber = number.nextInt(100) + 1;
            randomNumber2 = number.nextInt(100) + 1;

            System.out.println("Question: " + randomNumber + " " + randomNumber2);
            System.out.print("Your answer: ");
            int answer = scan.nextInt();

            for (int i = 1; i <= randomNumber && i <= randomNumber2; i++) {
                if (randomNumber % i == 0 && randomNumber2 % i == 0) {
                    result = i;
                }
            }

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
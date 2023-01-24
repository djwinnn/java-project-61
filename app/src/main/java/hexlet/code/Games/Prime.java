package hexlet.code.Games;
import hexlet.code.Cli;
import java.util.Random;
import java.util.Scanner;
public class Prime {
    public static void prime() {
        Scanner scan = new Scanner(System.in);
        Random number = new Random();
        double randomNumber;
        int count = 0;

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        do {
            String result = "";
            randomNumber = number.nextInt(100) + 1;

            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = scan.nextLine();

            for (int i = 2; i <= randomNumber / 2; ++i) {
                if (randomNumber % i == 0) {
                    result = "no";
                    break;
                }
                result = "yes";
            }


            if (result.equals(answer) && result.equals("yes")) {
                System.out.println("Correct!");
                count++;
            } else if (result.equals(answer) && result.equals("no")){
                System.out.println("Correct!");
                count++;
            } else if (!result.equals(answer) && result.equals("yes")) {
                System.out.println( answer + " is wrong answer ;(. Correct answer was " + result + ".");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                break;
            } else if (!result.equals(answer) && result.equals("no")) {
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
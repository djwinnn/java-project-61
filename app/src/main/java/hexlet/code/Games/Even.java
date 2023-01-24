package hexlet.code.Games;
import hexlet.code.Cli;
import java.util.Random;
import java.util.Scanner;
public class Even {
    public static void even() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        double randomNumber;
        Random number = new Random();
        int count = 0;
        do {
            randomNumber = number.nextInt(100) + 1;
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = scan.nextLine();

            if (answer.equals("yes") && randomNumber % 2 == 0) {
                System.out.println("Correct!");
                count++;
            } else if (answer.equals("no") && !(randomNumber % 2 == 0)) {
                System.out.println("Correct!");
                count++;
            } else if (answer.equals("yes") && !(randomNumber % 2 == 0)) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, " + Cli.getName() + "!");
                break;
            } else if (answer.equals("no") && (randomNumber % 2 == 0)) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n" +
                        "Let's try again, "+ Cli.getName() +"!");
                break;
            } else {
                System.out.println("Wrong answer ;(");
                break;
            }
        } while (count < 3);

        if (count == 3) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
}

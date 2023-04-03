package hexlet.code;
import java.util.Objects;
import java.util.Scanner;
public class Engine {
    public static void engine(String[] questions, String[] answersMachine) {
        int count = 0;
        int maxGames = 3;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Question: " + questions[count]);
            System.out.print("Your answer: ");
            String answerUser = scan.nextLine();

            if (Objects.equals(answerUser, answersMachine[count])) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println(answerUser + " is wrong answer ;(. Correct answer was "
                        + answersMachine[count] + ". \n" +
                        "Let's try again, " + Cli.getName() + "!");
                break;
            }

        } while (count < maxGames);

        if (count == maxGames) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
}

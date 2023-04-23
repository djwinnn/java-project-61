package hexlet.code;
import java.util.Objects;
import java.util.Scanner;
public class Engine {
    public static final int NUMBER_OF_ROUNDS = 3;
    public static void engine(String[][] gameData, String taskGame) {

        int count = 0;
        Scanner scan = new Scanner(System.in);

        Cli.communication();
        System.out.println(taskGame);

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            System.out.println("Question: " + gameData[0][count]);
            System.out.print("Your answer: ");
            String answerUser = scan.nextLine();

            if (Objects.equals(answerUser, gameData[1][count])) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println(answerUser + " is wrong answer ;(. Correct answer was "
                        + gameData[1][count] + ". \n"
                        + "Let's try again, " + Cli.getName() + "!");
                break;
            }
        }

        if (count == NUMBER_OF_ROUNDS) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
}

package hexlet.code;
import java.util.Scanner;
public class Engine {
    public static final int NUMBER_OF_ROUNDS = 3;
    public static String engine(String[][] gameData, String taskGame) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(taskGame);

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            System.out.println("Question: " + gameData[0][i]);
            System.out.print("Your answer: ");
            String answerUser = scan.nextLine();

            if (answerUser.equals(gameData[1][i])) {
                System.out.println("Correct!");

            } else {
                return answerUser + " is wrong answer ;(. Correct answer was "
                        + gameData[1][i] + ". \n"
                        + "Let's try again, " + name + "!";
            }
        }

        return "Congratulations, " + name + "!";
    }
}

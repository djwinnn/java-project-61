package hexlet.code;
import java.util.Scanner;
public class Engine {
    public static final int NUMBER_OF_ROUNDS = 3;
    public static void run(String[][] gameData, String taskGame) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(taskGame);

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            System.out.println("Question: " + gameData[i][0]);
            System.out.print("Your answer: ");
            String answerUser = scan.nextLine();

            if (answerUser.equals(gameData[i][1])) {
                System.out.println("Correct!");

            } else {
                System.out.println(answerUser + " is wrong answer ;(. Correct answer was "
                        + gameData[i][1] + ". \n"
                        + "Let's try again, " + name + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }

}

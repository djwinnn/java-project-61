package hexlet.code;
import java.util.Objects;
import java.util.Scanner;
public class Engine {
    public static final int NUMBER_OF_ROUNDS = 3;
    public static void engine(String[] questions, String[] answersMachine, String taskGame) {

        int count = 0;
        System.out.println(taskGame);
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            System.out.println("Question: " + questions[count]);
            System.out.print("Your answer: ");
            String answerUser = scan.nextLine();

            if (Objects.equals(answerUser, answersMachine[count])) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println(answerUser + " is wrong answer ;(. Correct answer was "
                        + answersMachine[count] + ". \n"
                        + "Let's try again, " + Cli.getName() + "!");
                break;
            }
            // По Cli классу не совсем пойму как мне продублировать это в движок. Он у меня вызывается только в Аpp,
            // а дальше он мне и не нужен получается. Т.к приветствие есть в любом случае, и только потом игрок выбирает
            // игру и запускается игра/движок.
        }

        if (count == NUMBER_OF_ROUNDS) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
}

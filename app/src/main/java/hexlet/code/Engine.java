package hexlet.code;
import java.util.Objects;
import java.util.Scanner;
public class Engine {
    static String name;
    public static final int numberOfRounds = 3;
    public static void communication() {
        System.out.println("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();

        System.out.println("Hello, " + name + "!");
    }
    public static void engine(String[] questions, String[] answersMachine, String taskGame) {
        int count = 0;

        System.out.println(taskGame);
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
                        + answersMachine[count] + ". \n"
                        + "Let's try again, " + name + "!");
                break;
            }

        } while (count < numberOfRounds);

        if (count == numberOfRounds) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}

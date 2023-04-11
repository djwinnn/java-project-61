package hexlet.code;
import java.util.Objects;
import java.util.Scanner;
public class Engine {
    public static String getName() {
        return name;
    }
    public static String[] getQUESTIONS() {
        return QUESTIONS;
    }
    public static String[] getANSWERS_MACHINE() {
        return ANSWERS_MACHINE;
    }
    private static String name;
    public static final int NUMBER_OF_ROUNDS = 3;
    public static final int NUMBERS_LIMIT = 100;
    public static final int LIMIT_OBJECT_IN_ARRAY = 3;
    private static final String[] QUESTIONS = new String[LIMIT_OBJECT_IN_ARRAY];
    private static final String[] ANSWERS_MACHINE = new String[LIMIT_OBJECT_IN_ARRAY];
    public static void engine(String[] QUESTIONS, String[] ANSWERS_MACHINE, String taskGame) {

        int count = 0;
        System.out.println(taskGame);
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Question: " + QUESTIONS[count]);
            System.out.print("Your answer: ");
            String answerUser = scan.nextLine();

            if (Objects.equals(answerUser, ANSWERS_MACHINE[count])) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println(answerUser + " is wrong answer ;(. Correct answer was "
                        + ANSWERS_MACHINE[count] + ". \n"
                        + "Let's try again, " + name + "!");
                break;
            }

        } while (count < NUMBER_OF_ROUNDS);

        if (count == NUMBER_OF_ROUNDS) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
    public static void communication() {
        System.out.println("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();

        System.out.println("Hello, " + Engine.getName() + "!");
    }
}

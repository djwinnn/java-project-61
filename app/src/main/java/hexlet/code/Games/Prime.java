package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Prime {
    private static final Random NUMBER = new Random();
    public static final int NUMBERS_LIMIT = 100;
    public static final int LIMIT_OBJECT_IN_ARRAY = 3;
    private static final String[] QUESTIONS = new String[LIMIT_OBJECT_IN_ARRAY];
    private static final String[] ANSWERS_MACHINE = new String[LIMIT_OBJECT_IN_ARRAY];
    private static String result = "";

    public static void prime() {
        Prime.generationGameData();
        String taskGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.engine(QUESTIONS, ANSWERS_MACHINE, taskGame);
    }

    public static void generationGameData() {
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumber = NUMBER.nextInt(NUMBERS_LIMIT) + 1;
            Prime.logicGame(randomNumber);
            QUESTIONS[i] = randomNumber + " ";
            ANSWERS_MACHINE[i] = result;
        }
    }

    public static void logicGame(double randomNumber) {
        for (int i = 2; i < randomNumber; i++) {
            if (randomNumber % i == 0) {
                result = "no";
                break;
            }
            result = "yes";
        }
    }
}

package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class GCD {
    private static final Random NUMBER = new Random();
    public static final int NUMBERS_LIMIT = 100;
    public static final int LIMIT_OBJECT_IN_ARRAY = 3;
    private static final String[] QUESTIONS = new String[LIMIT_OBJECT_IN_ARRAY];
    private static final String[] ANSWERS_MACHINE = new String[LIMIT_OBJECT_IN_ARRAY];
    private static int result;

    public static void gcd() {
        GCD.generationGameData();
        String taskGame = "Find the greatest common divisor of given numbers.";
        Engine.engine(QUESTIONS, ANSWERS_MACHINE, taskGame);
    }

    public static void generationGameData() {
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumber = NUMBER.nextInt(NUMBERS_LIMIT) + 1;
            int randomNumber2 = NUMBER.nextInt(NUMBERS_LIMIT) + 1;
            GCD.logicGame(randomNumber, randomNumber2);
            QUESTIONS[i] = randomNumber + " " + randomNumber2;
            ANSWERS_MACHINE[i] = String.valueOf(result);
        }
    }

    public static void logicGame(int randomNumber, int randomNumber2) {
        for (int i = 1; i <= randomNumber && i <= randomNumber2; i++) {
            if (randomNumber % i == 0 && randomNumber2 % i == 0) {
                result = i;
            }
        }
    }
}

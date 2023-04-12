package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class GCD {
    private static final Random NUMBER = new Random();
    private static int result;

    public static int getResult() {
        return result;
    }

    public static void gcd() {
        GCD.generationGameData();
        String taskGame = "Find the greatest common divisor of given numbers.";
        Engine.engine(Engine.getQuestions(), Engine.getAnswersMachine(), taskGame);
    }

    public static void generationGameData() {
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumber = NUMBER.nextInt(Engine.NUMBERS_LIMIT) + 1;
            int randomNumber2 = NUMBER.nextInt(Engine.NUMBERS_LIMIT) + 1;
            GCD.logicGame(randomNumber, randomNumber2);
            Engine.getQuestions()[i] = randomNumber + " " + randomNumber2;
            Engine.getAnswersMachine()[i] = String.valueOf(result);
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

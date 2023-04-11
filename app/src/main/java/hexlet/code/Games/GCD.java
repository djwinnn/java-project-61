package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class GCD {
    public static Random number = new Random();
    public static int randomNumber;
    public static int randomNumber2;
    public static int result = 1;
    public static String taskGame = "Find the greatest common divisor of given numbers.";

    public static void gcd() {
        GCD.generationGameData();
        Engine.engine(Engine.getQuestions(), Engine.getAnswersMachine(), taskGame);
    }

    public static void generationGameData() {
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            randomNumber = number.nextInt(Engine.NUMBERS_LIMIT) + 1;
            randomNumber2 = number.nextInt(Engine.NUMBERS_LIMIT) + 1;
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

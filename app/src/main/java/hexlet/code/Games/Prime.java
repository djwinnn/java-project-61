package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Prime {
    private static final Random NUMBER = new Random();
    private static String result = "";

    public static void prime() {
        Prime.generationGameData();
        String taskGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.engine(Engine.getQuestions(), Engine.getAnswersMachine(), taskGame);
    }

    public static void generationGameData() {
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumber = NUMBER.nextInt(Engine.NUMBERS_LIMIT) + 1;
            Prime.logicGame(randomNumber);
            Engine.getQuestions()[i] = randomNumber + " ";
            Engine.getAnswersMachine()[i] = result;
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

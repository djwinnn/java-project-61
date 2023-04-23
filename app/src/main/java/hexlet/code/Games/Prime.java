package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Prime {
    private static final Random NUMBER = new Random();
    public static final int NUMBERS_LIMIT = 100;
    public static final int LIMIT_OBJECT_IN_ARRAY = 3;
    private static final String[][] GAME_DATA = new String[2][LIMIT_OBJECT_IN_ARRAY];
    private static String result = "";

    public static void prime() {
        Prime.generationGameData();
        String taskGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.engine(GAME_DATA, taskGame);
    }

    public static void generationGameData() {
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumber = NUMBER.nextInt(NUMBERS_LIMIT) + 1;
            Prime.logicGame(randomNumber);
            GAME_DATA[0][i] = randomNumber + " ";
            GAME_DATA[1][i] = result;
        }
    }

    public static void logicGame(double randomNumber) {
        for (int i = 2; i <= Math.sqrt(randomNumber); i++) {
            if (randomNumber % i == 0) {
                result = "no";
                break;
            }
            result = "yes";
        }
    }
}

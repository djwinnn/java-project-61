package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Even {
    private static final Random NUMBER = new Random();
    public static final int NUMBERS_LIMIT = 100;
    public static final int LIMIT_OBJECT_IN_ARRAY = 3;
    private static final String[][] GAME_DATA = new String[2][LIMIT_OBJECT_IN_ARRAY];

    public static void even() {
        generationGameData();
        String taskGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.engine(GAME_DATA, taskGame);
    }

    public static void generationGameData() {
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            double randomNumber = NUMBER.nextInt(NUMBERS_LIMIT) + 1;
            GAME_DATA[0][i] = String.valueOf(randomNumber);
            GAME_DATA[1][i] = logicGame(randomNumber);
        }
    }

    public static String logicGame(double number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}

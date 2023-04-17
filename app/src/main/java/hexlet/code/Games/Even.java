package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Even {
    private static final Random NUMBER = new Random();
    public static final int NUMBERS_LIMIT = 100;
    public static final int LIMIT_OBJECT_IN_ARRAY = 3;
    private static final String[] QUESTIONS = new String[LIMIT_OBJECT_IN_ARRAY];
    private static final String[] ANSWERS_MACHINE = new String[LIMIT_OBJECT_IN_ARRAY];

    public static void even() {
        generationGameData();
        String taskGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.engine(QUESTIONS, ANSWERS_MACHINE, taskGame);
    }

    public static void generationGameData() {
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            double randomNumber = NUMBER.nextInt(NUMBERS_LIMIT) + 1;
            QUESTIONS[i] = String.valueOf(randomNumber);
            ANSWERS_MACHINE[i] = logicGame(randomNumber);
        }
    }

    public static String logicGame(double number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}

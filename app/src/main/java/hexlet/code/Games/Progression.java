package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Progression {
    private static final Random NUMBER = new Random();
    public static final int NUMBERS_LIMIT = 100;
    public static final int LIMIT_OBJECT_IN_ARRAY = 3;
    private static final String[][] GAME_DATA = new String[2][LIMIT_OBJECT_IN_ARRAY];
    private static final int NUMBERS_LIMIT_STEPS = 4;
    private static final int NUMBERS_LIMIT_PROGRESSION = 5;
    private static int startProgression;
    private static int stepInProgression;

    public static void progression() {
        Progression.generationGameData();
        String taskGame = "What number is missing in the progression?";
        Engine.engine(GAME_DATA, taskGame);
    }

    public static void generationGameData() {
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int[] numbersProgression = new int[NUMBERS_LIMIT_PROGRESSION];
            StringBuilder stringQuestion = new StringBuilder();
            startProgression = NUMBER.nextInt(NUMBERS_LIMIT) + 1;
            stepInProgression = NUMBER.nextInt(NUMBERS_LIMIT_STEPS) + 1;
            Progression.logicGame(numbersProgression, stringQuestion);
            GAME_DATA[0][i] = String.valueOf(stringQuestion);
            GAME_DATA[1][i] = String.valueOf(numbersProgression[stepInProgression]);
        }
    }

    public static void logicGame(int[] numbersProgression, StringBuilder stringQuestion) {
        for (int i = 0; i < numbersProgression.length; i++) {
            numbersProgression[i] = startProgression;
            startProgression += stepInProgression;
        }
        for (int j : numbersProgression) {
            if (j == numbersProgression[stepInProgression]) {
                stringQuestion.append("..").append(" ");
            } else {
                stringQuestion.append(j).append(" ");
            }
        }
    }
}

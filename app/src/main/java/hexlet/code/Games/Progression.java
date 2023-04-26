package hexlet.code.Games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Progression {
    public static final int NUMBERS_LIMIT = 100;
    static String taskGame = "What number is missing in the progression?";
    private static int startProgression;
    private static int stepInProgression;

    public static void progression() {
        Engine.engine(generationGameData(), taskGame);
    }

    public static String[][] generationGameData() {
        String[][] gameData = new String[2][3];
        final int NUMBERS_LIMIT_PROGRESSION = 5;
        final int NUMBERS_LIMIT_STEPS = 4;

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int[] numbersProgression = new int[NUMBERS_LIMIT_PROGRESSION];
            StringBuilder stringQuestion = new StringBuilder();
            startProgression = Utils.getRandomInt(NUMBERS_LIMIT) + 1;
            stepInProgression = Utils.getRandomInt(NUMBERS_LIMIT_STEPS) + 1;
            Progression.logicGame(numbersProgression, stringQuestion);
            gameData[0][i] = String.valueOf(stringQuestion);
            gameData[1][i] = String.valueOf(numbersProgression[stepInProgression]);
        }
        return gameData;
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

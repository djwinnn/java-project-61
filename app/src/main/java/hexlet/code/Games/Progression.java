package hexlet.code.Games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Progression {
    public static final int NUMBERS_LIMIT = 100;
    private static int startProgression;
    private static int stepInProgression;

    public static void progression() {
        String taskGame = "What number is missing in the progression?";
        Engine.engine(generationGameData(), taskGame);
    }

    public static String[][] generationGameData() {
        final int limitObjectInArray = 3;
        final int numberLimitProgression = 5;
        final int numberLimitSteps = 4;
        String[][] gameData = new String[2][limitObjectInArray];

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int[] numbersProgression = new int[numberLimitProgression];
            StringBuilder stringQuestion = new StringBuilder();
            startProgression = Utils.getRandomInt(NUMBERS_LIMIT) + 1;
            stepInProgression = Utils.getRandomInt(numberLimitSteps) + 1;
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

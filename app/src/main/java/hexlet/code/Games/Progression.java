package hexlet.code.Games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Progression {
    static final int NUMBERS_LIMIT = 100;
    static final int LIMIT_OBJECT_IN_ARRAY = 3;
    static final int LIMIT_PROGRESSION = 5;
    static final int NUMBER_LIMIT_STEPS = 4;

    public static void progression() {
        String taskGame = "What number is missing in the progression?";
        System.out.println(Engine.engine(generationGameData(), taskGame));
    }

    public static String[][] generationGameData() {
        final int questionsAndAnswers = 2;
        String[][] gameData = new String[questionsAndAnswers][LIMIT_OBJECT_IN_ARRAY];

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int startProgression = Utils.getRandomInt(NUMBERS_LIMIT) + 1;
            int stepInProgression = Utils.getRandomInt(NUMBER_LIMIT_STEPS) + 1;
            StringBuilder progression = new StringBuilder();

            int[] progressionArray = Progression.progressionBuild(startProgression,
                    stepInProgression, LIMIT_PROGRESSION);

            for (int j : progressionArray) {
                if (j == progressionArray[stepInProgression]) {
                    progression.append("..").append(" ");
                } else {
                    progression.append(j).append(" ");
                }
            }
            gameData[0][i] = String.valueOf(progression);
            gameData[1][i] = String.valueOf(progressionArray[stepInProgression]);
        }
        return gameData;
    }

    public static int[] progressionBuild(int startProgression, int stepInProgression, int limitProgression) {
        int[] progressionArray = new int[limitProgression];

        for (int i = 0; i < limitProgression; i++) {
            progressionArray[i] = startProgression;
            startProgression += stepInProgression;
        }
        return progressionArray;
    }
}

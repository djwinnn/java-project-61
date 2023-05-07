package hexlet.code.Games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Progression {
    static final int NUMBERS_LIMIT = 100;
    static final int LIMIT_PROGRESSION = 5;
    static final int NUMBER_LIMIT_STEPS = 4;

    public static void runGame() {
        String taskGame = "What number is missing in the progression?";
        Engine.run(generateGameData(), taskGame);
    }

    public static String[][] generateGameData() {
        final int maximumGamesPerSession = 3;
        final int questionsAndAnswers = 2;
        String[][] gameData = new String[maximumGamesPerSession][questionsAndAnswers];

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int startProgression = Utils.getRandomInt(NUMBERS_LIMIT) + 1;
            int stepInProgression = Utils.getRandomInt(NUMBER_LIMIT_STEPS) + 1;
            StringBuilder progression = new StringBuilder();

            int[] progressionArray = Progression.buildProgression(startProgression,
                    stepInProgression, LIMIT_PROGRESSION);

            for (int j : progressionArray) {
                if (j == progressionArray[stepInProgression]) {
                    progression.append("..").append(" ");
                } else {
                    progression.append(j).append(" ");
                }
            }
            gameData[i][0] = String.valueOf(progression);
            gameData[i][1] = String.valueOf(progressionArray[stepInProgression]);
        }
        return gameData;
    }

    public static int[] buildProgression(int startProgression, int stepInProgression, int limitProgression) {
        int[] progressionArray = new int[limitProgression];
        for (int i = 0; i < limitProgression; i++) {
            progressionArray[i] = startProgression + stepInProgression * i;
        }
        return progressionArray;
    }
}

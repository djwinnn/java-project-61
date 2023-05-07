package hexlet.code.Games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final int NUMBERS_LIMIT = 100;


    public static void runGame() {
        String taskGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.run(generateGameData(), taskGame);
    }

    public static String[][] generateGameData() {
        final int maximumGamesPerSession = 3;
        final int questionsAndAnswers = 2;
        String[][] gameData = new String[maximumGamesPerSession][questionsAndAnswers];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            double randomNumber = Utils.getRandomInt(NUMBERS_LIMIT, 1);
            boolean boolValue = isEven(randomNumber);
            gameData[i][0] = String.valueOf(randomNumber);
            gameData[i][1] = boolValue ? "yes" : "no";
        }
        return gameData;
    }

    public static boolean isEven(double number) {
        return number % 2 == 0;
    }
}

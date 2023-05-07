package hexlet.code.Games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final int NUMBERS_LIMIT = 100;

    public static void runGame() {
        String taskGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.run(generateGameData(), taskGame);
    }

    public static String[][] generateGameData() {
        final int underestimatingRandomness = -2;
        final int maximumGamesPerSession = 3;
        final int questionsAndAnswers = 2;
        String[][] gameData = new String[maximumGamesPerSession][questionsAndAnswers];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumber = Utils.getRandomInt(NUMBERS_LIMIT, underestimatingRandomness);
            boolean boolValue = isPrime(randomNumber);
            gameData[i][0] = String.valueOf(randomNumber);
            gameData[i][1] = boolValue ? "yes" : "no";
        }
        return gameData;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

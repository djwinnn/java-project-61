package hexlet.code.Games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final int NUMBERS_LIMIT = 100;

    public static void prime() {
        String taskGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.engine(generationGameData(), taskGame);
    }

    public static String[][] generationGameData() {
        final int limitObjectInArray = 3;
        final int underestimatingRandomness = -2;
        final int questionsAndAnswers = 2;
        String[][] gameData = new String[questionsAndAnswers][limitObjectInArray];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumber = Utils.getRandomInt(NUMBERS_LIMIT, underestimatingRandomness);
            boolean boolValue = isPrime(randomNumber);
            gameData[0][i] = String.valueOf(randomNumber);
            gameData[1][i] = boolValue ? "yes" : "no";
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

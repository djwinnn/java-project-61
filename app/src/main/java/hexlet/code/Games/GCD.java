package hexlet.code.Games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static final int NUMBERS_LIMIT = 100;


    public static void gcd() {
        String taskGame = "Find the greatest common divisor of given numbers.";
        Engine.engine(generationGameData(), taskGame);
    }

    public static String[][] generationGameData() {
        String[][] gameData = new String[2][3];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumber =  Utils.getRandomInt(NUMBERS_LIMIT, 1);
            int randomNumber2 = Utils.getRandomInt(NUMBERS_LIMIT, 1);
            gameData[0][i] = randomNumber + " " + randomNumber2;
            gameData[1][i] = String.valueOf(logicGame(randomNumber, randomNumber2));
        }
        return gameData;
    }

    public static int logicGame(int randomNumber, int randomNumber2) {
        int result = 0;
        for (int i = 1; i <= randomNumber && i <= randomNumber2; i++) {
            if (randomNumber % i == 0 && randomNumber2 % i == 0) {
                result = i;
            }
        }
        return result;
    }
}

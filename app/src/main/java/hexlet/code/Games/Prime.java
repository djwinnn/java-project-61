package hexlet.code.Games;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;
public class Prime {
    public static final int NUMBERS_LIMIT = 100;
    static String taskGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void prime() {
        Engine.engine(generationGameData(), taskGame);
    }

    public static String[][] generationGameData() {
        String[][] gameData = new String[2][3];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumber = Utils.getRandomInt(NUMBERS_LIMIT, 1);
            gameData[0][i] = randomNumber + " ";
            gameData[1][i] = logicGame(randomNumber);
        }
        return gameData;
    }

    public static String logicGame(double randomNumber) {
        String result = "";
        for (int i = 2; i <= Math.sqrt(randomNumber); i++) {
            if (randomNumber % i == 0) {
                result = "no";
                break;
            }
            result = "yes";
        }
        return result;
    }
}

package hexlet.code.Games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final int NUMBERS_LIMIT = 100;


    public static void even() {
        String taskGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.engine(generationGameData(), taskGame);
    }

    public static String[][] generationGameData() {
        final int limitObjectInArray = 3;
        String[][] gameData = new String[2][limitObjectInArray];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            double randomNumber = Utils.getRandomInt(NUMBERS_LIMIT, 1);
            gameData[0][i] = String.valueOf(randomNumber);
            gameData[1][i] = logicGame(randomNumber);
        }
        return gameData;
    }

    public static String logicGame(double number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}

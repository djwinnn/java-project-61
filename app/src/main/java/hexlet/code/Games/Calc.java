package hexlet.code.Games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Calc {
    public static final int NUMBERS_LIMIT = 100;

    public static void calc() {
        String taskGame = "What is the result of the expression?";
        Engine.engine(generationGameData(), taskGame);
    }

    public static String[][] generationGameData() {
        String[][] gameData = new String[2][3];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int maximumOperators = 3;
            int randomNumberOfOperator = Utils.getRandomInt(maximumOperators);
            int randomNumber =   Utils.getRandomInt(NUMBERS_LIMIT, 1);
            int randomNumber2 = Utils.getRandomInt(NUMBERS_LIMIT, 1);
            gameData[0][i] = randomNumber + " " + operatorDefinition(randomNumberOfOperator) + " " + randomNumber2;
            gameData[1][i] = String.valueOf(logicGame(randomNumberOfOperator, randomNumber, randomNumber2));
        }
        return gameData;
    }

    public static int logicGame(int randomNumberOfOperatorArg, int randomNumberArg, int randomNumber2Arg) {
        if (randomNumberOfOperatorArg == 0) {
            return randomNumberArg + randomNumber2Arg;
        } else if (randomNumberOfOperatorArg == 1) {
            return randomNumberArg - randomNumber2Arg;
        } else {
            return randomNumberArg * randomNumber2Arg;
        }
    }

    public static String operatorDefinition(int randomNumberOfOperatorArg) {
        if (randomNumberOfOperatorArg == 0) {
            return  "+";
        } else if (randomNumberOfOperatorArg == 1) {
            return  "-";
        } else {
            return  "*";
        }
    }
}

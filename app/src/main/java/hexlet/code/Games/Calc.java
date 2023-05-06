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
        final int limitObjectInArray = 3;
        final int maximumOperators = 3;
        final int questionsAndAnswers = 2;
        String[][] gameData = new String[questionsAndAnswers][limitObjectInArray];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumberOfOperator = Utils.getRandomInt(maximumOperators);
            int randomNumber =   Utils.getRandomInt(NUMBERS_LIMIT, 1);
            int randomNumber2 = Utils.getRandomInt(NUMBERS_LIMIT, 1);
            String operator = operatorDefinition(randomNumberOfOperator);
            gameData[0][i] = randomNumber + " " + operator + " " + randomNumber2;
            gameData[1][i] = String.valueOf(calculate(operator, randomNumber, randomNumber2));
        }
        return gameData;
    }

    public static int calculate(String operator, int randomNumberArg, int randomNumber2Arg) {
        if (operator.equals("+")) {
            return randomNumberArg + randomNumber2Arg;
        } else if (operator.equals("-")) {
            return randomNumberArg - randomNumber2Arg;
        } else {
            return randomNumberArg * randomNumber2Arg;
        }
    }

    public static String operatorDefinition(int randomNumberOfOperatorArg) {
        String[] operatorsArray = new String[3];
        operatorsArray[0] = "+";
        operatorsArray[1] = "-";
        operatorsArray[2] = "*";
        return operatorsArray[randomNumberOfOperatorArg];
    }
}

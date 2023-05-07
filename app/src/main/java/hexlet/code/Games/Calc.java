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
        final int maximumOperators = 3;
        final int maximumGamesPerSession = 3;
        final int questionsAndAnswers = 2;
        String[][] gameData = new String[maximumGamesPerSession][questionsAndAnswers];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumberOfOperator = Utils.getRandomInt(maximumOperators);
            int randomNumber =   Utils.getRandomInt(NUMBERS_LIMIT, 1);
            int randomNumber2 = Utils.getRandomInt(NUMBERS_LIMIT, 1);
            String operator = operatorDefinition(randomNumberOfOperator);
            gameData[i][0] = randomNumber + " " + operator + " " + randomNumber2;
            gameData[i][1] = String.valueOf(calculate(operator, randomNumber, randomNumber2));
        }
        return gameData;
    }

    public static int calculate(String operator, int randomNumberArg, int randomNumber2Arg) {
        int result = 0;
        switch (operator) { //не понял как у нас может получится невалидный оператор. Пользователь же его не выбирает
            case "+" -> result = randomNumberArg + randomNumber2Arg;
            case "-" -> result = randomNumberArg - randomNumber2Arg;
            case "*" -> result = randomNumberArg * randomNumber2Arg;
        }
        return result;
    }


    public static String operatorDefinition(int randomNumberOfOperatorArg) {
        final int maximumOperators = 3;
        String[] operatorsArray = new String[maximumOperators];
        operatorsArray[0] = "+";
        operatorsArray[1] = "-";
        operatorsArray[2] = "*";
        return operatorsArray[randomNumberOfOperatorArg];
    }
}

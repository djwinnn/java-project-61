package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Calc {
    private static String operator;
    private static final Random NUMBER = new Random();
    private static final int OPERATORS_LIMIT = 3;
    private static int randomNumber;
    private static int randomNumber2;
    private static int randomNumberOfOperator;
    private static int result;

    public static String getOperator() {
        return operator;
    }

    public static Random getNumber() {
        return NUMBER;
    }

    public static int getRandomNumber() {
        return randomNumber;
    }

    public static int getRandomNumber2() {
        return randomNumber2;
    }

    public static int getRandomNumberOfOperator() {
        return randomNumberOfOperator;
    }

    public static int getResult() {
        return result;
    }

    public static void calc() {
        Calc.generationGameData();
        String TASK_GAME = "What is the result of the expression?";
        Engine.engine(Engine.getQuestions(), Engine.getAnswersMachine(), TASK_GAME);
    }

    public static void logicGame(int randomNumberOfOperatorArg, int randomNumberArg, int randomNumber2Arg) {
        if (randomNumberOfOperatorArg == 0) {
            operator = "+";
            result = randomNumberArg + randomNumber2Arg;
        } else if (randomNumberOfOperatorArg == 1) {
            operator = "-";
            result = randomNumberArg - randomNumber2Arg;
        } else {
            operator = "*";
            result = randomNumberArg * randomNumber2Arg;
        }
    }

    public static void generationGameData() {
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            randomNumberOfOperator = NUMBER.nextInt(OPERATORS_LIMIT);
            randomNumber = NUMBER.nextInt(Engine.NUMBERS_LIMIT) + 1;
            randomNumber2 = NUMBER.nextInt(Engine.NUMBERS_LIMIT) + 1;
            Calc.logicGame(randomNumberOfOperator, randomNumber, randomNumber2);
            Engine.getQuestions()[i] = randomNumber + " " + operator + " " + randomNumber2;
            Engine.getAnswersMachine()[i] = String.valueOf(result);
        }
    }
}

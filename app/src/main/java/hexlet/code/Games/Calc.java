package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Calc {
    private static final Random NUMBER = new Random();
    public static final int NUMBERS_LIMIT = 100;
    public static final int LIMIT_OBJECT_IN_ARRAY = 3;
    private static final String[] QUESTIONS = new String[LIMIT_OBJECT_IN_ARRAY];
    private static final String[] ANSWERS_MACHINE = new String[LIMIT_OBJECT_IN_ARRAY];
    private static String operator;
    private static int result;

    public static void calc() {
        Calc.generationGameData();
        String taskGame = "What is the result of the expression?";
        Engine.engine(QUESTIONS, ANSWERS_MACHINE, taskGame);
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
            int randomNumberOfOperator = NUMBER.nextInt(3);
            int randomNumber = NUMBER.nextInt(NUMBERS_LIMIT) + 1;
            int randomNumber2 = NUMBER.nextInt(NUMBERS_LIMIT) + 1;
            Calc.logicGame(randomNumberOfOperator, randomNumber, randomNumber2);
            QUESTIONS[i] = randomNumber + " " + operator + " " + randomNumber2;
            ANSWERS_MACHINE[i] = String.valueOf(result);
        }
    }
}

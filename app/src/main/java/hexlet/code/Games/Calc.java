package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Calc {
    public static String operator;
    public static Random number = new Random();
    public static final int OPERATORS_LIMIT = 3;
    public static int randomNumber;
    public static int randomNumber2;
    public static int randomNumberOfOperator;
    public static int result;
    public static String taskGame = "What is the result of the expression?";

    public static void calc() {
        Calc.generationGameData();
        Engine.engine(Engine.getQUESTIONS(), Engine.getANSWERS_MACHINE(), taskGame);
    }

    public static void logicGame(int randomNumberOfOperator, int randomNumber, int randomNumber2) {
        if (randomNumberOfOperator == 0) {
            operator = "+";
            result = randomNumber + randomNumber2;
        } else if (randomNumberOfOperator == 1) {
            operator = "-";
            result = randomNumber - randomNumber2;
        } else {
            operator = "*";
            result = randomNumber * randomNumber2;
        }
    }

    public static void generationGameData() {
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            randomNumberOfOperator = number.nextInt(OPERATORS_LIMIT);
            randomNumber = number.nextInt(Engine.NUMBERS_LIMIT) + 1;
            randomNumber2 = number.nextInt(Engine.NUMBERS_LIMIT) + 1;
            Calc.logicGame(randomNumberOfOperator, randomNumber, randomNumber2);
            Engine.getQUESTIONS()[i] = randomNumber + " " + operator + " " + randomNumber2;
            Engine.getANSWERS_MACHINE()[i] = String.valueOf(result);
        }
    }
}

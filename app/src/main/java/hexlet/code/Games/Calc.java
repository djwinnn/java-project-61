package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Calc {
    static String operator;
    static Random number = new Random();
    static final int OPERATORS_LIMIT = 3;
    static int randomNumber;
    static int randomNumber2;
    static int randomNumberOfOperator;
    static int result;
    static String taskGame = "What is the result of the expression?";

    public static void calc() {
        Calc.generationGameData();
        Engine.engine(Engine.getQuestions(), Engine.getAnswersMachine(), taskGame);
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
            Engine.getQuestions()[i] = randomNumber + " " + operator + " " + randomNumber2;
            Engine.getAnswersMachine()[i] = String.valueOf(result);
        }
    }
}

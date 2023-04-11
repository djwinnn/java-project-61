package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Calc {
    static String operator;
    static Random number = new Random();
    static final int numbersLimit = 100;
    static final int limitObjectInArray = 3;
    static final int operatorsLimit = 3;
    static int randomNumber;
    static int randomNumber2;
    static int randomNumberOfOperator;
    static int count = 0;
    static int result;
    static String[] questions = new String[limitObjectInArray];
    static String[] answersMachine = new String[limitObjectInArray];
    static String taskGame = "What is the result of the expression?";

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
        for (int i = 0; i < Engine.numberOfRounds; i++) {
            randomNumberOfOperator = number.nextInt(operatorsLimit);
            randomNumber = number.nextInt(numbersLimit) + 1;
            randomNumber2 = number.nextInt(numbersLimit) + 1;
            Calc.logicGame(randomNumberOfOperator, randomNumber, randomNumber2);
            questions[i] = randomNumber + " " + operator + " " + randomNumber2;
            answersMachine[i] = String.valueOf(result);
        }
    }
    public static void calc() {
        Calc.generationGameData();
        Engine.engine(questions, answersMachine, taskGame);
    }
}

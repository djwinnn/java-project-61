package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class GCD {
    static Random number = new Random();
    static int randomNumber;
    static int randomNumber2;
    static int result = 1;
    static final int numbersLimit = 100;
    static final int limitObjectInArray = 3;
    static String[] questions = new String[limitObjectInArray];
    static String[] answersMachine = new String[limitObjectInArray];
    static String taskGame = "Find the greatest common divisor of given numbers.";

    public static void gcd() {
        GCD.generationGameData();
        Engine.engine(questions, answersMachine, taskGame);
    }

    public static void generationGameData() {
        for (int i = 0; i < Engine.numberOfRounds; i++) {
            randomNumber = number.nextInt(numbersLimit) + 1;
            randomNumber2 = number.nextInt(numbersLimit) + 1;
            GCD.logicGame(randomNumber, randomNumber2);
            questions[i] = randomNumber + " " + randomNumber2;
            answersMachine[i] = String.valueOf(result);
        }
    }

    public static void logicGame(int randomNumber, int randomNumber2) {
        for (int i = 1; i <= randomNumber && i <= randomNumber2; i++) {
            if (randomNumber % i == 0 && randomNumber2 % i == 0) {
                result = i;
            }
        }
    }
}

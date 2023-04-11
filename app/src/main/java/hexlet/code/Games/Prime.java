package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Prime {
    static Random number = new Random();
    static double randomNumber;
    static final int numbersLimit = 100;
    static final int limitObjectInArray = 3;
    static String result = "";
    static String[] questions = new String[limitObjectInArray];
    static String[] answersMachine = new String[limitObjectInArray];
    static String taskGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void prime() {
        Prime.generationGameData();
        Engine.engine(questions, answersMachine, taskGame);
    }

    public static void generationGameData() {
        for (int i = 0; i < Engine.numberOfRounds; i++) {
            randomNumber = number.nextInt(numbersLimit) + 1;
            Prime.logicGame(randomNumber);
            questions[i] = randomNumber + " ";
            answersMachine[i] = result;
        }
    }

    public static void logicGame(double randomNumber) {
        for (int i = 2; i <= randomNumber / 2; ++i) {
            if (randomNumber % i == 0) {
                result = "no";
                break;
            }
            result = "yes";
        }
    }
}

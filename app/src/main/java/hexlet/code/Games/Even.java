package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Even {
    static double randomNumber;
    static Random number = new Random();
    static final int numbersLimit = 100;
    static final int limitObjectInArray = 3;
    static String[] questions = new String[limitObjectInArray];
    static String[] answersMachine = new String[limitObjectInArray];
    static String taskGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void generationGameData() {
        for (int i = 0; i < Engine.numberOfRounds; i++) {
            randomNumber = number.nextInt(numbersLimit) + 1;
            questions[i] = String.valueOf(randomNumber);
            answersMachine[i] = logicGame(randomNumber);
        }
    }

    public static String logicGame(double number) {
        return number % 2 == 0 ? "yes" : "no";
    }

    public static void even() {
        generationGameData();
        Engine.engine(questions, answersMachine, taskGame);
    }
}

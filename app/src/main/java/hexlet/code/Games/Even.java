package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Even {
    public static double randomNumber;
    public static Random number = new Random();
    public static String taskGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void even() {
        generationGameData();
        Engine.engine(Engine.questions, Engine.answersMachine, taskGame);
    }

    public static void generationGameData() {
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            randomNumber = number.nextInt(Engine.NUMBERS_LIMIT) + 1;
            Engine.questions[i] = String.valueOf(randomNumber);
            Engine.answersMachine[i] = logicGame(randomNumber);
        }
    }

    public static String logicGame(double number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}

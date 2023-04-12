package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Even {
    private static final Random NUMBER = new Random();

    public static void even() {
        generationGameData();
        String taskGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.engine(Engine.getQuestions(), Engine.getAnswersMachine(), taskGame);
    }

    public static void generationGameData() {
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            double randomNumber = NUMBER.nextInt(Engine.NUMBERS_LIMIT) + 1;
            Engine.getQuestions()[i] = String.valueOf(randomNumber);
            Engine.getAnswersMachine()[i] = logicGame(randomNumber);
        }
    }

    public static String logicGame(double number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}

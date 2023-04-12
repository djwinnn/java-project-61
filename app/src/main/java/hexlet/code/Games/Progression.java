package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Progression {
    private static final Random NUMBER = new Random();
    private static int startProgression;
    private static int stepInProgression;
    private static final int NUMBERS_LIMIT_STEPS = 4;
    private static final int NUMBERS_LIMIT_PROGRESSION = 5;

    public static void progression() {
        Progression.generationGameData();
        String taskGame = "What number is missing in the progression?";
        Engine.engine(Engine.getQuestions(), Engine.getAnswersMachine(), taskGame);
    }

    public static void generationGameData() {
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int[] numbersProgression = new int[NUMBERS_LIMIT_PROGRESSION];
            StringBuilder stringQuestion = new StringBuilder();
            startProgression = NUMBER.nextInt(Engine.NUMBERS_LIMIT) + 1;
            stepInProgression = NUMBER.nextInt(NUMBERS_LIMIT_STEPS) + 1;
            Progression.logicGame(numbersProgression, stringQuestion);
            Engine.getQuestions()[i] = String.valueOf(stringQuestion);
            Engine.getAnswersMachine()[i] = String.valueOf(numbersProgression[stepInProgression]);
        }
    }

    public static void logicGame(int[] numbersProgression, StringBuilder stringQuestion) {
        for (int i = 0; i < numbersProgression.length; i++) {
            numbersProgression[i] = startProgression;
            startProgression += stepInProgression;
        }
        for (int j : numbersProgression) {
            if (j == numbersProgression[stepInProgression]) {
                stringQuestion.append("..").append(" ");
            } else {
                stringQuestion.append(j).append(" ");
            }
        }
    }
}

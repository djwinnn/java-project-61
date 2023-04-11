package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Progression {
    static Random number = new Random();
    static int startProgression;
    static int stepInProgression;
    static final int numbersLimitSteps = 4;
    static final int numbersLimitProgression = 5;
    static String taskGame = "What number is missing in the progression?";

    public static void progression() {
        Progression.generationGameData();
        Engine.engine(Engine.getQUESTIONS(), Engine.getANSWERS_MACHINE(), taskGame);
    }

    public static void generationGameData() {
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int[] numbersProgression = new int[numbersLimitProgression];
            StringBuilder stringQuestion = new StringBuilder();
            startProgression = number.nextInt(Engine.NUMBERS_LIMIT) + 1;
            stepInProgression = number.nextInt(numbersLimitSteps) + 1;
            Progression.logicGame(numbersProgression, stringQuestion);
            Engine.getQUESTIONS()[i] = String.valueOf(stringQuestion);
            Engine.getANSWERS_MACHINE()[i] = String.valueOf(numbersProgression[stepInProgression]);
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
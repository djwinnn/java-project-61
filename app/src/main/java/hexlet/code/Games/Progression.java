package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Progression {
    static Random number = new Random();
    static final int numbersLimit = 100;
    static final int numbersLimitSteps = 4;
    static final int limitObjectInArray = 3;
    static final int numbersLimitProgression = 5;
    static int startProgression;
    static int stepInProgression;
    static String[] questions = new String[limitObjectInArray];
    static String[] answersMachine = new String[limitObjectInArray];
    static String taskGame = "What number is missing in the progression?";

    public static void progression() {
        Progression.generationGameData();
        Engine.engine(questions, answersMachine, taskGame);
    }

    public static void generationGameData() {
        for (int i = 0; i < Engine.numberOfRounds; i++) {
            int[] numbersProgression = new int[numbersLimitProgression];
            StringBuilder stringQuestion = new StringBuilder();
            startProgression = number.nextInt(numbersLimit) + 1;
            stepInProgression = number.nextInt(numbersLimitSteps) + 1;
            Progression.logicGame(numbersProgression, stringQuestion);
            questions[i] = String.valueOf(stringQuestion);
            answersMachine[i] = String.valueOf(numbersProgression[stepInProgression]);
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
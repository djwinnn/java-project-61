package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Progression {
    public static void progression() {
        Random number = new Random();
        final int numbersLimit = 100;
        final int numbersLimitSteps = 4;
        final int limitObjectInArray = 3;
        final int numbersLimitProgression = 5;
        final int maxGames = 3;
        int startProgression;
        int stepInProgression;
        int count = 0;
        String[] questions = new String[limitObjectInArray];
        String[] answersMachine = new String[limitObjectInArray];

        System.out.println("What number is missing in the progression?");

        do {
            int[] numbersProgression = new int[numbersLimitProgression];
            StringBuilder stringQuestion = new StringBuilder();
            startProgression = number.nextInt(numbersLimit) + 1;
            stepInProgression = number.nextInt(numbersLimitSteps) + 1;
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

            questions[count] = stringQuestion + "";
            answersMachine[count] = numbersProgression[stepInProgression] + "";

            count++;

        } while (count < maxGames);

        Engine.engine(questions, answersMachine);
    }
}

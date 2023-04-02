package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Progression {
    public static void progression() {
        Random number = new Random();
        int startProgression;
        int stepInProgression;
        int count = 0;
        String[] questions = new String[3];
        String[] answersMachine = new String[3];

        System.out.println("What number is missing in the progression?");

        do {
            int []numbersProgression = new int[5];
            StringBuilder stringQuestion = new StringBuilder();
            startProgression = number.nextInt(100) + 1;
            stepInProgression = number.nextInt(4) + 1;
            
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

        } while (count < 3);

        Engine.engine(questions, answersMachine);
    }
}

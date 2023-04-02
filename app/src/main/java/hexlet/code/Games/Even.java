package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Even {
    public static void even() {
        double randomNumber;
        Random number = new Random();
        int count = 0;
        String[] questions = new String[3];
        String[] answersMachine = new String[3];

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        do {
            randomNumber = number.nextInt(100) + 1; //question
            questions[count] = randomNumber + "";

            if (randomNumber % 2 == 0) {
                answersMachine[count] = "yes";
            } else {
                answersMachine[count] = "no";
            }
            count++;
        } while (count < 3);

        Engine.engine(questions, answersMachine);
    }
}

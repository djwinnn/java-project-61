package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Even {
    public static void even() {
        double randomNumber;
        Random number = new Random();
        final int numbersLimit = 100;
        final int limitObjectInArray = 3;
        final int maxGames = 3;
        int count = 0;
        String[] questions = new String[limitObjectInArray];
        String[] answersMachine = new String[limitObjectInArray];

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        do {
            randomNumber = number.nextInt(numbersLimit) + 1; //question
            questions[count] = randomNumber + "";

            if (randomNumber % 2 == 0) {
                answersMachine[count] = "yes";
            } else {
                answersMachine[count] = "no";
            }
            count++;
        } while (count < maxGames);

        Engine.engine(questions, answersMachine);
    }
}

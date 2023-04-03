package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Prime {
    public static void prime() {
        Random number = new Random();
        double randomNumber;
        int count = 0;
        final int numbersLimit = 100;
        final int limitObjectInArray = 3;
        final int maxGames = 3;
        String result = "";
        String[] questions = new String[limitObjectInArray];
        String[] answersMachine = new String[limitObjectInArray];

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        do {

            randomNumber = number.nextInt(numbersLimit) + 1;

            for (int i = 2; i <= randomNumber / 2; ++i) {
                if (randomNumber % i == 0) {
                    result = "no";
                    break;
                }
                result = "yes";
            }

            questions[count] = randomNumber + " ";
            answersMachine[count] = result;

            count++;

        } while (count < maxGames);

        Engine.engine(questions, answersMachine);
    }
}

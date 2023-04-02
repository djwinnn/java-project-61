package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Prime {
    public static void prime() {
        Random number = new Random();
        double randomNumber;
        int count = 0;
        String result = "";
        String[] questions = new String[3];
        String[] answersMachine = new String[3];

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        do {

            randomNumber = number.nextInt(100) + 1;

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

        } while (count < 3);

        Engine.engine(questions, answersMachine);
    }
}
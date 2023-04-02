package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class GCD {
    public static void gcd() {
        int randomNumber;
        int randomNumber2;
        Random number = new Random();
        int count = 0;
        int result = 1;
        String[] questions = new String[3];
        String[] answersMachine = new String[3];

        System.out.println("Find the greatest common divisor of given numbers.");

        do {
            randomNumber = number.nextInt(100) + 1;
            randomNumber2 = number.nextInt(100) + 1;

            for (int i = 1; i <= randomNumber && i <= randomNumber2; i++) {
                if (randomNumber % i == 0 && randomNumber2 % i == 0) {
                    result = i;
                }
            }

            questions[count] = randomNumber + " " + randomNumber2;
            answersMachine[count] = result + "";

            count++;

        } while (count < 3);

        Engine.engine(questions, answersMachine);
    }
}
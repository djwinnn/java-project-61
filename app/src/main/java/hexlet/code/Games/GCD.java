package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class GCD {
    public static void gcd() {
        Random number = new Random();
        int randomNumber;
        int randomNumber2;
        int count = 0;
        int result = 1;
        final int numbersLimit = 100;
        final int limitObjectInArray = 3;
        final int maxGames = 3;
        String[] questions = new String[limitObjectInArray];
        String[] answersMachine = new String[limitObjectInArray];

        System.out.println("Find the greatest common divisor of given numbers.");

        do {
            randomNumber = number.nextInt(numbersLimit) + 1;
            randomNumber2 = number.nextInt(numbersLimit) + 1;

            for (int i = 1; i <= randomNumber && i <= randomNumber2; i++) {
                if (randomNumber % i == 0 && randomNumber2 % i == 0) {
                    result = i;
                }
            }

            questions[count] = randomNumber + " " + randomNumber2;
            answersMachine[count] = result + "";

            count++;

        } while (count < maxGames);

        Engine.engine(questions, answersMachine);
    }
}

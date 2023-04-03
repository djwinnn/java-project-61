package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Calc {
    public static void calc() {
        String operator;
        Random number = new Random();
        final int numbersLimit = 100;
        final int limitObjectInArray = 3;
        final int maxGames = 3;
        final int operatorsLimit = 3;
        int randomNumber;
        int randomNumber2;
        int randomNumberOfOperator;
        int count = 0;
        int result;
        String[] questions = new String[limitObjectInArray];
        String[] answersMachine = new String[limitObjectInArray];

        System.out.println("What is the result of the expression?");

        do {
            randomNumber = number.nextInt(numbersLimit) + 1;
            randomNumber2 = number.nextInt(numbersLimit) + 1;
            randomNumberOfOperator = number.nextInt(operatorsLimit);

            if (randomNumberOfOperator == 0) {
                operator = "+";
                result = randomNumber + randomNumber2;
            } else if (randomNumberOfOperator == 1) {
                operator = "-";
                result = randomNumber - randomNumber2;
            } else {
                operator = "*";
                result = randomNumber * randomNumber2;
            }

            questions[count] = randomNumber + " " + operator + " " + randomNumber2;
            answersMachine[count] = result + "";

            count++;

        } while (count < maxGames);

        Engine.engine(questions, answersMachine);
    }
}

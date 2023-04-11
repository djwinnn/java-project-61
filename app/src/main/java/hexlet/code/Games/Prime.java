package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;
public class Prime {
    static Random number = new Random();
    static double randomNumber;
    static String result = "";
    static String taskGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void prime() {
        Prime.generationGameData();
        Engine.engine(Engine.getQUESTIONS(), Engine.getANSWERS_MACHINE(), taskGame);
    }

    public static void generationGameData() {
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            randomNumber = number.nextInt(Engine.NUMBERS_LIMIT) + 1;
            Prime.logicGame(randomNumber);
            Engine.getQUESTIONS()[i] = randomNumber + " ";
            Engine.getANSWERS_MACHINE()[i] = result;
        }
    }

    public static void logicGame(double randomNumber) {
        for (int i = 2; i <= randomNumber / 2; ++i) {
            if (randomNumber % i == 0) {
                result = "no";
                break;
            }
            result = "yes";
        }
    }
}

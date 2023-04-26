package hexlet.code;

import java.util.Random;

public class Utils {

    public static int getRandomInt(int num1, int num2) {
        final Random NUMBER = new Random();
        return NUMBER.nextInt(num1) + num2;
    }

    public static int getRandomInt(int num1) {
        final Random NUMBER = new Random();
        return NUMBER.nextInt(num1);
    }
}

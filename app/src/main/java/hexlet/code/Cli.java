package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String name;
    public static String getName() {
        return name;
    }

    public static void communication() {

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}

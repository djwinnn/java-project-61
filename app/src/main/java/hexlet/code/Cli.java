package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void communication() {

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}

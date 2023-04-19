package hexlet.code;
import hexlet.code.Games.Calc;
import hexlet.code.Games.Even;
import hexlet.code.Games.GCD;
import hexlet.code.Games.Progression;
import hexlet.code.Games.Prime;
import java.util.Scanner;

public final class App {
    public static void main(String[] args) {
        final int choiceEven = 2;
        final int choiceCalc = 3;
        final int choiceGcd = 4;
        final int choiceProgression = 5;
        final int choicePrime = 6;

        Scanner scan = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");

        int choiceUser = scan.nextInt();
        if (choiceUser == 0) {
            System.out.println("You have left the game.");
        } else {
            System.out.println("Welcome to the Brain Games!");
            Cli.communication();
        }

        switch (choiceUser) {
            case choiceEven -> Even.even(); // линтер ругался магические числа
            case choiceCalc -> Calc.calc();
            case choiceGcd -> GCD.gcd();
            case choiceProgression -> Progression.progression();
            case choicePrime -> Prime.prime();
            default -> System.out.println("Game over!");
        }
    }
}

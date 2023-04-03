package hexlet.code;
import hexlet.code.Games.Calc;
import hexlet.code.Games.Even;
import hexlet.code.Games.GCD;
import hexlet.code.Games.Progression;
import hexlet.code.Games.Prime;
import java.util.Scanner;
public final class App {
    public static void main(String[] args) {
        final int gameEven = 2;
        final int gameCalc = 3;
        final int gameGCD = 4;
        final int gameProgression = 5;
        final int gamePrime = 6;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even");
        System.out.println("3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\nYour choice: ");

        int choiceUser = scan.nextInt();
        if (choiceUser == 0) {
            System.out.println("Game over!");
        } else {
            System.out.println("Welcome to the Brain Games!");
            Cli.communication();
        }

        switch (choiceUser) {
            case gameEven -> Even.even();
            case gameCalc -> Calc.calc();
            case gameGCD -> GCD.gcd();
            case gameProgression -> Progression.progression();
            case gamePrime -> Prime.prime();
            default -> System.out.println("Game over!");
        }
    }
}

package hexlet.code;
import hexlet.code.Games.Calc;
import hexlet.code.Games.Even;
import hexlet.code.Games.GCD;
import hexlet.code.Games.Progression;
import hexlet.code.Games.Prime;
import java.util.Scanner;

public final class App {
    public static void main(String[] args) {
        final int CHOICE_EVEN = 2;
        final int CHOICE_CALC = 3;
        final int CHOICE_GCD = 4;
        final int CHOICE_PROGRESSION = 5;
        final int CHOICE_PRIME = 6;

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
            case CHOICE_EVEN -> Even.even(); // линтер ругался магические числа
            case CHOICE_CALC -> Calc.calc();
            case CHOICE_GCD -> GCD.gcd();
            case CHOICE_PROGRESSION -> Progression.progression();
            case CHOICE_PRIME -> Prime.prime();
            default -> System.out.println("Game over!");
        }
    }
}

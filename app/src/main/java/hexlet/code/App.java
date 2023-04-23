package hexlet.code;
import hexlet.code.Games.Calc;
import hexlet.code.Games.Even;
import hexlet.code.Games.GCD;
import hexlet.code.Games.Progression;
import hexlet.code.Games.Prime;
import java.util.Scanner;

public final class App {
    public static void main(String[] args) {

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

        String choiceUser = scan.nextLine();

        switch (choiceUser) {
            case "0" -> System.out.println("You have left the game.");
            case "1" -> Cli.communication();
            case "2" -> Even.even();
            case "3" -> Calc.calc();
            case "4" -> GCD.gcd();
            case "5" -> Progression.progression();
            case "6" -> Prime.prime();
            default -> System.out.println("Incorrect input");
        }
    }
}

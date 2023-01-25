package hexlet.code;

import hexlet.code.Games.Calc;
import hexlet.code.Games.Even;
import hexlet.code.Games.GCD;
import hexlet.code.Games.Prime;
import hexlet.code.Games.Progression;
import java.util.Scanner;

public final class App {
    public String getGreeting() {
        return "Welcome to the Brain Games!";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even");
        System.out.println("3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\nYour choice: ");
        int choiceUser = scan.nextInt();

        System.out.println(new App().getGreeting());
        Cli.communication();

        if (choiceUser == 2) {
            Even.even();
        } else if (choiceUser == 3) {
            Calc.calc();
        } else if (choiceUser == 4) {
            GCD.gcd();
        } else if (choiceUser == 5) {
            Progression.progression();
        } else if (choiceUser == 6) {
            Prime.prime();
        }
    }
}

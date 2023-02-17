package hexlet.code;

import hexlet.code.Games.Calc;
import hexlet.code.Games.Even;
import hexlet.code.Games.GCD;
import hexlet.code.Games.Prime;
import hexlet.code.Games.Progression;
import java.util.Scanner;

public final class App {
    public static void main(String[] args) {
        int even = 2;
        int calc = 3;
        int gcd = 4;
        int progression = 5;
        int prime = 6;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even");
        System.out.println("3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\nYour choice: ");
        int choiceUser = scan.nextInt();

        System.out.println("Welcome to the Brain Games!");
        Cli.communication();

        if (choiceUser == even) {
            Even.even();
        } else if (choiceUser == calc) {
            Calc.calc();
        } else if (choiceUser == gcd) {
            GCD.gcd();
        } else if (choiceUser == progression) {
            Progression.progression();
        } else if (choiceUser == prime) {
            Prime.prime();
        }
    }
}

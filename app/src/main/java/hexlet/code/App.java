package hexlet.code;

import hexlet.code.Games.*;

import java.util.Scanner;

public final class App {
    public static void main(String[] args) {

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
            case 2 -> Even.even();
            case 3 -> Calc.calc();
            case 4 -> GCD.gcd();
            case 5 -> Progression.progression();
            case 6 -> Prime.prime();
        }
    }
}

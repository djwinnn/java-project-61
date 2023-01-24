package hexlet.code;
import hexlet.code.Games.*;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Welcome to the Brain Games!";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\nYour choice: ");
        int choiceUser = scan.nextInt();

        if (choiceUser == 1) {
            System.out.println(new App().getGreeting());
            Cli.communication();
        } else if (choiceUser == 2) {
            System.out.println(new App().getGreeting());
            Cli.communication();
            Even.even();
        } else if (choiceUser == 3) {
            System.out.println(new App().getGreeting());
            Cli.communication();
            Calc.calc();
        } else if (choiceUser == 4) {
            System.out.println(new App().getGreeting());
            Cli.communication();
            GCD.gcd();
        } else if (choiceUser == 5) {
            System.out.println(new App().getGreeting());
            Cli.communication();
            Progression.progression();
        } else if (choiceUser == 6) {
            System.out.println(new App().getGreeting());
            Cli.communication();
            Prime.prime();
        }
    }
}
package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void action() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("What is your name?");
        System.out.println("Hello, " + scanner.nextLine() + "!");
        scanner.close();
    }
}

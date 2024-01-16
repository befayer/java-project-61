package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalculatorGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calculator
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s"""
        );

        switch (scanner.nextLine()) {
            case "1" -> Cli.init();
            case "2" -> EvenGame.start();
            case "3" -> CalculatorGame.start();
            case "4" -> GCDGame.start();
            case "5" -> ProgressionGame.start();
            case "6" -> PrimeGame.start();
            case "0" -> scanner.close();
            default -> throw new Error("Error! Unknown command:(");
        }
    }
}

package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;

    public static void run(String[][] roundsData, String description) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nWelcome to the Brain Games!\nMay I have your name? ");
        String username = scanner.nextLine();
        System.out.println("Hello, " + username + "!");
        System.out.println(description);

        for (int i = 0; i < ROUNDS; i++) {
            String question = roundsData[i][0];
            String rightAnswer = roundsData[i][1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (answer.equals(roundsData[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!%n",
                        answer,
                        rightAnswer,
                        username);
                return;
            }
        }

        System.out.println("Congratulations, " + username + "!");
        scanner.close();
    }
}

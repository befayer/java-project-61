package hexlet.code.games;

import hexlet.code.base.Engine;

import java.util.Random;

public final class GCDGame {
    public static final String RULE = "Find the greatest common divisor of given numbers.";
    public static final int MAX_NUMBER = 100;
    public static final int COUNT_OF_QUESTIONS_AND_ANSWERS = 2;

    public static void start() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][COUNT_OF_QUESTIONS_AND_ANSWERS];

        Random random = new Random();
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = random.nextInt(MAX_NUMBER) + 1;
            int secondNumber = random.nextInt(MAX_NUMBER) + 1;
            String question = firstNumber + " " + secondNumber;
            String rightAnswer = String.valueOf(calculate(firstNumber, secondNumber));
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = rightAnswer;
        }

        Engine.run(questionsAndAnswers, RULE);
    }

    private static int calculate(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }
}

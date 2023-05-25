package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class EvenGame {
    public static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int MAX_NUMBER = 100;
    public static final int COUNT_OF_QUESTIONS_AND_ANSWERS = 2;

    public static void start() {
        String[][] arr = new String[Engine.ROUNDS][COUNT_OF_QUESTIONS_AND_ANSWERS];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = new Random().nextInt(MAX_NUMBER) + 1;
            String rightAnswer = isEven(number) ? "yes" : "no";
            arr[i][0] = String.valueOf(number);
            arr[i][1] = rightAnswer;
        }
        Engine.run(arr, RULE);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

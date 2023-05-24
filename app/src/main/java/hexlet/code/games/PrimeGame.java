package hexlet.code.games;

import hexlet.code.base.Engine;

import java.util.Random;

public class PrimeGame {
    public static final int MAX_NUMBER = 100;
    public static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int COUNT_OF_QUESTIONS_AND_ANSWERS = 2;

    public static void start() {
        var questionsAndAnswers = new String[Engine.ROUNDS][COUNT_OF_QUESTIONS_AND_ANSWERS];

        Random random = new Random();
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int question = random.nextInt(MAX_NUMBER) + 1;
            String rightAnswer = isPrime(question) ? "yes" : "no";

            questionsAndAnswers[i][0] = String.valueOf(question);
            questionsAndAnswers[i][1] = rightAnswer;
        }

        Engine.run(questionsAndAnswers, RULE);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

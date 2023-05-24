package hexlet.code.games;

import hexlet.code.base.Engine;

import java.util.Random;

public final class CalculatorGame {
    public static final String RULE = "What is the result of the expression?";
    public static final String[] OPERATORS = {"+", "-", "*"};
    public static final int MAX_NUMBER = 100;
    public static final int COUNT_OF_QUESTIONS_AND_ANSWERS = 2;

    public static void start() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][COUNT_OF_QUESTIONS_AND_ANSWERS];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = random.nextInt(MAX_NUMBER) + 1;
            int secondNumber = random.nextInt(MAX_NUMBER) + 1;
            String operator = OPERATORS[random.nextInt(OPERATORS.length)];
            String question = firstNumber + " " + operator + " " + secondNumber;
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = String.valueOf(calculate(firstNumber, secondNumber, operator));
        }
        Engine.run(questionsAndAnswers, RULE);
    }

    private static int calculate(int x, int y, String operator) {
        return switch (operator) {
            case "+" -> x + y;
            case "-" -> x - y;
            case "*" -> x * y;
            default -> throw new Error("Error. Unknown operator :(");
        };
    }
}

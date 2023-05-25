package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class ProgressionGame {
    public static final String RULE = "What number is missing in the progression?";
    public static final int MIN_LENGTH = 5;
    public static final int MAX_LENGTH = 10;
    public static final int MAX_STEP = 5;
    public static final int MAX_START_NUMBER = 20;
    public static final int COUNT_OF_QUESTIONS_AND_ANSWERS = 2;

    public static void start() {
        String[][] arr = new String[Engine.ROUNDS][COUNT_OF_QUESTIONS_AND_ANSWERS];

        Random random = new Random();
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int startNumber = random.nextInt(MAX_START_NUMBER) + 1;
            int progressionLength = MIN_LENGTH + random.nextInt(MAX_LENGTH - MIN_LENGTH + 1);
            int step = random.nextInt(MAX_STEP) + 2;
            int questionIdx = random.nextInt(progressionLength);
            var progressionItems = getProgression(startNumber, step, progressionLength);
            arr[i][1] = progressionItems[questionIdx];
            progressionItems[questionIdx] = "..";
            arr[i][0] = String.join(" ", progressionItems);
        }
        Engine.run(arr, RULE);
    }

    private static String[] getProgression(int startNumber, int step, int progressionLength) {
        String[] progressionItems = new String[progressionLength];
        for (var i = 0; i < progressionLength; i++) {
            progressionItems[i] = String.valueOf(startNumber);
            startNumber = startNumber + step;
        }
        return progressionItems;
    }
}

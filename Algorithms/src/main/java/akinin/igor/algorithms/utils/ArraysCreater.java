package akinin.igor.algorithms.utils;

import java.util.Random;

public class ArraysCreater {
    private static final Random RANDOM = new Random();

    private ArraysCreater() {
    }

    public static int[] createArray(int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = RANDOM.nextInt(100);
        }
        return result;
    }
}
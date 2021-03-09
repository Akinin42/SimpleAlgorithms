package akinin.igor.algorithms.search;

import akinin.igor.algorithms.ArraysCreater;

public class SimpleSearchMax{

    // class for comparing search speed
    public String searchMax(int arraySize) {
        if (arraySize <= 0) {
            throw new IllegalArgumentException("You can't input negative numbers or zero!");
        }
        int[] numbers = ArraysCreater.createArray(arraySize);
        long startTime = System.currentTimeMillis();
        int result = numbers[0];
        for (int i : numbers) {
            if (i >= result) {
                result = i;
            }
        }
        long finishTime = System.currentTimeMillis();
        return String.format("Max number: %s! On simple search's spent %s milliseconds!", result,
                (finishTime - startTime));
    }
}
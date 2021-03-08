package akinin.igor.algorithms.search;

import java.util.Arrays;

import akinin.igor.algorithms.ArraysCreater;

public class RecursionedSearchMax {

    public String searchMax(int arraySize) {
        if (arraySize <= 0) {
            throw new IllegalArgumentException("You can't input negative numbers or zero!");
        }
        int[] numbers = ArraysCreater.createArray(arraySize);
        long startTime = System.currentTimeMillis();
        int result = findMax(numbers);
        long finishTime = System.currentTimeMillis();
        return String.format("Max number: %s! On recursioned search's spent %s milliseconds!", result,
                (finishTime - startTime));
    }

    private int findMax(int[] numbers) {
        if (numbers.length == 2) {
            if (numbers[0] >= numbers[1]) {
                return numbers[0];
            } else {
                return numbers[1];
            }
        }
        int maxNumber = findMax(Arrays.copyOfRange(numbers, 1, numbers.length));
        if (numbers[0] >= maxNumber) {
            return numbers[0];
        } else {
            return maxNumber;
        }
    }
}
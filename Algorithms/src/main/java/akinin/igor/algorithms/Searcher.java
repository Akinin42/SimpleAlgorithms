package akinin.igor.algorithms;

import java.util.Arrays;

public class Searcher{

    public String simpleSearch(int searchNumber, int searchRange) {
        if (searchNumber < 0) {
            throw new IllegalArgumentException("You can't input negative numbers!");
        }
        if (searchRange < searchNumber) {
            throw new IllegalArgumentException("You can't input number less first number!");
        }
        int result = 0;
        int counter = 0;
        long startTime = System.currentTimeMillis();
        while (result != searchNumber) {
            result++;
            counter++;
        }
        long finishTime = System.currentTimeMillis();
        return formatResult(result, counter, finishTime - startTime);
    }

    public String binarySearch(int searchNumber, int searchRange) {
        if (searchNumber < 0) {
            throw new IllegalArgumentException("You can't input negative numbers!");
        }
        if (searchRange < searchNumber) {
            throw new IllegalArgumentException("You can't input number less first number!");
        }
        int result = 0;
        int counter = 0;
        int lowNumber = 0;
        int hightNumber = searchRange;
        long startTime = System.currentTimeMillis();
        while (lowNumber <= hightNumber) {
            int middleNumber = (hightNumber + lowNumber) / 2;
            counter++;
            if (middleNumber == searchNumber) {
                result = middleNumber;
                break;
            }
            if (searchNumber > middleNumber) {
                lowNumber = middleNumber + 1;
            } else {
                hightNumber = middleNumber - 1;
            }
        }
        long finishTime = System.currentTimeMillis();
        return formatResult(result, counter, finishTime - startTime);
    }

    public String searchMaxInLoop(int arraySize) {
        if (arraySize <= 0) {
            throw new IllegalArgumentException("You can't input negative numbers or zero!");
        }
        ArraysCreater creater = new ArraysCreater();
        int[] numbers = creater.createArray(arraySize);
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

    public String recursionedSearchMax(int arraySize) {
        if (arraySize <= 0) {
            throw new IllegalArgumentException("You can't input negative numbers or zero!");
        }
        ArraysCreater creater = new ArraysCreater();
        int[] numbers = creater.createArray(arraySize);
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

    private String formatResult(int result, int counter, long time) {
        return String.format("Conceived number: %s, this was found in %s steps! On search's spent %s milliseconds!",
                result, counter, time);
    }
}
package akinin.igor.algorithms.sort;

import akinin.igor.algorithms.utils.ArraysCreater;

public class SelectionSort implements Sorting {

    @Override
    public int[] sort(int arraySize) {
        if (arraySize < 0) {
            throw new IllegalArgumentException("You can't input negative numbers!");
        }
        int[] sortableArray = ArraysCreater.createArray(arraySize);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arraySize; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arraySize; j++) {
                if (sortableArray[j] < sortableArray[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = sortableArray[i];
                sortableArray[i] = sortableArray[minIndex];
                sortableArray[minIndex] = temp;
            }
        }
        long finishTime = System.currentTimeMillis();
        System.out.println(String.format("On sorting spent %s milliseconds!", finishTime - startTime));
        return sortableArray;
    }
}
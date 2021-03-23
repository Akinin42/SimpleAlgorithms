package akinin.igor.algorithms.sort;

import akinin.igor.algorithms.utils.ArraysCreater;

public class QuickSort implements Sorting {

    @Override
    public int[] sort(int arraySize) {
        if (arraySize < 0) {
            throw new IllegalArgumentException("You can't input negative numbers!");
        }
        int[] sortableArray = ArraysCreater.createArray(arraySize);
        long startTime = System.currentTimeMillis();
        quickSortArray(sortableArray, 0, sortableArray.length - 1);
        long finishTime = System.currentTimeMillis();
        System.out.println(String.format("On sorting spent %s milliseconds!", finishTime - startTime));
        return sortableArray;
    }

    private void quickSortArray(int[] array, int left, int right) {
        int index = 0;
        if (array.length > 1) {
            index = partition(array, left, right);
            if (left < index - 1) {
                quickSortArray(array, left, index - 1);
            }
            if (index < right) {
                quickSortArray(array, index, right);
            }
        }
    }

    private int partition(int[] array, int left, int right) {
        int pivot = array[(right + left) / 2];
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
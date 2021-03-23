package akinin.igor.algorithms.sort;

public class Sorter {

    private Sorting sorting;

    public void setSorting(Sorting sorting) {
        this.sorting = sorting;
    }

    public int[] sort(int arraySize) {
        return sorting.sort(arraySize);
    }
}
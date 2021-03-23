package akinin.igor.algorithms;

import java.util.Arrays;

import akinin.igor.algorithms.search.BinarySearch;
import akinin.igor.algorithms.search.RecursionedSearchMax;
import akinin.igor.algorithms.search.Searcher;
import akinin.igor.algorithms.search.SimpleSearchMax;
import akinin.igor.algorithms.sort.QuickSort;
import akinin.igor.algorithms.sort.SelectionSort;
import akinin.igor.algorithms.sort.Sorter;
import akinin.igor.algorithms.search.SimpleSearch;

public class AlgorithmLauncher {

    public static void main(String[] args) {
        Searcher searcher = new Searcher();
        searcher.setSearch(new BinarySearch());
        System.out.println(searcher.search(899568560, 1000000000));
        searcher.setSearch(new SimpleSearch());
        System.out.println(searcher.search(899568560, 1000000000));        
        RecursionedSearchMax recursionedSearch = new RecursionedSearchMax();
        SimpleSearchMax simpleSearchMax = new SimpleSearchMax();
        System.out.println(recursionedSearch.searchMax(10000));
        System.out.println(simpleSearchMax.searchMax(10000));
        Sorter sorter = new Sorter();
        sorter.setSorting(new SelectionSort());
        System.out.println(Arrays.toString(sorter.sort(1000)));
        sorter.setSorting(new QuickSort());
        System.out.println(Arrays.toString(sorter.sort(1000)));
    }
}
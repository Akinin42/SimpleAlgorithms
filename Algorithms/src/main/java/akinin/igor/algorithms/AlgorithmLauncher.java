package akinin.igor.algorithms;

import akinin.igor.algorithms.search.BinarySearch;
import akinin.igor.algorithms.search.RecursionedSearchMax;
import akinin.igor.algorithms.search.SimpleSearchMax;
import akinin.igor.algorithms.search.SimpleSearch;

public class AlgorithmLauncher {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();  
        SimpleSearch simpleSearch = new SimpleSearch();
        RecursionedSearchMax recursionedSearch = new RecursionedSearchMax();
        SimpleSearchMax simpleSearchMax = new SimpleSearchMax();
        System.out.println(binarySearch.search(899568560, 1000000000));
        System.out.println(simpleSearch.simpleSearch(899568560, 1000000000));
        System.out.println(recursionedSearch.searchMax(10000));
        System.out.println(simpleSearchMax.searchMax(10000));        
    }
}
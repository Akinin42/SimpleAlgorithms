package akinin.igor.algorithms;

public class AlgorithmLauncher {

    public static void main(String[] args) {
        Searcher searcher = new Searcher();        
        System.out.println(searcher.binarySearch(899568560, 1000000000));
        System.out.println(searcher.simpleSearch(899568560, 1000000000));
        System.out.println(searcher.recursionedSearchMax(10000));
        System.out.println(searcher.searchMaxInLoop(10000));        
    }
}
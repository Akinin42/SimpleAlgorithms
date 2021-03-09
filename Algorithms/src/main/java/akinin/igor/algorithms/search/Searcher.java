package akinin.igor.algorithms.search;

public class Searcher {
    private Search search;

    public void setSearch(Search search) {
        this.search = search;
    }
    
    public String search(int searchNumber, int searchRange) {
        return search.search(searchNumber, searchRange);
    }
}
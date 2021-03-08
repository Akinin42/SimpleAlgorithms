package akinin.igor.algorithms.search;

public class SimpleSearch {

    // class for comparing search speed
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
        return String.format(
                "Conceived number: %s, this was found in %s steps! On simple search's spent %s milliseconds!", result,
                counter, finishTime - startTime);
    }
}
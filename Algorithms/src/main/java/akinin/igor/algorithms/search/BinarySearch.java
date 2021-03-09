package akinin.igor.algorithms.search;

public class BinarySearch extends Search {

    public String search(int searchNumber, int searchRange) {
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
        return String.format("Conceived number: %s, this was found in %s steps! On binary search's spent %s milliseconds!",
                result, counter, finishTime - startTime);
    }
}
package SortingAlgorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        /**
         * Bubble Sort
         * Time Complexity:
         *      BestCase ---> O(n)
         *      WorstCase --> O(n^2)
         *      average ---> O(n^2)
         */
        int[] numbers = {4,1,6,2,4,7,1};
        BubbleSort sorter = new BubbleSort();
        sorter.sort(numbers);
        System.out.println("sortedArray: " + Arrays.toString(numbers));
    }
}

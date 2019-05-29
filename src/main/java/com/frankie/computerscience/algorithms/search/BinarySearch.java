package com.frankie.computerscience.algorithms.search;

// only accepts sorted array (ascending)
// Worst case: O(log n), best case = O(1)
public class BinarySearch {
    public static int search(int[] arr, int searchVal) {
        // initiate
        int arrStartIndex = 0;
        int arrEndIndex = arr.length - 1;

        while (arrEndIndex >= arrStartIndex) {
            // fold array in half every time until the number is found
            int middlePoint = (arrStartIndex + arrEndIndex) / 2;
            if (arr[middlePoint] > searchVal) {
                arrEndIndex = middlePoint - 1;
            } else if (arr[middlePoint] < searchVal) {
                arrStartIndex = middlePoint + 1;
            } else {
                return middlePoint;
            }
        }
        return -1;
    }
}

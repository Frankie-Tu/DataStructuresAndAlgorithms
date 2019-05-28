package com.frankie.computerscience.algorithms.search;

// Worst case: O(n), best case: O(1)
public class LinearSearch {
    public static int search(int[] arr, int searchVal) {
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == searchVal) {
                return x;
            }
        }
        return -1;
    }
}

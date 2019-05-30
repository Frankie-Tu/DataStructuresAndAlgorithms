package com.frankie.computerscience.algorithms.sort;

// Best case: O(n), no swapping, only compare N values
// Worst case: O(n^2), sorting descending array to be ascending
public class InsertionSort {
    public static int[] returnSorted(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) { // check against all sorted items left to the current value
                if (arr[j] > arr[j+1]) {// if left adjacent value is greater, swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}

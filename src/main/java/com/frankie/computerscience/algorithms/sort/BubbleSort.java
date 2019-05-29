package com.frankie.computerscience.algorithms.sort;

// Worst case: O(n^2), descending array to ascending array,
//                     "bubbling" bottom values across array to top, top values to bottom which is
//                     approximately n elements moving n times when n is approaching infinity.
// Best case: O(n), one iteration, no swaps, all elements in place
public class BubbleSort {
    public static int[] returnSorted(int[] arr) {
        while (true) {
            Boolean allSorted = true;
            for (int x = 0; x < arr.length - 1; x++) {
                // compare the adjacent pairs and swap smaller value of the pair to the left
                int tempInt;
                if (arr[x] > arr[x + 1]) {
                    tempInt = arr[x];
                    arr[x] = arr[x + 1];
                    arr[x + 1] = tempInt;
                    allSorted = false;
                }
            }
            if (allSorted) {
                return arr;
            }
        }
    }

}

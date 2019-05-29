package com.frankie.computerscience.algorithms.sort;

import java.util.Arrays;

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

package com.frankie.computerscience.algorithms.sort;

public class SelectionSort {
    // (n - 1) + (n - 2) + (n - 3) + (n - 4) + .... + 2 + 1
    // => n(n-1)/2 => (n^2 - n)/2
    // => when n approaches infinite -> approximately n^2 => O(n^2)
    public static int[] returnSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int currentMin = arr[i];
            int currentMinIndex = i;
            int temp;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < currentMin) { // compare n - 1 times first time in this loop, n - 2 times second time in this loop
                    currentMin = arr[j];
                    currentMinIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = currentMin;
            arr[currentMinIndex] = temp;
        }
        return arr;
    }
}

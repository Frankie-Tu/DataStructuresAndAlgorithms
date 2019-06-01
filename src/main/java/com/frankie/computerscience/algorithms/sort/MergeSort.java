package com.frankie.computerscience.algorithms.sort;

import java.util.Arrays;

// worst case: O(n log n)
//      => keep dividing array of n values by in half until there is a single element in the array => log n
//      => N comparision => n
// best case: o(n log n), same as above
public class MergeSort {

    public static int[] returnSorted(int[] arr) {
        int midPointOfArr = arr.length / 2;
        // recursively call returnSorted until arr contains single element then return arr
        if (arr.length > 1) {
            // returnSorted left half
            int[] leftHalf = returnSorted(Arrays.copyOfRange(arr, 0, midPointOfArr));
            // returnSorted right half
            int[] rightHalf = returnSorted(Arrays.copyOfRange(arr, midPointOfArr, arr.length));
            // merge left and right in sorted arr and return sortedArray
            return merge(leftHalf, rightHalf);
        } else {
            return arr;
        }
    }

    private static int[] merge(int[] leftArr, int[] rightArr) {
        int leftArrIndex = 0;
        int rightArrIndex = 0;
        int mergedArrIndex = 0;
        int[] mergedArr = new int[leftArr.length + rightArr.length];

        // loop until iteration is done in one of the two arrays
        while (leftArrIndex < leftArr.length && rightArrIndex < rightArr.length) {
            if (leftArr[leftArrIndex] < rightArr[rightArrIndex]) {
                mergedArr[mergedArrIndex] = leftArr[leftArrIndex];
                leftArrIndex++;
            } else {
                mergedArr[mergedArrIndex] = rightArr[rightArrIndex];
                rightArrIndex++;
            }
            mergedArrIndex++;
        }

        // if left array finished its iteration first
        if (leftArrIndex == leftArr.length) {
            for (int x = rightArrIndex; x < rightArr.length; x++) {
                mergedArr[mergedArrIndex] = rightArr[rightArrIndex];
                rightArrIndex++;
                mergedArrIndex++;
            }
        } else {
            for (int x = leftArrIndex; x < leftArr.length; x++) {
                mergedArr[mergedArrIndex] = leftArr[leftArrIndex];
                leftArrIndex++;
                mergedArrIndex++;
            }
        }
        return mergedArr;
    }
}

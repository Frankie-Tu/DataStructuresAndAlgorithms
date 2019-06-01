package com.frankie.computerscience.algorithms.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void returnSortedDescToAsc() {
        int[] descArr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expectedArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertTrue(Arrays.equals(MergeSort.returnSorted(descArr), expectedArr));
    }

    @Test
    public void nonDistinctSort() {
        int[] unsortedArr = {5, 8, 3, 6, 9, 4, 2, 3, 9, 3, 8};
        int[] sortedArr = unsortedArr.clone();
        Arrays.sort(sortedArr);
        assertTrue(Arrays.equals(MergeSort.returnSorted(unsortedArr), sortedArr));
    }
}
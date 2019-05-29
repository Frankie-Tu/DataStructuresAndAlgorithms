package com.frankie.computerscience.algorithms.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BubbleSortTest {
    @Test
    public void sortDistinct() {
        int[] arr = {9, 6, 5, 3, 2, 8, 7, 1, 4};
        int[] expectedArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        assertTrue(Arrays.equals(BubbleSort.returnSorted(arr), expectedArr));
    }

    @Test
    public void sortDuplicates() {
        int[] arr = {7, 8, 4, 3, 2, 1, 7, 10};
        int[] expectedArr = {1, 2, 3, 4, 7, 7, 8, 10};

        assertTrue(Arrays.equals(BubbleSort.returnSorted(arr), expectedArr));
    }
}
package com.frankie.computerscience.algorithms.sort;

import com.frankie.computerscience.algorithms.sort.SelectionSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void sortedDistinctValues() {
        int[] distinctArr = {4, 7, 5, 3, 2, 6};
        int[] expectedArr = {2, 3, 4, 5, 6, 7};
        assertTrue(Arrays.equals(expectedArr, SelectionSort.returnSorted(distinctArr)));
    }

    @Test
    public void sortedSameValueTwice() {
        int[] nonDistinctArr = {6, 4, 3, 3, 3, 2, 5, 4};
        int[] expectedArr = {2, 3, 3, 3, 4, 4, 5, 6};
        assertTrue(Arrays.equals(expectedArr, SelectionSort.returnSorted(nonDistinctArr)));
    }
}
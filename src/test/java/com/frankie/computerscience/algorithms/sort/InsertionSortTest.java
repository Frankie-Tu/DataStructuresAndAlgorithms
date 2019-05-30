package com.frankie.computerscience.algorithms.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void returnSorted() {
        int[] arr = {5, 6, 4, 3, 6, 7, 1, 0, -1};
        int[] expected = {-1, 0, 1, 3, 4, 5, 6, 6, 7};
        assertTrue(Arrays.equals(InsertionSort.returnSorted(arr), expected));
    }
}
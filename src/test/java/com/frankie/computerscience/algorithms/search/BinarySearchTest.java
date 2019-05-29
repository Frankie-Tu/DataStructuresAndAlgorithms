package com.frankie.computerscience.algorithms.search;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    int[] arr = {1, 3, 4, 6, 6, 7, 8, 9, 13};

    @Test
    public void searchHead() {
        assertEquals(0, BinarySearch.search(arr, 1));
    }

    @Test
    public void searchTail() {
        assertEquals(arr.length - 1, BinarySearch.search(arr, 13));
    }

    @Test
    public void search3() {
        assertEquals(1, BinarySearch.search(arr, 3));
    }
}
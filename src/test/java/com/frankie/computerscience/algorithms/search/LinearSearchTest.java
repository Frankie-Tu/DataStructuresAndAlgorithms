package com.frankie.computerscience.algorithms.search;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinearSearchTest {

    int[] arr = {6, 5, 4, 3, 2, 1};

    @Test
    public void searchVal1() {
        assertEquals(5, LinearSearch.search(arr, 1));
    }

    @Test
    public void searchVal6() {
        assertEquals(0, LinearSearch.search(arr, 6));
    }

    @Test
    public void searchVal3() {
        assertEquals(3, LinearSearch.search(arr, 3));
    }

    @Test
    public void searchNonExistentVal() {
        assertEquals(-1, LinearSearch.search(arr, 10));
    }
}
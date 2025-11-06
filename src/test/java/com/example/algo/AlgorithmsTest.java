package com.example.algo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @Test
    void testLinearSearch() {
        int[] arr = {5, 3, 8, 4, 2};
        assertEquals(2, Algorithms.linearSearch(arr, 8));
        assertEquals(-1, Algorithms.linearSearch(arr, 99));
    }

    @Test
    void testBinarySearch() {
        int[] arr = {2, 3, 4, 5, 8};
        assertEquals(3, Algorithms.binarySearch(arr, 5));
        assertEquals(-1, Algorithms.binarySearch(arr, 99));
    }

    @Test
    void testBubbleSort() {
        int[] arr = {5, 3, 8, 4, 2};
        Algorithms.bubbleSort(arr);
        assertArrayEquals(new int[]{2, 3, 4, 5, 8}, arr);
    }

    @Test
    void testQuickSort() {
        int[] arr = {5, 3, 8, 4, 2};
        Algorithms.quickSort(arr);
        assertArrayEquals(new int[]{2, 3, 4, 5, 8}, arr);
    }

    @Test
    void testMergeSort() {
        int[] arr = {5, 3, 8, 4, 2};
        Algorithms.mergeSort(arr);
        assertArrayEquals(new int[]{2, 3, 4, 5, 8}, arr);
    }
}
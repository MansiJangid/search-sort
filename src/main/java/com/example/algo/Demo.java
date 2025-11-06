package com.example.algo;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] data = {5, 3, 8, 4, 2};
        System.out.println("Original: " + Arrays.toString(data));

        // Try any algorithm
        Algorithms.quickSort(data);
        System.out.println("Sorted:   " + Arrays.toString(data));

        int index = Algorithms.binarySearch(data, 8);
        System.out.println("8 found at index: " + index);
    }
}
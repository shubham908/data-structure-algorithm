package io.code.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[] {3, 7, 9, 5, 1, 8, 4, 2};
        Arrays.stream(sort(arr))
                .forEach(System.out::println);
    }

    private static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // The inner loop needs to be traversed only till the
            // unsorted part of the array
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}

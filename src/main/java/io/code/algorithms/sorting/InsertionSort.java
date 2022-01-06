package io.code.algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[] {3, 7, 9, 5, 1, 8, 4};
        Arrays.stream(actualVersion(arr))
                .forEach(System.out::println);
    }

    // This is code I came up with after understanding the algo
    // The problem is that it doesn't actually represent the idea of
    // cards sorting that the selection sort uses.
    private static int[] myVersion(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int currIndex = i;
            while (currIndex > 0 && arr[currIndex-1] > arr[currIndex]) {
                int temp = arr[currIndex];
                arr[currIndex] = arr[currIndex-1];
                arr[currIndex-1] = temp;

                currIndex--;
            }
        }
        return arr;
    }

    // This code is the actual representation of the algo & represents
    // the code to be sorted by taking out the value as curr & then finding
    // the actual position of the card.
    private static int[] actualVersion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > curr) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
        return arr;
    }
}

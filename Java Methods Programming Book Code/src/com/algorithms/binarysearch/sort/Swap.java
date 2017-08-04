package com.algorithms.binarysearch.sort;

public class Swap {
    public static void swap(int[] arr, int left, int right) {

        if (arr[left] != arr[right]) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }
}
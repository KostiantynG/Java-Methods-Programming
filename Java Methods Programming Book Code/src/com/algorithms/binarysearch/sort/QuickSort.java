package com.algorithms.binarysearch.sort;

import java.util.Random;

public class QuickSort {
    public static final Random RND = new Random();

    public static void sort(int[] array) {
        qsort(array, 0, array.length - 1);
    }

    private static void qsort(int[] array, int begin, int end) {
        if (end > begin) {
            int index = partition(array, begin, end);
            qsort(array, begin, index - 1);
            qsort(array, index + 1, end);
        }
    }

    private static int partition(int[] array, int begin, int end) {
        int index = begin + RND.nextInt(end - begin + 1);
        int pivot = array[index];
        Swap.swap(array, index, end);
        for (int i = index = begin; i < end; ++i) {
            if (array[i] - pivot <= 0) {
                Swap.swap(array, index++, i);
            }
        }
        Swap.swap(array, index, end);
        return (index);
    }
}
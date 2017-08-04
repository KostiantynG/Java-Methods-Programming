package com.algorithms.binarysearch.sort;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        int[] arrMain = {3, 8, 2, 1, 5, 4, 6, 7};
        int[] sortedArray = getCopyOfArray(arrMain);

        println(sortedArray, "BubbleSort");
        BubbleSort.sort(sortedArray);

        sortedArray = getCopyOfArray(arrMain);
        println(sortedArray, "InsertionSort");

        InsertionSort.sort(sortedArray);

        sortedArray = getCopyOfArray(arrMain);
        println(sortedArray, "SelectionSort");
        SelectionSort.sort(sortedArray);

        sortedArray = getCopyOfArray(arrMain);
        println(sortedArray, "MergeSort");
        MergeSort.sort(sortedArray);
        System.out.println(Arrays.toString(sortedArray));

        sortedArray = getCopyOfArray(arrMain);
        println(sortedArray, "QuickSort");
        QuickSort.sort(sortedArray);
        System.out.println(Arrays.toString(sortedArray));

    }

    public static int[] getCopyOfArray(int[] arrMain) {
        return Arrays.copyOf(arrMain, arrMain.length);
    }

    public static void println(int[] sortedArray, String string) {
        System.out.println(Arrays.toString(sortedArray));
        System.out.println(string);
    }
}
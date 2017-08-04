package com.tasks;

import java.util.Arrays;

public class NewArrayFindRandomRemovedElementAfterShuffle {

    public static void main(String args[]) {
        int[] arr = {3, 6, 8, 44, 67, 1, 3, 5, 34, 0, 34};
        int[] removed = {44, 6, 34, 34, 0, 5, 3, 67, 8, 3};
        int rez = Arrays.stream(arr).sum()-Arrays.stream(removed).sum();
        System.out.println(rez);
    }
}
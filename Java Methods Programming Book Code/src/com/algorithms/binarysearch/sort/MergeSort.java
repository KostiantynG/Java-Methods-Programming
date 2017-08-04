package com.algorithms.binarysearch.sort;

import java.util.Arrays;

/**
 * Сортировка слиянием
 * При сортировке слиянием мы разделяем массив пополам до тех пор,
 * пока каждый участок не станет длиной в один элемент.
 * Затем эти участки возвращаются на место (сливаются) в правильном порядке.
 * <p>
 * Для работы алгоритма мы должны реализовать следующие операции:
 * 1) Операцию для рекурсивного разделения массива на группы (метод Sort).
 * 2) Слияние в правильном порядке (метод Merge).
 * Стоит отметить, что в отличие от линейных алгоритмов сортировки,
 * сортировка слиянием будет делить и склеивать массив вне зависимости от того,
 * был он отсортирован изначально или нет. Поэтому, несмотря на то,
 * что в худшем случае он отработает быстрее, чем линейный,
 * в лучшем случае его производительность будет ниже, чем у линейного.
 * Поэтому сортировка слиянием — не самое лучшее решение,
 * когда надо отсортировать частично упорядченный массив.
 */
public class MergeSort {
    public static void sort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize;
        int[] left = Arrays.copyOfRange(arr, 0, leftSize);
        int[] right = Arrays.copyOfRange(arr, leftSize, arr.length);
        System.out.print(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        sort(left);
        sort(right);
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int targetIndex = 0;
        int remaining = left.length + right.length;

        while (remaining > 0) {
            if (leftIndex >= left.length) {
                arr[targetIndex] = right[rightIndex++];
            } else if (rightIndex >= right.length) {
                arr[targetIndex] = left[leftIndex++];
            } else if (left[leftIndex] - (right[rightIndex]) <
                    0) {
                arr[targetIndex] = left[leftIndex++];
            } else {
                arr[targetIndex] = right[rightIndex++];
            }

            targetIndex++;
            remaining--;
        }
        System.out.println("Merge " + Arrays.toString(arr));
    }
}
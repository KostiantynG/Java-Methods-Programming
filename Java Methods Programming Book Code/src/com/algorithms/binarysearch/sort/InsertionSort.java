package com.algorithms.binarysearch.sort;

import java.util.Arrays;

/**
 * Сортировка вставками (англ. Insertion sort)
 * <p>
 * Алгоритм сортировки, в котором элементы входной последовательности просматриваются по одному,
 * и каждый новый поступивший элемент размещается в подходящее место
 * среди ранее упорядоченных элементов.
 * Вычислительная сложность — O(n^2)
 */
public class InsertionSort {
    public static void sort(int[] arr) {
        int sortedRangeEndIndex = 1;
        int insertIndex = 0;
        int temp;
        int countWhile = 0;
        int countFor = 0;

        while (sortedRangeEndIndex < arr.length) {
            countWhile++;
            if (arr[sortedRangeEndIndex] - (arr[sortedRangeEndIndex - 1]) < 0) {
                // поиск индекса
                for (int index = 0; index < arr.length; index++) {
                    countFor++;
                    if (arr[index] - (arr[sortedRangeEndIndex]) > 0) {
                        insertIndex = index;
                        break;
                    }
                }
                // вставка
                temp = arr[insertIndex];
                arr[insertIndex] = arr[sortedRangeEndIndex];
                for (int current = sortedRangeEndIndex; current > insertIndex; current--) {
                    countFor++;
                    arr[current] = arr[current - 1];
                }
                arr[insertIndex + 1] = temp;


                System.out.println(Arrays.toString(arr));
            }
            sortedRangeEndIndex++;
        }
        System.out.print("countWhile: " + countWhile +" ");
        System.out.println("countFor: " + countFor);
    }
}

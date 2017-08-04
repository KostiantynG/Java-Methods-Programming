package com.algorithms.binarysearch.sort;

import java.util.Arrays;

/**
 * Сортировка простыми обменами, сортиро́вка пузырько́м (англ. bubble sort)
 * <p>
 * Алгоритм состоит из повторяющихся проходов по сортируемому массиву.
 * За каждый проход элементы последовательно сравниваются попарно и,
 * если порядок в паре неверный, выполняется обмен элементов.
 * Проходы по массиву повторяются N-1 раз или до тех пор,
 * пока на очередном проходе не окажется, что обмены больше не нужны,
 * что означает — массив отсортирован. При каждом проходе алгоритма по внутреннему циклу,
 * очередной наибольший элемент массива ставится на своё место в конце массива рядом с
 * предыдущим «наибольшим элементом», а наименьший элемент перемещается на одну позицию к
 * началу массива («всплывает» до нужной позиции, как пузырёк в воде,
 * отсюда и название алгоритма).
 * Вычислительная сложность — O(n^2)
 */
public class BubbleSort {
    public static void sort(int[] arr) {
        boolean swapped;
        int countDo = 0;
        int countFor = 0;
        do {
            countDo++;
            swapped = false;

            for (int i = 1; i < arr.length; i++) {
                countFor++;
                if ((arr[i - 1] - arr[i]) > 0) {
                    Swap.swap(arr, i - 1, i);
                    swapped = true;
                    System.out.println(Arrays.toString(arr));
                }
            }
        } while (swapped);
        System.out.println("countDo: " + countDo + " countFor: " + countFor + " sumCounts: " + (countDo + countFor));
    }
}
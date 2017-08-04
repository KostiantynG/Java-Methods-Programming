package com.algorithms.binarysearch.sort;

import java.util.Arrays;

/**
 * Сортировка выбором (Selection sort) — алгоритм сортировки.
 * Может быть как устойчивый, так и неустойчивый.
 * На массиве из n элементов имеет время выполнения в худшем, среднем и лучшем случае Θ(n^2),
 * предполагая, что сравнения делаются за постоянное время.
 *
 * Пример неустойчивой реализации:
 * Шаги алгоритма:
 * 1) находим номер минимального значения в текущем списке;
 * 2) производим обмен этого значения со значением первой неотсортированной позиции
 *    (обмен не нужен, если минимальный элемент уже находится на данной позиции);
 * 3)теперь сортируем хвост списка, исключив из рассмотрения уже отсортированные элементы.
 *
 * Для реализации устойчивости алгоритма необходимо в пункте 2
 * минимальный элемент непосредственно вставлять в первую неотсортированную позицию,
 * не меняя порядок остальных элементов.
 */
public class SelectionSort {
    public static void sort(int[] arr) {
        int sortedRangeEnd = 0;
        int nextIndex;

        while (sortedRangeEnd < arr.length-1) {
            nextIndex = FindIndexOfSmallestFromIndex(arr, sortedRangeEnd);
            Swap.swap(arr, sortedRangeEnd, nextIndex);
            sortedRangeEnd++;
            System.out.println(Arrays.toString(arr));
        }
    }

    private static int FindIndexOfSmallestFromIndex(int[] arr, int sortedRangeEnd) {
        int currentSmallest = arr[sortedRangeEnd];
        int currentSmallestIndex = sortedRangeEnd;

        for (int i = sortedRangeEnd + 1; i < arr.length; i++) {
            if (currentSmallest - (arr[i]) > 0) {
                currentSmallest = arr[i];
                currentSmallestIndex = i;
            }
        }
        return currentSmallestIndex;
    }
}

package com.tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyClass {

    private static boolean isFindedF(int[] arr, int x) { // n^2
        boolean result = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) result = true;
            }
        }
        return result;
    }

    private static boolean isFindedULI(int[] arr, int x) { // n log n
        boolean result = false;

        List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());
        Collections.sort(list);

        int lowerIndex = 0;
        int upperIndex = list.size() - 1;
        int summ;

        while (lowerIndex != upperIndex || lowerIndex < 0 || upperIndex == list.size()) {
            summ = list.get(lowerIndex) + list.get(upperIndex);

            if (summ == x) {
                result = true;
                break;
            }
            if (summ < x) lowerIndex += 1;
            if (summ > x) upperIndex -= 1;
        }
        return result;
    }

    private static boolean isFindedULI2(int[] arr, int x) { // n log n
        boolean result = false;
        Arrays.sort(arr);
        int first = 0;
        int last = arr.length - 1;
        int s;
        while (first < last) {
            s = arr[first] + arr[last];
            if (s == x) {
                System.out.println(arr[first] + "+" + arr[last] + "=" + x);
                result = true;
                first++;
                last--;
            } else {
                if (s < x) first++;
                else last--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 5, 6, 12, 15};
        int[] arrcopy = Arrays.copyOf(arr, arr.length);
        int x = 11;

        System.out.println(isFindedF(arrcopy, x));
        arrcopy = Arrays.copyOf(arr, arr.length);
        System.out.println(isFindedULI(arrcopy, x));
        arrcopy = Arrays.copyOf(arr, arr.length);
        System.out.println(isFindedULI2(arrcopy, x));
    }
}
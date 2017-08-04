package com.tasks;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayFindRandomRemovedElementAfterShuffle {

    public static void main(String args[]) {
        int a = 1; // Initial range value - "from"
        int b = 30; // Range end value - "to"
        int c = 5; //Array length

        int[] arr = randomArray(a, b, c);
        int[] removed = ArrayUtils.remove(arr, (int) (Math.random() * c));
        ArrayUtils.shuffle(removed);
        int sumArr = Arrays.stream(arr).sum();
        int sumRemoved = Arrays.stream(removed).sum();

        System.out.println("ArrayFirst:");
        System.out.println(Arrays.toString(arr));
        System.out.println("ArraySecond(ArrayFirstWithRemovedElementAndAfterShuffle):");
        System.out.println(Arrays.toString(removed));
        System.out.println("Sum(ArrayFirst): " + "\n" + sumArr);
        System.out.println("Sum(ArraySecond): " + "\n" + sumRemoved);
        System.out.println("Removed element is: Sum(ArrayFirst)-Sum(ArraySecond: )" + "\n" + (sumArr - sumRemoved));
    }




    public static int[] randomArray(int a, int b, int c) {
        int[] intArray;
        if (c > 0) {
            intArray = new int[c];
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = a + (int) (Math.random() * b); //interval from a to b
            }
            return intArray;
        } else {
            throw new IllegalArgumentException("value of 'c' must be more then 0");
        }
    }
}

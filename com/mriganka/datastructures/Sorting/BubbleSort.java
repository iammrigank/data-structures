package com.mriganka.datastructures.sorting;

import com.mriganka.datastructures.common.ArrayLib;

/**
 * Bubble Sort : Each iteration puts the largest element in the
 * furthest end.
 *
 * Time Complexity
 * O(n^2) : Worst case / Best case / Average case
 *
 * Space Complexity
 * O(n)
 */

public class BubbleSort implements Sortable {
    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    @Override
    public int[] sort() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j-1] > array[j])
                    ArrayLib.swap(array, j, j-1);
            }
        }

        return array;
    }
}

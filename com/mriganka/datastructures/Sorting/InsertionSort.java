package com.mriganka.datastructures.Sorting;

import com.mriganka.datastructures.Common.ArrayLib;

/**
 * Insertion Sort : Each new element is put into it's correct place in the sorted first half
 * of the array. The swaps and comparisons are adjacent.
 *
 * Time:
 * O(n) : Best case; Sorted array.
 * O(n^2) : Average / Worst case
 *
 * Trivia:
 * Insertion sort is faster that Quick Sort in case of small arrays!
 */
public class InsertionSort implements Sortable {
    private int[] array;

    public InsertionSort(int [] array) {
        this.array = array;
    }

    @Override
    public int[] sort() {
        int i,j;

        for(i = 1; i < array.length; i++) {
            j = i;
            while (j > 0 && array[j] < array[j-1]) {
                ArrayLib.swap(array, j, j-1);
                j--;
            }
        }

        return array;
    }
}

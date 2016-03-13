package com.mriganka.datastructures.Sorting;

import com.mriganka.datastructures.Common.ArrayLib;

/**
 *
 * Selection Sort : Each iteration picks the smallest element from the remaining
 * list of unsorted array and swaps it with the current element.
 *
 * https://en.wikipedia.org/wiki/Selection_sort
 *
 * 
 */
public class SelectionSort implements Sortable {
    private int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }

    @Override
    public int[] sort() {
        for(int i=0; i < array.length; i++) {
            int min = array[i],
                minPos = i;

            for (int j=i+1; j < array.length; j++) {
                if(array[j] < min) {
                    min = array[j];
                    minPos = j;
                }
            }

            ArrayLib.swap(array, i, minPos);
        }

        return array;
    }
}

package com.mriganka.datastructures;

import com.mriganka.datastructures.Common.ArrayLib;
import com.mriganka.datastructures.Sorting.BubbleSort;
import com.mriganka.datastructures.Sorting.InsertionSort;
import com.mriganka.datastructures.Sorting.SelectionSort;

public class Main {

    public static void main(String[] args) {
	    int[] a = {1,-2,4, -4,0,567,8,23,0};

        new SelectionSort(a).sort();
//        new BubbleSort(a).sort();
//        new InsertionSort(a).sort();
        ArrayLib.print(a, " < ");
    }
}

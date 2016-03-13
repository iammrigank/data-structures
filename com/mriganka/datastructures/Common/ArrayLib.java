package com.mriganka.datastructures.common;

/**
 * Contains some useful methods for array manipulation
 */
public class ArrayLib {
    public static void swap(int a[] , int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    public static void print(int[] a) {
        print(a, ", ");
    }

    public static void print(int a[], String separator) {
        for (int i = 0; i < a.length ; i++) {
            if (i == a.length - 1)
                System.out.print("" + a[i]);
            else
                System.out.print("" + a[i] + separator);
        }

        System.out.println();
    }
}

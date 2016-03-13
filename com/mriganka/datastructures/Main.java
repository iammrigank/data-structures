package com.mriganka.datastructures;

import com.mriganka.datastructures.algorithms.BasicPatternMatching;
import com.mriganka.datastructures.common.ArrayLib;
import com.mriganka.datastructures.linkedlist.SingleLinkedList;
import com.mriganka.datastructures.sorting.BubbleSort;
import com.mriganka.datastructures.sorting.InsertionSort;
import com.mriganka.datastructures.sorting.SelectionSort;

public class Main {

    public static void main(String[] args) {
	    int[] a = {1,-2,4, -4,0,567,8,23,0};

        new SelectionSort(a).sort();
//        new BubbleSort(a).sort();
//        new InsertionSort(a).sort();
//        ArrayLib.print(a, " < ");

//        System.out.println( new BasicPatternMatching("Mriganka").contains("iank") );

        trySingleLinkedList();
    }

    private static void trySingleLinkedList() {
        SingleLinkedList list = new SingleLinkedList();
        list.add(434);
        list.add(-434);
        list.add(0);
        list.add(1);
        list.add(40);
        list.add(0);

        list.print();

        list.add(98);
        list.print();

        list.remove(0);
        list.print();

        list.remove(98);
        list.print();

        list.remove(-23);
        list.print();

        list.remove(1);
        list.print();

        list.remove(434);
        list.print();

        list.remove(40);
        list.print();

        list.remove(0);
        list.print();

        list.remove(-434);
        list.print();
    }
}

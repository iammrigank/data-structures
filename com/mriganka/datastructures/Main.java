package com.mriganka.datastructures;

import com.mriganka.datastructures.common.BTreePrinter;
import com.mriganka.datastructures.containers.Linear.Queue;
import com.mriganka.datastructures.containers.Linear.Stack;
import com.mriganka.datastructures.containers.Tree.BST;
import com.mriganka.datastructures.linkedlist.SingleLinkedList;

public class Main {

    public static void main(String[] args) {
//	    int[] a = {1,-2,4, -4,0,567,8,23,0};

//        new SelectionSort(a).sort();
//        new BubbleSort(a).sort();
//        new InsertionSort(a).sort();
//        ArrayLib.print(a, " < ");

//        System.out.println( new BasicPatternMatching("Mriganka").contains("iank") );

//        trySingleLinkedList();
//        tryQueue();
        tryTree();
    }

    private static void tryTree() {
        BST<Integer> tree = new BST<>();
        tree.insert(5);
        tree.insert(2);
        tree.insert(0);
        tree.insert(9);
        tree.insert(-1);
        tree.insert(11);
        tree.insert(20);
        tree.insert(14);
        tree.insert(1);
        tree.insert(1);
        tree.insert(90);
        tree.insert(0);
        tree.insert(33);
        tree.insert(-2);

        new BTreePrinter().printNode(tree.getRoot());

        System.out.println(tree.search(33));
        System.out.println(tree.search(200));

        tree.delete(20);
        new BTreePrinter().printNode(tree.getRoot());
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

    private static void tryStack() {
        Stack<Double> stack = new Stack<>();

        stack.push(34.3); stack.push(.3); stack.push(-0.0); stack.push(-3.3);
        stack.print();
        stack.pop(); stack.pop();
        System.out.println(stack.top());
    }

    private static void tryQueue() {
        Queue<Double> queue = new Queue<>();

        queue.enqueue(34.3); queue.enqueue(.3); queue.enqueue(-0.0); queue.enqueue(-3.3);
        queue.print();
        queue.dequeue(); queue.dequeue();
        queue.print();
    }
}

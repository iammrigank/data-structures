package com.mriganka.datastructures.containers.Linear;

import java.util.ArrayList;

public class Queue<T> {
    private ArrayList<T> array = new ArrayList<>();

    public boolean isEmpty() {
        return array.isEmpty();
    }

    public void enqueue(T element) {
        array.add(element);
    }

    public T dequeue() {
        if (isEmpty())
            return null;

        return array.remove(0);
    }

    public void print() {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i));
            if (i == 0)
                System.out.print(" (top), ");
            else if (i == array.size() - 1)
                System.out.print("");
            else
                System.out.print(" (top), ");
        }
        System.out.println();
    }
}

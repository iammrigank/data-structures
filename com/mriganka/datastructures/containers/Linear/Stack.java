package com.mriganka.datastructures.containers.Linear;

import java.util.ArrayList;


public class Stack<T> {
    private ArrayList<T> array = new ArrayList<>();

    public void push(T value) {
        array.add(value);
    }

    public T pop() {
        if(isEmpty())
            return null;

        return array.remove(array.size() - 1);
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }

    public T top() {
        if(isEmpty())
            return null;

        return array.get(array.size() - 1);
    }

    public void print() {
        for (int i = array.size() - 1; i >= 0; i--) {
            System.out.print(array.get(i));
            if (i == array.size() - 1)
                System.out.print(" (top), ");
            else
                System.out.print(", ");
        }
        System.out.println();
    }
}

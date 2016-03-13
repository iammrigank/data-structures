package com.mriganka.datastructures.linkedlist;

/**
 * Implementation for single linked lists.
 */
public class SingleLinkedList {
    private Node head;
    private Node tail;

    public SingleLinkedList() {
        head = tail = null;
    }

    public void add(int value) {
        if (head == null)
            head = tail = new Node(value);
        else {
            Node newNode = new Node(value);
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void remove(int value) {
        if (head == null)
            return;

        if (head.value == value) {
            head = head.next;

            if (head == null)
                tail = null;

            return;
        }

        for (Node n = head; n.next != null; n = n.next) {
            if (n.next.value == value) {
                n.next = n.next.next;

                if (n.next == null)
                    tail = n;

                return;
            }
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean hasElement(int value) {
        Node n = head;
        while (n != null && n.value != value) {
            n = n.next;
        }

        return n != null;
    }

    public void print() {
        if (isEmpty())
            System.out.println("Empty List");

        Node n = head;
        while (n != null) {
            if (n == tail) {
                n.print();
                if (n == head) System.out.print(" (head)");
                System.out.print(" (tail)");
            }
            else {
                n.print();
                if (n == head) System.out.print(" (head)");
                System.out.print(" -> ");
            }
            n = n.next;
        }

        System.out.println();
    }
}

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public void print() {
        System.out.print("[" + value + "]");
    }
}

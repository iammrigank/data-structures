package com.mriganka.datastructures.containers.Tree;

public class TreeNode<T extends Comparable<T>> {
    public TreeNode<T> right;
    public TreeNode<T> left;
    public T data;

    public TreeNode(T data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }

    public void printData() {
        System.out.println(data);
    }
}

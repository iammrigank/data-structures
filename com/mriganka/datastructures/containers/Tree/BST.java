package com.mriganka.datastructures.containers.Tree;

/**
 * BST or Binary Search Tree
 */
public class BST<T extends Comparable<T>> {
    private TreeNode<T> root;

    public BST(T data) {
        this.root = new TreeNode<>(data);
    }

    public BST() {}

    public void insert(T data) {
        root = insert(root, data);
    }

    private TreeNode<T> insert(TreeNode<T> root, T data) {
        if (root == null)
            return new TreeNode<>(data);

        if (root.data.compareTo(data) < 0)
            root.right = insert(root.right, data);
        else
            root.left = insert(root.left, data);

        return root;
    }

    /**
     * This method returns the node reference of the searched
     * value or null depending whether the key is
     * found or not, respectively.
     * @param data - key to be searched for.
     * @return TreeNode
     */
    public boolean search(T data) {
        return search(root, data);
    }

    private boolean search(TreeNode<T> root, T data) {
        if (root == null)
            return false;

        if (root.data.compareTo(data) == 0)
            return true;

        if (root.data.compareTo(data) < 0)
            return search(root.right, data);
        else
            return search(root.left, data);
    }

    public TreeNode<T> delete(T data) {
        if (! search(data))
            return null;

        return delete(root, data);
    }

    private TreeNode<T> delete(TreeNode<T> root, T data) {System.out.println("Looking at node : " + root.data + ", " +
            "trying to delete : " + data);
        // check if this 'root' must be deleted
        if (root.data.compareTo(data) == 0) {
            if (root.left == null && root.right == null)
                return null;
System.out.println("Found Node: " + root.data);
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            else {
                TreeNode<T> minNode = findMin(root.right);
                root.data = minNode.data;
                root.right = delete(root.right, minNode.data);
                return root;
            }
        }

        // Compare to find where the data can reside according to inequality
        if (root.data.compareTo(data) < 0)
            root.right = delete(root.right, data);
        else
            root.left = delete(root.left, data);

        return root;
    }

    public TreeNode<T> findMin() {
        return findMin(root);
    }

    private TreeNode<T> findMin(TreeNode<T> root) {
        if (root == null || root.left == null)
            return root;
        else
            return findMin(root.left);
    }

    public boolean isEmpty() {
        return root == null;
    }

    public TreeNode<T> getRoot() {
        return root;
    }

}












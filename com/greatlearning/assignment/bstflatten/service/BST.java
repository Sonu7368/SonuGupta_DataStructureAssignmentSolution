package com.greatlearning.assignment.bstflatten.service;

public class BST {
    public Node root;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return;
        }

        Node temp = root;

        while (true) {
            if (data > temp.data) {
                if (temp.right == null) {
                    temp.right = newNode;
                    return;
                }
                else temp = temp.right;
            }
            else {
                if (temp.left == null) {
                    temp.left = newNode;
                    return;
                }
                else temp = temp.left;
            }
        }
    }

    public static void printRightSkewedTree(BST bst) {
        Node temp = bst.root;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.right;
        }
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
}





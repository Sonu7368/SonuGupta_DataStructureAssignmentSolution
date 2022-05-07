package com.greatlearning.assignment.bstflatten.service;

public class FlattenBST {
    private static BST.Node first;
    private static BST.Node last;

    public static void toRightSkewed(BST bst) {
        bst.root = flattenToRightSkewed(bst.root);
    }

    private static BST.Node flattenToRightSkewed(BST.Node curr) {
        if (curr == null)   return null;

        flattenToRightSkewed(curr.left);

        if (first == null)  first = curr;
        else last.right = curr;

        curr.left = null;
        last = curr;

        flattenToRightSkewed(curr.right);

        return first;
    }
}

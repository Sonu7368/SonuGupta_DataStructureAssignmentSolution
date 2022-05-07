package com.greatlearning.assignment.bstflatten.model;

import com.greatlearning.assignment.bstflatten.service.BST;
import com.greatlearning.assignment.bstflatten.service.FlattenBST;

public class BSTDriver {

    public static void main(String[] args) {
        BST bst = new BST();

        bst.insert(40);
        bst.insert(20);
        bst.insert(60);
        bst.insert(10);
        bst.insert(30);
        bst.insert(50);
        bst.insert(70);


        System.out.println(
                "A BST is made with inserting \n" +
                "40, 20, 60, 10, 30, 50 & 70. \n"
        );

        /*
         *               BST Formed
         *
         *                  40
         *                /   \
         *              20     60
         *            /  \    /  \
         *          10   30  50   70
         */

        FlattenBST.toRightSkewed(bst);

        BST.printRightSkewedTree(bst);
    }


}

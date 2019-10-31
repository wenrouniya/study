package com.study.Offer;

import java.util.HashMap;

public class test {
    public static class TreeValue {
        public static int index = 0;
        public static final int[] TREE_VALUE = new int[]{1,2,3,0,4,5,0,0,6,0,0,7,0,0,8,0,9,10,0,0,0};
    }

    /**
     * Create A Binary Tree with TreeValue
     *
     * @node: a tree node
     * @i: the index of tree value
     */
    public static TreeNode createTree(TreeNode node, int i) {
        if (0 == TreeValue.TREE_VALUE[i]) {
            return null;
        } else {
            node.setVal(TreeValue.TREE_VALUE[i]);
        }

        TreeNode leftChild = new TreeNode();
        node.left = createTree(leftChild, ++TreeValue.index);
        TreeNode rightChild = new TreeNode();
        node.right = createTree(rightChild, ++TreeValue.index);

        return node;
    }

    /**
     * Definition for binary tree
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
            left = null;
            right = null;
        }
        TreeNode(int val) {
            this.val = val;
            left = null;
            right = null;
        }

        public void setVal(int val) {
            this.val = val;
        }
    }
    /**
     * 先序遍历
     *
     */
    public static void preOrderTraverse(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.val + " ");



        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root = createTree(root, 0);
        preOrderTraverse(root);
    }

//HashMap
}

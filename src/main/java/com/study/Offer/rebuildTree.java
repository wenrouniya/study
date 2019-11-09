package com.study.Offer;

public class rebuildTree {
    /**
     * Definition for binary tree
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        int preorder[] = {1, 2, 4, 7, 3, 5, 6, 8};
        int inorder[] = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode treeNode = reConstructBinaryTree(preorder, inorder);


    }

    public static  TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null) {
            return null;
        }
        TreeNode head = rebuidTreeCore(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return head;
    }

    public static TreeNode rebuidTreeCore(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        if (startPre > endPre || startIn > endIn) {
            return null;
        }
        TreeNode root = new TreeNode(pre[startPre]);

        for (int i = startIn; i <=endIn; i++) {
            if (in[i] == pre[startPre]) {
                root.left = rebuidTreeCore(pre, startPre + 1, startPre + (i - startIn), in, startIn, i - 1);
                root.right = rebuidTreeCore(pre, startPre + (i - startIn) + 1, endPre, in, i + 1, endIn);
            }
        }


        return root;
    }


}

package com.study.OrderTree;

import java.util.Stack;

/**
 * 中序遍历的非递归调用
 */
public class midOrder1 {
    static class treeNode{
        int val;
        treeNode left;
        treeNode right;
        treeNode(int val){
            this.val=val;
        }
    }
    //利用数组创建二叉树
    public static void createTree(){
        treeNode[] nodes=new treeNode[10];
        //赋值
        for (int i=0;i<10;i++){
            nodes[i]=new treeNode(i+1);
        }
        //创建左右子树
        for (int i=0;i<10;i++){
            if (i * 2 + 1 < 10) {
                nodes[i].left=nodes[i*2+1];
            }
            if (i*2+2<10){
                nodes[i].right=nodes[i*2+2];
            }
        }
        midOrder1(nodes[0]);
    }
    public  static void  midOrder1(treeNode biTree){
        Stack<treeNode> stack=new Stack<treeNode>();
        while(biTree!=null||!stack.isEmpty()){
            while(biTree!=null){
                stack.push(biTree);
                biTree=biTree.left;
            }
            if (!stack.isEmpty()){
                biTree=stack.pop();
                System.out.println(biTree.val);
                biTree=biTree.right;
            }
        }
    }

    public static void main(String[] args) {
        createTree();
    }
}

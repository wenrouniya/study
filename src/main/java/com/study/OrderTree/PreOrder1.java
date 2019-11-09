package com.study.OrderTree;

import java.util.Stack;

//前序遍历非递归调用

/**
 * 先输入当前节点的值 然后将当前结点入栈 将节点的左子树不断入栈
 * 一直到左子树为空  弹出栈顶节点  堆栈顶节点的右子树继续进行上述操作 知道栈为空
 */
public class PreOrder1 {
    static   class  treeNode{
        int val;
        treeNode left;
        treeNode right;
        treeNode(int value){
            this.val=value;
        }
    }
    public static void createTree(){
        treeNode[] nodes=new treeNode[10];
        for (int i=0;i<10;i++){
            nodes[i]=new treeNode(i+1);
        }
        for (int i=0;i<10;i++){
            if (i*2+1<10){
                nodes[i].left=nodes[i*2+1];//创建左子树
            }
            if (i*2+2<10){
                nodes[i].right=nodes[i*2+2];//创建右子树
            }
        }
        proOrder(nodes[0]);
    }
    //前序遍历的非递归调用
    public static void proOrder(treeNode biTree){
        Stack<treeNode> stack=new Stack<treeNode>();
        while(biTree!=null||!stack.isEmpty()){
            while(biTree!=null){
                System.out.println(biTree.val);
                stack.push(biTree);
                biTree=biTree.left;
            }
            if (!stack.isEmpty()){
                biTree=stack.pop();
                biTree=biTree.right;
            }

        }
    }

    public static void main(String[] args) {
        createTree();
    }

}


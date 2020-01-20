package com.study.OrderTree;

import java.util.LinkedList;

public class levelOrder {
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
        order(nodes[0]);
    }
    public  static  void order(treeNode biTree){
        if (biTree==null){
            return;
        }
        LinkedList<treeNode> list=new LinkedList<treeNode>();
        list.add(biTree);
        while(!list.isEmpty()){
//            poll是队列数据结构实现类的方法，从队首获取元素，同时获取的这个元素将从原队列删除
            treeNode node=list.poll();
            System.out.println(node.val);
            if (node.left!=null)
            list.add(node.left);
            if (node.right!=null)
            list.add(node.right);


        }
    }

    public static void main(String[] args) {
        createTree();
    }
}

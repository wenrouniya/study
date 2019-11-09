package com.study.OrderTree;

/**
 * 后续遍历的递归调用
 */
public class PostOrder {
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
        postOrder(nodes[0]);
    }
    public static void postOrder(treeNode biTree){
        if (biTree==null){
            return;
        }else{
            postOrder(biTree.left);
            postOrder(biTree.right);
            System.out.println(biTree.val);
        }
    }

    public static void main(String[] args) {
        createTree();
    }
}

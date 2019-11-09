package com.study.Offer;

/**
 * 根据0节点判断是否已经到尾部 递归创建链表
 */
public class createTree1 {
    public static int [] num=new int[]{1,2,3,0,4,5,0,0,6,0,0,7,0,0,8,0,9,10,0,0,0};
    public static int  index=0;
    public static Node create(int[] num){
        Node root=new Node(num[index]);
        addNode(root);
        return root;
    }
    public   static Node addNode(Node node) {
        if (node.data == 0) {
            return null;
        } else {
            if(num.length-1<++index){
                return null;
            }
            Node newNode=new Node(num[index]);
            node.left = addNode(newNode);
            node.right = addNode(newNode);
            return node;
        }
}
    /**
     * 先序遍历
     *
     */
    public static void preOrderTraverse(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }
    public static void main(String[] args) {
        Node node=create(num);
        preOrderTraverse(node);
    }
}

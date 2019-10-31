package com.study.Offer;

import java.util.LinkedList;
import java.util.List;

/**
 * 根据子节点位置和父节点位置的关系 创建二叉树
 */
public class createTree {

    public static  Node create(){
         int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
          List<Node> nodeList = null;

        nodeList=new LinkedList<Node>();
        //将数组中每一个值都设置为一个节点
        for(int nodeIndex=0;nodeIndex<array.length;nodeIndex++){
            nodeList.add(new Node(array[nodeIndex]));
        }
        //对于数组长度/2-1的节点可以作为父亲节点 且保证由左右子树
        for(int parentIndex=0;parentIndex<array.length/2-1;parentIndex++){
            //创建左子树
            nodeList.get(parentIndex).left=nodeList.get(parentIndex*2+1);
           //创建右子树
            nodeList.get(parentIndex).right=nodeList.get(parentIndex*2+2);
        }
        //针对最后一个父节点可能没有右子树 单独判断
        // 最后一个父节点:因为最后一个父节点可能没有右孩子，所以单独拿出来处理
        int lastParentIndex = array.length / 2 - 1;
        // 左孩子
        nodeList.get(lastParentIndex).left = nodeList
                .get(lastParentIndex * 2 + 1);
        // 右孩子,如果数组的长度为奇数才建立右孩子
        if (array.length % 2 == 1) {
            nodeList.get(lastParentIndex).right= nodeList
                    .get(lastParentIndex * 2 + 2);
        }

        return nodeList.get(0);
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
        Node node=create();
       // System.out.println(node.getData());
         preOrderTraverse(node);
    }
}

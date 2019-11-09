package com.study.OrderTree;

import com.study.Offer.createTree;
//前序遍历递归调用

/**
 * 套路：
 * 输出根节点的值
 * 如果左子树不为空 调用函数传递左子树
 * 如果右子树不为空 调用函数传递右子树
 * 思路：
 * 先输出根节点的值 然后调用函数会输出它的左节点的值 一直到左节点全部被访问到最后一层 此时左节点的值已经被全部输出了
 * 调用函数传递右节点的值 如果右节点的值部不为空 会输出右节点的值 再一层一层向上返回
*/
public class PreOrder {
   static  class treeNode{
        int val;
        treeNode left;
        treeNode right;
        treeNode (int value){
         this.val=value;
        }
    }

    public static void main(String[] args) {
        createTree();
    }
    public static void  createTree(){
        treeNode [] nodes= new treeNode[10];
        for (int i=0;i<10;i++){
            nodes[i]=new treeNode(i+1);
        }
        for (int i=0;i<10;i++){
            if(i*2+1<10){
                nodes[i].left=nodes[i*2+1];
            }
            if (i*2+2<10){
                nodes[i].right=nodes[i*2+2];
            }
        }
        proOrder(nodes[0]);

    }
    public  static void proOrder(treeNode biTree){
        System.out.println(biTree.val);
        treeNode  left=biTree.left;
        if (left!=null){
            proOrder(left);
        }
        treeNode right=biTree.right;
        if (right!=null){
            proOrder(right);
        }

    }

}

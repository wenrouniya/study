//package com.study.Offer;
//
//import java.beans.BeanInfo;
//
//public class resetBinaryTreeNode {
//    static class BinaryTree{
//        private int data;
//        private BinaryTree left;
//        private  BinaryTree right;
//        public BinaryTree(int data){
//            this.data=data;
//        }
//    }
//    public static void buildTree(int [] beforeOver, int [] middleOver){
//        int indexi=0;
//        int indexj=0;
//        int taili=beforeOver.length;
//        int tailj=middleOver.length;
//        int rootValue=beforeOver[indexi];
//        while(indexj<tailj &&middleOver[indexj]!=rootValue){
//            indexj++;
//        }
//    }
//
//    public static BinaryTree createTree(int [] a){
//        BinaryTree node=new BinaryTree(a[0]);
//        node.left=addNode();
//        node.right=addNode();
//
//
//    }
//
//
//    public static void main(String[] args) {
//        int beforeOver [] ={1,2,4,7,3,5,6,8};
//        int middleOver []={4,7,2,1,5,3,8,6};
//        buildTree(beforeOver,middleOver);
//    }
//}

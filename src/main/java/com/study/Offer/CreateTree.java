package com.study.Offer;

import java.sql.SQLOutput;
import java.util.Stack;

public class CreateTree {
    static class treeNode{
        private int value;
        private treeNode left;
        private treeNode right;
        public treeNode(int value){
            this.value=value;
        }

    }
    public static treeNode create(int [] num,int index){
        treeNode root=new treeNode(num[index]);
        System.out.println(root.value);
        addNode(root,num,index+1);
        return root;

    }

    public static treeNode addNode(treeNode  node,int [] num,int index) {
        if(num[index]==0){
            return null;
        }else {

            node.left = addNode(new treeNode(num[index]),num,index+1);
            System.out.println(node.value);
            node.right = addNode(new treeNode(num[index]),num,index+1);
            System.out.println(node.value);
            return node;
        }

    }

//qianxu bianli
        public static void prePrint(treeNode node){
            Stack<treeNode> stack = new Stack();
            while (true) {
                while (node != null) {
                    System.out.println(node.value);
                    stack.push(node);
                    node = node.left;
                }
                if (stack.empty()) {
                    break;
                }
                node = stack.pop();
                node = node.right;
            }
        }


    public static void main(String[] args) {
        int [] num={1,2,3,0,4,5,0,0,6,0,0,7,0,0,8,0,9,10,0,0,0};
        treeNode node=create(num,0);
     //   prePrint(node);
    }

    }


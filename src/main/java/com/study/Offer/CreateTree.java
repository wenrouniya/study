package com.study.Offer;

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
        treeNode node=addNode(root,num,index+1);
        return root;

    }

    public static treeNode addNode(treeNode  node,int [] num,int index) {
        treeNode newNode = new treeNode(num[index]);
        if (num[index - 1] >= num[index]&&index<num.length-1) {
            node.left = addNode(newNode, num, index + 1);
        } else if(num[index - 1] <num[index]&&index<num.length-1){
            node.right = addNode(newNode, num, index + 1);
        }else {
            return newNode;
        }
        return node;
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
        int [] num={5,3,1,4,7,6,8};
        treeNode node=create(num,0);
        prePrint(node);
    }

    }


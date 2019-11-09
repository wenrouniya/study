package com.study.OrderTree;

import java.util.Stack;

/**
 * 后续遍历的非递归调用
 */
public class PostOrder1 {
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
        postOrder(nodes[1]);
    }
    public static void postOrder(treeNode biTree){
        int left=1;
        int right=2;
        Stack<treeNode> stack1=new Stack<treeNode>();
        Stack<Integer> stack2=new Stack<Integer>();//辅助栈 用来判断子节点返回父节点时处于左子树还是右子树
        while(biTree!=null){
            stack1.push(biTree);//将左节点入栈
            stack2.push(left);//将节点标记为左节点
            biTree=biTree.left;
        }
        while(!stack1.isEmpty()&&stack2.peek()==right){
            //如果是从右子节点返回父节点，则任务完成，将两个栈的栈顶弹出
            stack2.pop();
            System.out.println(stack1.pop().val);
        }
        if (!stack1.isEmpty()&&stack2.peek()==left){
            //如果是从左子节点返回父节点，则将标记改为右子节点
            stack2.pop();
            stack2.push(right);//对右节点进行操作 将stack2的栈顶改为right
            //peek()查看栈顶的对象而不移除它
            biTree=stack1.peek().right;
        }
    }
}

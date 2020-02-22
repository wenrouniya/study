package com.leetcode;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution13 {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        if(pRoot==null){
            return res;
        }
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        int start=0;
        int  end=1;
        queue.offer(pRoot);//像队列中加入元素
        while(!queue.isEmpty()){
            ArrayList<Integer> temp=new ArrayList<Integer>();
            while(start!=end){
                TreeNode node=queue.poll();//返回第一个元素 并在队列中删除
                start++;
                if(node!=null){
                    queue.offer(node.left);
                    queue.offer(node.left);
                    temp.add(node.val);
                }
            }
            if(!temp.isEmpty()){
                end=queue.size();
                start=0;
                res.add(temp);
            }
        }
        return res;
    }

}

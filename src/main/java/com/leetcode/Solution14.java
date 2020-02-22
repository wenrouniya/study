package com.leetcode;

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
public class Solution14 {
    public static   int index=-1;
   public  static  String Serialize(TreeNode root) {
        StringBuffer sb= new StringBuffer();
        if(root==null){
            sb.append("#");
            return sb.toString();
        }
        sb.append(root.val+"!");
        Serialize(root.left);
        Serialize(root.right);
        return sb.toString();

    }
  public  static TreeNode Deserialize(String str) {
        index++;
        if(index>=str.length()){
            return null;
        }
        String[] strr=str.split("0");
        TreeNode node =null;
        if(!strr[index].equals("#")){
            node =new TreeNode(Integer.valueOf(strr[index]));
            node.left=Deserialize(str);
            node.right=Deserialize(str);
        }
        return node;
    }

    public static void main(String[] args) {
        int [] in={8,0,6,0,10,0,5,0,7,0,9,0,11};
        StringBuffer sb=new StringBuffer();
        for (int i:in){
            sb.append(i);
        }
        String s=sb.toString();
       TreeNode ss= Deserialize(s);
        System.out.println(ss);
    }
}
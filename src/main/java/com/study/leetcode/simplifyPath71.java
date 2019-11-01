package com.study.leetcode;

import java.util.Stack;

/**
 * 简化路径
 */
public class simplifyPath71 {
    public static void main(String[] args) {
        String s = "/home/foo/";
        String s1 = simplifyPath(s);
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i));
        }
    }

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack();
        for (String item : path.split("/")) {
            if (item.equals("..")) {

                if (!stack.isEmpty()) stack.pop();
            } else if (!item.isEmpty() && !item.equals(".")) {
                stack.push(item);


            }
        }
        String res = "";
        for(int i=0;i<stack.size();i++){
            res = res+"/" + stack.get(i) ;
        }
        return res.isEmpty() ? "/" : res;
    }
}

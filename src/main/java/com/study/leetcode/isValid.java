package com.study.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class isValid {
    public static void main(String[] args) {
        String string="{{(}}";
      boolean flag=  is(string);
        System.out.println(flag);
    }
    public static boolean is(String s){
        Map  map=new HashMap<Character,Character>();
        Stack<Character> stack =new Stack();
        map.put('}', '{');
        map.put(']','[');
        map.put(')','(');


        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            //containsKey返回是否包含指定的键名
            if (map.containsKey(c)){
                char nowTop=stack.empty()?'#': stack.pop();
                if (nowTop != (char)map.get(c)){
                    return false;
                }

            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}

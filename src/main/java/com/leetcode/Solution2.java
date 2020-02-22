package com.leetcode;

import java.util.LinkedHashMap;

public class Solution2 {
    /*
     *LinkedHashMap为有序的 且默认顺序为插入顺序
     *为了检测出第一个只出现一次的字符 用linkedhashmap更具有普遍性
     *利用hash表先将所有的字符存在hash表中<字符，次数>
     *遍历hash表 找出第一个time等于1的index
     *时间复杂度为O（2n）
     **/
    public int FirstNotRepeatingChar(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                int time=map.get(str.charAt(i));
                map.put(str.charAt(i),++time);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(map.get(c)==1){
                return i;
            }

        }

        return -1;
    }
}
package com.leetcode;

import java.util.Map;
import java.util.LinkedHashMap;//有序的hash链表
public class Solution10 {
    //字符和出现的次数形成一 一对应关系  自然想到哈希表的key-value 或者关联容器map
    //Insert one char from stringstream
    Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
    public void Insert(char ch)
    {
        if(!(map.containsKey(ch))){
        map.put(ch,1);
        }else{
        map.put(ch,map.get(ch)+1);
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for(char ch:map.keySet()){
            if(map.get(ch)==1){
                return ch;
            }
        }
        return '#';

    }
}

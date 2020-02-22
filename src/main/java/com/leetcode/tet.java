package com.leetcode;

/**
 * 请实现一个函数用来匹配URL。'*'表示匹配URL资源路径中的任意层级资源路径（包含无层级），其他部分需要字符串完全匹配。
 */
public class tet {
    public static void main(String[] args) {
//拆分url为字符串数字
        String url = "http://sports.sina.com.cn/";
        String [] sub_url_array = url.split("[/ : . - _ # %]");
        int sid;
        for(sid=0;sid<sub_url_array.length;sid++) {
            if (sub_url_array[sid].equals("")) continue;
            System.out.println(sub_url_array[sid]);
        }
    }
    public  boolean isTrue(String url,String pattern){
        String[] str1=url.split("[/ : . - _ # %]");
        if(str1==null){
            return  false;
        }
        String []str=new String[str1.length];
        int j=0;
        for(int i=0;i<str.length;i++){
            if(str1[i].equals("")){
                continue;
            }
            str[j++]=str1[i];
        }
        String[] pat1=pattern.split("[/ : . - _ # %]");
        if(pat1==null){
            return false;
        }
        String []pat=new String[pat1.length];
        j=0;
        for(int i=0;i<str.length;i++){
            if(str1[i].equals("")){
                continue;
            }
            str[j++]=str1[i];
        }
        return  isMatch(str,0,pat,0);
    }
    public boolean  isMatch(String [] url,int urlIndex,String [] pat,int patIndex){
        if(urlIndex==url.length&&patIndex==pat.length){
            return true;
        }
        if(urlIndex!=url.length&&patIndex==pat.length){
            return false;
        }
        //匹配串下一位是'*'
        if(urlIndex+1<url.length && pat[patIndex+1]=="*"){
                return isMatch(url,urlIndex,pat,patIndex+2)//相当于跳过X*
                        ||isMatch(url,urlIndex+1,pat,patIndex+2)//相当于匹配以一位
                        ||isMatch(url,urlIndex+1,pat,patIndex);//相当于匹配多位

        }
        //匹配串下一位不是*   匹配串和字符串第一位相等
        if(urlIndex!=url.length&&url[urlIndex]==pat[patIndex]){
            return isMatch(url,urlIndex+1,pat,patIndex+1);
        }
        return false;
    }
}

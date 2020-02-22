package com.leetcode;

/**
 * .  * 匹配
 */
public class Solution11 {
    public static  boolean match(char[] str, char[] pattern)
    {
        if(str==null||pattern==null){
            return false;
        }
        int strIndex=0;
        int patternIndex=0;
        return   ismatch(str,strIndex,pattern,patternIndex);

    }
    /**
     * 1.当匹配串的第二个字符不是“*”时
     * a.字符串和匹配串一个一个匹配 匹配成功两个指针后移 比较下一个
     * b.字符串和匹配串字符不匹配  直接返回false
     * 2.当匹配串的第二个字符是“*”时  字符串第一个字符和模式串第一个字符不匹配 模式串后移两位  相当于X*被忽略
     *  字符串第一个字符和模式串第一个字符匹配  分三种情况
     * a.模式后移两位  相当于X*被忽略
     * b.字符串后移一位 模式串后移两位  相当于匹配一位
     * c.字符串后移一位 模式串不变 因为*可以匹配多位字符
     * @param str
     * @param strIndex
     * @param pattern
     * @param patternIndex
     * @return
     */
    public  static boolean ismatch(char [] str,int strIndex,char []pattern ,int patternIndex){
        if(strIndex==str.length&&patternIndex==pattern.length){
            return true;
        }
        if(strIndex!=str.length&&patternIndex==pattern.length){
            return false;
        }
        //匹配串下一位是'*'
        if(patternIndex+1<pattern.length && pattern[patternIndex+1]=='*'){
            if((str.length!=strIndex&&str[strIndex]==pattern[patternIndex])||
                    (str.length!=strIndex&&pattern[patternIndex]=='.')){
                return ismatch(str,strIndex,pattern,patternIndex+2)//相当于跳过X*
                        ||ismatch(str,strIndex+1,pattern,patternIndex+2)//字符串后移一位匹配串后移两位相当于匹配一位
                        ||ismatch(str,strIndex+1,pattern,patternIndex);//相当于匹配多位
            }else{//字符串第一位和匹配串第一位不同 直接跳过X*
                return ismatch(str,strIndex,pattern,patternIndex+2);
            }
        }
        //匹配串下一位不是*   匹配串和字符串第一位相等
        if((strIndex!=str.length&&str[strIndex]==pattern[patternIndex])||
                (strIndex!=str.length&&pattern[patternIndex]=='.')){
            return ismatch(str,strIndex+1,pattern,patternIndex+1);
        }
        return false;

    }

    public static void main(String[] args) {
        char [] str=new char[] {'a'};
        char [] pattern =new char[] {'a','.'};
        boolean match = match(str, pattern);
        System.out.println(match);
    }
}

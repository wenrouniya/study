package com.leetcode;

class Solution21 {
    public static void main(String[] args) {
        int i = myAtoi("-42");
        System.out.println(i);
    }
    public static  int myAtoi(String str) {
        //trim()函数去除首位字符  尽量使用trim()  会产生新的变量
        // if(str==null||str.trim()==null){
        //     return 0;
        // }
        //首字符不是数字不是符号 返回0
        //转换为数字后超过整数所能表示的最大范围  返回0
        //其余情况 返回字符串转换成的数字本身
        //循环中如果遇到 非数字 即推出循环
        //字符串每位列举 str.toCharArray();
        int len=str.length();
        //去掉前导空格
        int index=0;
        while(index<len){
            if(str.charAt(index)!=' '){
                break;//遇到第一个不是空格的值跳出循环
            }
            index++;//否则 继续向下寻找
        }
        //如果整个字符串都为空格 返回0
        if(index==len){
            return 0;
        }

        int sign=1;//标志正负号
        //判断第一个数是否为正符号
        if(str.charAt(index)=='+'){
            sign=1;
            index++;
        }else if(str.charAt(index)=='-'){
            sign=-1;
            index++;
        }
        int res=0;
        while(index<len){
            //判断合法性
            char currentNum=str.charAt(index);
            if(currentNum<'0'||currentNum>'9'){
                break;
            }
            if(res>Integer.MAX_VALUE/10||res==Integer.MAX_VALUE/10&&currentNum-'0'>7){
                return Integer.MAX_VALUE;
            }
            if(res<Integer.MIN_VALUE/10||res==Integer.MIN_VALUE/10&&currentNum-'0'>8){
                return Integer.MIN_VALUE;
            }

            res=res*10+(currentNum-'0')*sign;
            index++;
        }
        return res;



    }
}

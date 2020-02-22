package com.leetcode;

public class Solution7 {
    public static  int StrToInt(String str) {
        if(str.equals("")||str.length()==0){
            return 0;
        }
        char [] st=str.toCharArray();
        int len=st.length;
        long res=0;
        int s;
        int i;
        if(st[0] == '-'){
            s=-1;
            i=1;
        }else if(st[0]=='+'){
            s=1;
            i=1;
        }else{
            i=0;
            s=1;
        }
        for(;i<len;i++){
            if(st[i]<='0'||st[i]>='9') return 0;//非法字符返回0
            res=res*10+st[i]-'0';
        }
            res = res*s;
        if(res>Integer.MAX_VALUE||res<Integer.MIN_VALUE){
        return 0;
        }
        return (int)res;
}

    public static void main(String[] args) {
        String str="2147483648";
        int i = StrToInt(str);
        System.out.println(i);

    }
}

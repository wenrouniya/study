package com.leetcode;

/**
 * 连续子数组的最大和
 * {6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。给一个数组，返回它的最大连续子序列的和，
 */
public class Solution1 {
    //动态规划
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array==null||array.length==0){
            return 0;
        }
        int f=array[0];
        int res=array[0];
        for(int i=1;i<array.length;i++){
            f=Math.max(f+array[i],array[i]);
            res=Math.max(res,f);
        }
        return res;

    }

}

package com.study.leetcode;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 找出不重复数组中所有相加等于targrt的值
 * 数组中的值可以重重复使用
 */
public class combinationSum39 {
    public static void main(String[] args) {

      int []  candidates = {2,3,6,7};
      int target = 7;
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        res= combinationSum(candidates,target);
    }

    private static  ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        ArrayList arrayList=new ArrayList();
        if (candidates.length==0)
            return res;
        Arrays.sort(candidates);
      combinationSumHelp(res,arrayList,candidates,target,0);
      return res;
    }

        private static boolean combinationSumHelp(ArrayList<ArrayList<Integer>> res, ArrayList arrayList, int[] nums,int target, int i) {

        if (target==0){
            ArrayList list = new ArrayList(arrayList);
            res.add(list);
            return false;
        }else if( target<0){
            return false;

        }else
        {
            for (int j=i;j<nums.length;j++){
                arrayList.add(nums[j]);
                boolean flag= combinationSumHelp(res,arrayList,nums,target-nums[j],j);
                //能进入这一步说明当前数组中的组合已经大于target或者已经恰好能满足
                arrayList.remove(arrayList.size()-1);
                //此次循环不同或者循环已经满足条件break直接跳出循环
                if (!flag){
                    break;
                }
            }


        }


       return true;
    }
}

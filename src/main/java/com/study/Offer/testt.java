package com.study.Offer;

public class testt {
    public static void main(String[] args) {
        int [] arr={1,2,3,3,3,3,4,5};
        int result =GetNumberOfK(arr,3);
        System.out.println(result);
    }

    public  static int GetNumberOfK(int [] array , int k) {

        if(array.length==0||array==null){
            return 0;
        }
        int count=0;
        int start=0;
        int end=array.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)>>1;
            if(array[mid]>k){
                end=mid-1;
            }else if(array[mid]<k){
                start=mid+1;
            }else{
                count++;
                break;
            }
        }
        for( start=mid-1;start>=0&&array[start]==k;start--){
            count++;
        }
        for( end=mid+1;end<array.length&&array[end]==k;end++){
            count++;
        }
        return count;
    }
}

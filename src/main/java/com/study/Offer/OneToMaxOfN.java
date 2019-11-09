package com.study.Offer;

/**
 * 打印从1到最大的n位数
 */
public class OneToMaxOfN {

    public static void main(String[] args) {
        int n=3;
       printtoMax(n);
//        char [] num={'0','3','0'};
//        printtoMax(num);
    }

  public  static   void printtoMax(int n){
        if(n<=0){
            return;
        }
        char [] number=new char[n+1];
        number[n]='\0';

        for (int i=0;i<10;i++){
            number[0]= (char) (i+'0');
            printToMax(number, n,0);
        }
    }

    private static  void printToMax(char[] number, int n, int index) {
        if(index==n-1){
            printtoMax(number);
            return;
        }
        for(int i=0;i<10;i++){
            number[index+1]= (char) (i+'0');
            printToMax(number,n,index+1);
        }
    }

    private static  void printtoMax(char[] number) {
        boolean flag=true;
        int n=number.length;
        for(int i=0;i<n;i++) {
            if (flag && number[i] != '0') {
                flag = false;
            }
            if (!flag) {
                System.out.print(number[i]);
            }
        }
    }
}

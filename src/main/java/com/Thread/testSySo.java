package com.Thread;

import java.util.Arrays;
import java.util.Scanner;

public class testSySo {
    public static void main(String[] args) {
       //soutShuzu();
       // soutJuzhen();
        //returnChar();
        returnString();
    }
    public static  void soutShuzu(){
        Scanner reader = new Scanner(System.in);
        while(reader.hasNext()){
            int n=reader.nextInt();
            int[] num=new int[n];
            for(int i=0;i<n;i++){
                num[i]=reader.nextInt();
            }
            System.out.println(Arrays.toString(num));
        }
        reader.close();
    }
    public static void soutJuzhen(){
       Scanner sanner= new Scanner(System.in);
       int a=sanner.nextInt();
       int b=sanner.nextInt();
           int[][] num=new int[a][b];
           for(int i=0;i<a;i++){
               for(int j=0;j<b;j++){
                   num[i][j]=sanner.nextInt();
               }
           }
           sanner.close();
           for(int i=0;i<a;i++){
               for(int j=0;j<b;j++){
                   System.out.print(num[i][j]+" ");
               }
               System.out.println();
           }

    }

    public static   void returnChar(){
        Scanner reader = new Scanner(System.in);
       String s= reader.next();//取出下一个分隔符之前的字符
        System.out.println(s);
        reader.close();
    }

    public  static  void returnString(){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();//读取下一行
        System.out.println(s);
        sc.close();
    }
}

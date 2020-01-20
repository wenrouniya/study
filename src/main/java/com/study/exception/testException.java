package com.study.exception;

public class testException {
    static int  avg(int n1, int n2) throws MyException {
        if(n1<10){
            throw new MyException("N1太小了");
        }
        if(n2>100){
            throw new MyException("N2太大了");
        }
        return (n1+n2)/2;
    }

    public static void main(String[] args) {
       try{ int result=avg(0, 200);
        System.out.println(result);
       }catch(MyException e){
           System.out.println(e.getMessage());
       }
    }
}

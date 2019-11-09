package com.study.JVM;

public class test6 {
    public static void main(String[] args) {
        fruit a=new apple();
        fruit o=new oragnr();
        a.test();
        o.test();
        a=new oragnr();
        a.test();
    }
}
class fruit{
  public void   test(){
      System.out.println("水果");
  }
}
class apple extends fruit{
    //方法重写
    @Override
    public void test() {
        System.out.println("苹果");
    }
}
class oragnr extends  fruit{
    @Override
    public void test() {
        System.out.println("橘子");
    }
}

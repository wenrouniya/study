package com.study.JVM;

public class test4 {
    //方法重载
    public  void test(c1 c1){
        System.out.println("c1");
    }

    public  void test(c2 c2){
        System.out.println("c2");
    }
    public void test(c3 c3){
        System.out.println("c");
    }


    public static void main(String[] args) {
        c1 cc=new c2();
        c1 ccc=new c3();
        test4 test=new test4();
        test.test(cc);
        test.test(ccc);

    }
}
class c1{

}
class c2 extends  c1{

}
class c3 extends  c2{

}

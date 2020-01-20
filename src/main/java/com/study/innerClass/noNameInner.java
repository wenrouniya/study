package com.study.innerClass;

/**
 * 匿名内部类只能继承或者实现一个父类或者接口
 * 因为系统创建匿名内部类的时候会立即创建匿名内部类的对象，因此匿名内部类不能是抽象的
 * 因为匿名内部类没有类名 所以不能定义匿名内部类的构造器】
 * 由于匿名内布类不能是抽象的 所以必须实现它的抽象父类或者抽象接口的全部方法
 *
 */
 interface  A{
     public  String getName();
        }
public class noNameInner {

     public noNameInner(A a){
         System.out.println("类的构造方法");
     }

    public static void main(String[] args) {
        new noNameInner(new A() {
            @Override
            public String getName() {
                return "xixi";
            }
        });
    }
}

package com.study.innerClass;

/**
 * 匿名内部类通过继承父类的形式创建时，匿名内部类会拥有和父类构造器一样得形参列表
 */
abstract  class baba{
    private  String name;
    public  abstract  double getPrice();
    public baba(){}
    public baba(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class NoNameInner1 {
    public  void test(baba b){
        System.out.println("购买了一个"+b.getName()+"共花了"+b.getPrice());
    }

    public static void main(String[] args) {
        new NoNameInner1().test(new baba("雨伞") {
            @Override
            public double getPrice() {
                return 3.34;
            }
        });
    }


}

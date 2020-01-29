package com.study.manyThread;

public class testEqualsClass {
    public static void main(String[] args) {
        Tickett t = new Tickett();
        seller seller1 = new seller(t);
        seller seller2=new seller(t);
        System.out.println(seller1.equals(seller1));
    }
}

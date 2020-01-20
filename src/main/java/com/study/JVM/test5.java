package com.study.JVM;

public class test5 {
    static int a = 1;

    static {
        System.out.println(a);
    }

    public void sou() {
        System.out.println(a);
    }


    static class test extends test5 {

     static String string = "jinlaile";
    }

    public void main(String[] args) {
        System.out.println(test.string);
    }

}

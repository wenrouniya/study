package com.study.fanshe;

public class person {
    public String name;
    public  String sex;
    private String age;

    public person(String name){
        this.name=name;
    }

    public   void test1(){
        System.out.println("=========");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

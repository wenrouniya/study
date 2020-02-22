package com.study.comparator.domain;

public class student {
    private String  name;//学生姓名
    private int chinese;//语文成绩
    private int math;//数学成绩

    public student(String name, int c, int m) {
        this.name=name;
        this.chinese=c;
        this.math=m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
}

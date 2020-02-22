package com.study.comparator;

import com.study.comparator.domain.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 对conpare类的学习
 */
public class testCompare {
    public static void main(String[] args) {
      student s1=  new student("张三",90,100);
        student s2 = new student("李四", 80, 90);
        student s3 = new student("王五", 70, 60);
        ArrayList<student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(new student("王美丽",90,90));
      /**  Collections.sort(students, new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return o1.getChinese()-o2.getChinese();//按升序排序 01指向第二个元素  o2指向第一个元素
                // 如果01>o2 返回1  让o2排在前面
                //如果o1<o2 返回-1 让o1排在前面

            }
        });*/
      //多条件排序
        Collections.sort(students, new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                int flag=o1.getChinese()-o2.getChinese();
                if(flag==0){
                    flag=o1.getMath()-o2.getMath();
                }
              return flag;
            }
        });

        for(student s:students){
            System.out.println(s.getName());
        }
    }
}

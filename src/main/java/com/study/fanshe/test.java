package com.study.fanshe;

import java.lang.reflect.Field;

/**
 * class.ForName("name") 将字节码对象加载进内存 返回class的对象
 *
 * 类名.class
 *
 * 对象.getClass（）
 *
 * 同一个字节码文件在内存中只会加载一次
 */
public class test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
       Class cla = Class.forName("com.study.fanshe.person");
        System.out.println(cla);
//
//        Object o=person.class;
//        System.out.println(o);
//
        person person = new person("heihei");
//        Class cla=person.getClass();
//        System.out.println(cla);

        Field[] file= cla.getFields();
        for (Field field:file){
            System.out.println(field);
        }

        ///获取所有成员变成 无论是什么访问修饰符
        Field [] fields = cla.getDeclaredFields();
        for (Field field:fields){
            System.out.println(field);
        }
         Field field1=cla.getDeclaredField("age");
        System.out.println(field1);
        field1.setAccessible(true);//忽略访问修饰符的安全检查 暴力反射
        Object oo=field1.get(person);
        System.out.println(oo);

    }

}

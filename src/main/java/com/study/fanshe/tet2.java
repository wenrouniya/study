package com.study.fanshe;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class tet2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //加载配置文件
        Properties properties = new Properties();
        person person = new person("he");
        InputStream is= person.getClass().getClassLoader().getResourceAsStream("cla.properties");
        properties.load(is);

        String className=properties.getProperty("className");
        String method=properties.getProperty("method");

        //将类加载进内存
        Class cla=Class.forName(className);
        //将类实例化

        Object o =cla.getDeclaredConstructor().newInstance();
        //获取对象的方法
        Method method1= cla.getMethod(method, null);
       method1.invoke(o);
    }
}

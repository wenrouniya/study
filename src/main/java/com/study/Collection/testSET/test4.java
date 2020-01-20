package com.study.Collection.testSET;

import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

public class test4 {
    @Test
    public void  test() throws IOException {
        Properties properties = new Properties();
      // FileInputStream inputStream=new FileInputStream(jdbc.properties);
       // properties.load(inputStream);//加载对应流文件
        String name= (String) properties.get("name");
        String password= (String) properties.get("password");
        System.out.println(name +"....."+password);
    }

}

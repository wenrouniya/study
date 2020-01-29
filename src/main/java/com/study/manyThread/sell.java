package com.study.manyThread;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class sell {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
   properties.load(new FileInputStream("src\\main\\java\\com\\study\\manyThread\\ticket.properties"));
       int count = Integer.parseInt(properties.getProperty("count")) ;
        //System.out.println(count);
        //用此方法打印出当前代码所在位置 如果要获取相对位置 知道当前的根路径
        // System.out.println(new File(".").getAbsolutePath());
        //利用t对象所有线程共享一个对象
      Tickett t=  new Tickett();
      t.setCount(count);
      //第一个参数 创建线程的对象  第二个参数 当前线程的名称
        Thread t1= new Thread(new seller(t),"售票员 A");
        Thread t2= new Thread(new seller(t),"售票员 B");
        Thread t3= new Thread(new seller(t),"售票员 C");
        Thread t4= new Thread(new seller(t),"售票员 D");

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}


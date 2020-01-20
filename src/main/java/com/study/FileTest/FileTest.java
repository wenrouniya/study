package com.study.FileTest;

import org.junit.Test;

import java.io.File;

public class FileTest {

    @Test
    public void test1(){
        File file=new File("a.txt");//相对于module的相对路径
        File file1=new File("C://Users//asus//Desktop//123.txt");
        //File.separator为java为不同操作系统设置的分隔符
        File file2=new File("c:"+File.separator+"Users"+File.separator+"asus"+File.separator+"Desktop"+File.separator+"123.txt");

        System.out.println(file1.exists());
        File file3=new File("hello.txt");
        System.out.println(file3.exists());
    }
}

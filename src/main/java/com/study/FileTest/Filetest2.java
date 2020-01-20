package com.study.FileTest;

import org.junit.Test;

import java.io.*;

/**
 * 输入：从硬盘读取数据到内存
 * 输出：从内存读取数据到硬盘
 */
public class Filetest2 {
    /**
     * 文件创建与删除
     * @throws IOException
     */
    @Test
    public  void  test1() throws IOException {
        File file =new File("hi.txt");
        if(!file.exists()){
             file.createNewFile();
            System.out.println("创建成功");
        }else{
            file.delete();
            System.out.println("文件删除成功");
        }
    }

    /**
     *  目录创建
     *  mkdir 创建当前目录
     *  mkdirs创建所有不存在的目录
     */
    @Test
    public  void test2(){
        File file=new File("H://IO//io1");
        File file1=new File("H://IO/io2");
        if(!file.exists()){
            boolean mkdir = file.mkdir();
            if(mkdir) {
                System.out.println("111文件创建成功");
            }
        }else{
            System.out.println("111文件已经存在");
        }

        if(!file1.exists()){
            file1.mkdirs();
            System.out.println("222文件创建成功");
        }else{
            System.out.println("222文件已经存在");
        }

    }
    @Test
    public void test4() throws IOException {
        File file = new File("hello.txt");
        File file1 = new File("hello2.txt");

        FileReader fr = new FileReader(file);
        FileWriter FW = new FileWriter(file1);

        char[] ch = new char[5];
        int len;
        while ((len = fr.read(ch)) != -1) {
                FW.write(ch,0,len);
            }
            FW.close();
            fr.close();
        }

    }


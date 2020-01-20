package com.study.FileTest.IOtest;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 输入输出流
 * 按照流向：输入输出
 * 按照数据单位：字节流（byte）  字符流（char）
 * 按照流的角色：节点流、处理流
 */
public class IOtest {

    private int data;

    public static void main(String[] args) {
        File file =new File("hello.txt");//相对于当前工程
        System.out.println(file.getAbsolutePath());

    }
    @Test
    public  void  test()  {
        FileReader fr= null;
        try {
            File file = new File("hello.txt");//路径相对于当前modol
//        System.out.println(file.getAbsolutePath());

            //字符流读入内存操作
            fr = new FileReader(file);
            int  data;
            //将字符一个一个读入或者读出
            while((data=fr.read())!=-1){
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流: 对于物理方面建立的连接 JVM垃圾回收无能为力 必须手动关闭连接  如流的传输和
            //数据库连接 socket等
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }

    @Test
    public  void test1() throws IOException {
        File file=new File("hello.txt");
        FileReader fileReader = new FileReader(file);
        char [] chars=new char[5];
        int len;
        while((len=fileReader.read(chars))!=-1){
//            for(int i=0;i<len;i++){
//                System.out.print(chars[i]);
//            }
            //写法二
            String string = new String(chars,0,len);
            System.out.print(string);
        }

    }
    @Test
    public  void test2() throws IOException {
        File file=new File("hello1.txt");
        FileWriter FW=new FileWriter(file);
        FW.write("hihihi\n");
        FW.write("HHAHHAAH");
        FW.write("mkddfsd");
        FW.close();
    }

}

package com.study.FileTest.IOtest;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOInputStream {
    @Test
    public void test1() {
        FileInputStream fileInputStream= null;
        FileOutputStream fileOutputStream= null;
        try {
            fileInputStream = new FileInputStream("123.png");
            fileOutputStream = new FileOutputStream("789.png");
            byte [] by=new byte[5];
            int len;
            while((len=fileInputStream.read(by))!=-1){
                fileOutputStream.write(by,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileInputStream!=null){
                fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fileOutputStream!=null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}

package com.study.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class test2 {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("123.txt") ;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

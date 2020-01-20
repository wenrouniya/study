package com.study.chat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class sockerClient {
    public static void main(String[] args) throws IOException {
        Socket localhost = new Socket("localhost", 8088);
         OutputStream outputStream = localhost.getOutputStream();
        outputStream.write("hello".getBytes());
        InputStream inputStream = localhost.getInputStream();
        byte [] bytes=new byte[1024];
        int len = inputStream.read(bytes);

        System.out.println(new String(bytes,0,len));
        localhost.close();
    }
}

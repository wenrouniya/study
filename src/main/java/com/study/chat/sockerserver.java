package com.study.chat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class sockerserver {
    public static void main(String[] args) throws IOException {
        //创建服务器
        ServerSocket server = new ServerSocket(8088);
        Socket accept = server.accept();
        InputStream inputStream = accept.getInputStream();
        byte [] bytes=new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("收到".getBytes());
        accept.close();
        server.close();
    }
}

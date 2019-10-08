package com.study.socket.comeAndBack;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 可以接收返回消息的socket客户端
 */
public class ClientSocket {
    public static void main(String[] args) throws IOException {
        String ip="127.0.0.1";
        int port=22535;
        Socket socket=new Socket(ip,port);
        String mess="这是client端发送给server端的消息";
        OutputStream outputStream= socket.getOutputStream();
        outputStream .write(mess.getBytes("utf-8"));
        socket.shutdownOutput();

        StringBuilder sb=new StringBuilder();
        int len;
        byte[] bytes=new byte[1024];
        InputStream inputStream=socket.getInputStream();
        while((len=inputStream.read(bytes))!=-1){
            sb.append(new String(bytes,0,len,"utf-8"));
        }
        System.out.println(sb);
        inputStream.close();
        outputStream.close();
        socket.close();
    }
}


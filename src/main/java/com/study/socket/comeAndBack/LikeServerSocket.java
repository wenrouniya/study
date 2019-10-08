package com.study.socket.comeAndBack;

import com.study.socket.SocketServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 可以回送消息的socket服务端
 *
 */
public class LikeServerSocket {
    public static void main(String[] args) throws IOException {
        int port=22535;
        ServerSocket serverSocket=new ServerSocket(port);

        //等待连接 并获取客户端socket
        System.out.println("等待客户端消息");
        Socket socket=serverSocket.accept();

        //获取输入流
        InputStream inputStream=socket.getInputStream();
        int len;
        byte [] bytes=new byte[1024];
        StringBuilder sb=new StringBuilder();
        //在   inputStream.read(bytes)读取时赋值
        while((len=inputStream.read(bytes))!=-1){
            //设置相同类型的编码格式
            sb.append(new String(bytes,0,len,"utf-8"));
        }
        System.out.println("server端收到的message is"+sb);

        //开始向client端发送消息
        OutputStream outputStream=socket.getOutputStream();
        String mess="这事server端发送给client端的消息";
        outputStream.write(mess.getBytes("utf-8"));

        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();



    }
}

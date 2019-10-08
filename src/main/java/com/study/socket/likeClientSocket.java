package com.study.socket;


import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 类似于客户端 发送消息 需要已知要连接的IP和端口号
 */
public class likeClientSocket {
    public static void main(String[] args) throws IOException {
        String host="127.0.0.1";
        int port =45235;
        //与服务器端建立连接
        Socket socket=new Socket(host,port);
        //  字节输出流： OutputStream
        //字节输入流 InputStream
        OutputStream outputStream= socket.getOutputStream();
        //准备要传输的信息
        String mess="message1";
        outputStream.write(mess.getBytes("utf-8"));
        outputStream.close();
        socket.close();

    }
}

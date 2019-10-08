package com.study.socket;

import javax.sound.sampled.Port;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Socket的通讯过程：
 * 1.服务器端：
 * （1）申请一个Socket
 * （2）绑定到一个IP地址和一个端口上
 * （3）开启侦听
 * 2.客户端：
 * （1）申请一个Socket
 * （2）连接服务器（指明IP地址和端口号）
 * 3.服务器接到连接请求后，产生一个新的Socket（端口大于1024）与客户端建立连接并进行通讯，原侦听Socket继续侦听。
 */

/**
 * socket的服务端
 */
public class SocketServer {
    public static void main(String[] args) throws IOException {
        //设置监听的端口号
        int port=45235;
        ServerSocket server=new ServerSocket(port);

        System.out.println("等待socket客户端的到来");
        //accept方法用于产生“阻塞”，一直到收到一个连接，并返回一个客户端连接的socket对象实例。
       Socket socket= server.accept();
//        System.out.println("socket对象是"+socket);
        //得到socket对象的字节输入流
        InputStream inputStream=socket.getInputStream();
        byte [] bytes=new byte[256];

        StringBuilder builder=new StringBuilder();
        int len=0;
        //遍历将字符串写入byte数组
        /**
         * 错误写法 当inputStream.read(bytes))为8时进入循环
         * 会再次向后读取inputStream.read(bytes))此时变为-1
         * 所以要在inputStream.read(bytes))读取时赋值
         */
//        while(( inputStream.read(bytes))!=-1){
//          len= inputStream.read(bytes);
//            System.out.println("第一次循环" +len);
//        }

        while((len=inputStream.read(bytes))!=-1){
        System.out.println("第二次循环" +len);
        //给StringBuilder尾部逐个追加字符 使用同一编码格式
            /**
             * public String(byte[] bytes,int offset,int length,Charset charset)构造一个新的String通过使用指定的指定字节子阵列解码charset 。 新的String的长度是字符集的函数，因此可能不等于子数组的长度。
             * 此方法总是用此字符集的默认替换字符串替换格式错误的输入和不可映射字符序列。
             * 当需要更多的解码过程控制时，应使用CharsetDecoder类。
             * 参数
             * bytes - 要解码为字符的字节
             * offset - 要解码的第一个字节的索引
             * length - 要解码的字节数
             * charset -该charset要使用的解码bytes
             * 异常
             * IndexOutOfBoundsException - 如果 offset和 length参数在 bytes数组的范围之外的索引字符
             */
        builder.append(new String(bytes,0,len,"utf-8"));
        }
        System.out.println("get message is"+builder);
            //关闭资源
            inputStream.close();
           socket.close();
           server.close();

    }
}

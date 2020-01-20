package com.fuzaijunheng.action;

import com.fuzaijunheng.domain.server;
import org.junit.Test;

import java.util.Random;

/**
 * 模拟实现轮转算法
 *
 *  Math.random()
 * 返回的数值是[0.0,1.0）的double型数值
 */
public class lunzhuan {
    @Test
    public  void test1(){
        Random r=new Random();
        server server = new server();
        for(int i=0;i<5;i++){
            //获取随机数的范围 0-4
            int index =r.nextInt(5);
            if(index==0){
                server.setServer1("调用第一个服务");
                System.out.println(server.server1);
            }
            else if(index==1){
                server.setServer2("调用第二个服务");
                System.out.println(server.server2);
            }
           else  if(index==2){
                server.setServer3("调用第三个服务");
                System.out.println(server.server3);
            }
           else  if(index==3){
                server.setServer4("调用第四个服务");
                System.out.println(server.server4);
            }
            else  {
                server.setServer5("调用第五个服务");
                System.out.println(server.server5);
            }
            System.out.println(index+1);
        }
    }
}

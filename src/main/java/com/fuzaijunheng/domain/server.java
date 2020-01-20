package com.fuzaijunheng.domain;

/**
 * 模拟服务器
 */
public class server {
    public  String  server1;
    public  String  server2;
    public  String  server3;
    public  String  server4;
    public  String  server5;

    public String getServer1() {
        return server1;
    }

    public void setServer1(String server1) {
        this.server1 = server1;
    }

    public String getServer2() {
        return server2;
    }

    public void setServer2(String server2) {
        this.server2 = server2;
    }

    public String getServer3() {
        return server3;
    }

    public void setServer3(String server3) {
        this.server3 = server3;
    }

    public String getServer4() {
        return server4;
    }

    public void setServer4(String server4) {
        this.server4 = server4;
    }

    public String getServer5() {
        return server5;
    }

    public void setServer5(String server5) {
        this.server5 = server5;
    }

    @Override
    public String toString() {
        return "server{" +
                "server1='" + server1 + '\'' +
                ", server2='" + server2 + '\'' +
                ", server3='" + server3 + '\'' +
                ", server4='" + server4 + '\'' +
                ", server5='" + server5 + '\'' +
                '}';
    }
}

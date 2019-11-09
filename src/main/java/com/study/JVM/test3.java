package com.study.JVM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;

/**
 * 关于字节码的异常处理
 */
public class test3 {
    //arg_size=1 即传入参数个数 java中每一个非静态方法 即实例方法   虽然没有显示传入参数 但是编译器会在编译时隐式的传入this
    //每一个java中的实例方法 其在编译后所生成的方法参数的数量会比实际的多一个 即this
    // 在参数列表的第一个 这样在实例方法中就可以用this访问当前对象的属性以及其他方法
    //这个操作时在编译期间完成的 即由javac编译器在编译的时候将对this的访问转化位对一个普通实例方法参数的访问，
    //接下来在运行期间 由jvm在调用实例方法时，自动向实例方法传入该this参数。
    // 所以在实例方法的局部变量表中，至少会有一个指向当前对象的局部变量
    public void test() {
        try {
            InputStream is = new FileInputStream("test.txt");
            ServerSocket socket = new ServerSocket(9999);
            //进行阻塞监听
            socket.accept();
        }//e作为第四个局部变量
        catch (FileNotFoundException e) {

        } catch (IOException e) {

        } catch (Exception e) {

        } finally {
            System.out.println("finally");
        }
    }
}

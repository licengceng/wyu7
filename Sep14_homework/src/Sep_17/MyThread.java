package Sep_17;

import java.util.concurrent.*;
public class MyThread extends Thread {
    public void run() {
        for (int i = 0;i < 5;i++) {
            System.out.println("一边听歌");
        }
    }
    public static void main(String[] args) {
        MyThread myThread = new MyThread();//创建实例
        myThread.start();//启动线程
        for (int i = 0;i < 5;i++) {
            System.out.println("一边敲代码");
        }
    }
}
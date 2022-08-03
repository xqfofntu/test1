package com.xqf.test;

/**
 * @author xuqifeng
 * @create 2022/8/1 13:36
 **/
public class HelloRunnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread1());
        /*
        Thread thread = new Thread(new MyThread1());
        就相当于 ,就是创建实现类的对象，再把这个对象用Thread()构造器的方法创建
        MyThread1 myThread1 = new MyThread1();
        Thread thread = new Thread(myThread1);
         */
        Thread thread1 = new Thread(new MyThread2());
        thread.start();
        thread1.start();

    }
}

class MyThread1 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++) {
            if (i % 2 == 1) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}

class MyThread2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);

            }
        }
    }
}

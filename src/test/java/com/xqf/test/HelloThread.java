package com.xqf.test;

/**
 * @author xuqifeng
 * @create 2022/8/1 13:30
 **/
public class HelloThread {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 1) {
                        //打印线程名，线程名是从0开始的
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        };

        thread1.start();
        thread.start();

    }
}

class Thread1 extends Thread{
    @Override
    public void run() {
        super.run();
        for(int i=0;i<100;i++){
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

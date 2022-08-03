package com.xqf.test;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author xuqifeng
 * @create 2022/8/1 13:45
 **/
public class HelloCallable {
    public static void main(String[] args) throws Exception {

        MyThread3 myThread3 = new MyThread3();
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread3());
        new Thread(futureTask).start();//开启线程
        System.out.println(futureTask.get());//获取返回值

    }
}

class  MyThread3 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int count = 0;
        for (int i = 1;i<100;i++){
            if (i%3==0){
                count++;
            }
        }
        return count;
    }
}


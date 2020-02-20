package com.jessy.testng.multiThread;

import org.testng.annotations.Test;

/**
 * Created by jiangsuyao on 2020/2/20.
 */
public class MultiThreadOnAnnotion {

    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
    }

}

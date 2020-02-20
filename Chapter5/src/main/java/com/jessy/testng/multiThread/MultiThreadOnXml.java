package com.jessy.testng.multiThread;

import org.testng.annotations.Test;

/**
 * Created by jiangsuyao on 2020/2/20.
 */
public class MultiThreadOnXml {

    @Test
    public void test1(){
        System.out.printf("test1:  Thread Id: %s%n",Thread.currentThread().getId());
    }


    @Test
    public void test2(){
        System.out.printf("test2  Thread Id: %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.printf("test3  Thread Id: %s%n",Thread.currentThread().getId());
    }

}

package com.jessy.testng;

import org.testng.annotations.Test;

/**
 * Created by jiangsuyao on 2020/2/20.
 */
public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1 run");

        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }

}

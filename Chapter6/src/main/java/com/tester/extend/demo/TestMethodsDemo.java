package com.tester.extend.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by jiangsuyao on 2020/2/21.
 */
public class TestMethodsDemo {

    @Test
    public void test1(){
        Reporter.log("比较1和2是否相等");
        Assert.assertEquals(1,2);
    }


    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void test3(){
        Assert.assertEquals("aaa","aaa");
    }

    @Test
    public void logDemo(){
        Reporter.log("这是我们自己写的日志");
        throw new RuntimeException("这是我自己运行时异常");
    }


}

package com.jessy.testng.suite;

import org.testng.annotations.*;

/**
 * Created by jiangsuyao on 2020/2/20.
 */
public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite 运行啦");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite 运行啦");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("===========登陆成功=============");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("===========退出成功=============");
    }


}

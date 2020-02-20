package com.jessy.testng;

import org.testng.annotations.Test;

/**
 * Created by jiangsuyao on 2020/2/20.
 */
public class TimeOutTest {

    @Test(timeOut = 3000)//单位为毫秒:3s
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)//单位为毫秒:3s
    public void testFail() throws InterruptedException {
        Thread.sleep(3000);
    }
}

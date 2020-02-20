package com.jessy.testng.suite;

import org.testng.annotations.*;

/**
 * Created by jiangsuyao on 2020/2/20.
 */

@Test(groups = "operate")
public class PayTest {


    @Test
    public void paySuccess(){
        System.out.println("支付宝支付成功");
    }

    @Test
    public void payFail(){
        System.out.println("支付宝支付失败");
    }
}

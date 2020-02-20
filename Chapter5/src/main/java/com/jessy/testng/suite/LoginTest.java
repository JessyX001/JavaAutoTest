package com.jessy.testng.suite;

import org.testng.annotations.Test;

/**
 * Created by jiangsuyao on 2020/2/20.
 */

@Test(groups = "basic")
public class LoginTest {

    @Test
    public void loginTaoBaoSuccess(){

        System.out.println("淘宝登陆成功！");
    }

    @Test
    public void loginTaoBaoFail(){
        System.out.println("淘宝登陆失败！");
    }
}

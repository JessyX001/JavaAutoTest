package com.jessy.testng.suite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by jiangsuyao on 2020/2/20.
 */

@Test(groups = "operate")
public class AddToCar {


    @Test
    public void addToCarSuccess(){
        System.out.println("添加购物车成功！");
    }

    @Test
    public void addToCarFail(){
        System.out.println("添加购物车失败！");
    }
}

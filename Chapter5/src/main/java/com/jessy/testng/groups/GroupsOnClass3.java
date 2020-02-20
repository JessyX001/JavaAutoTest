package com.jessy.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by jiangsuyao on 2020/2/20.
 */

@Test(groups="teacher")
public class GroupsOnClass3 {

    public void teacher1(){
        System.out.println("GroupsOnClass3中的teacher1运行");
    }

    public void teacher2(){
        System.out.println("GroupsOnClass3中的teacher2运行");
    }
}

package com.zeroten.common.util;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class CheckUtilsTest {
    @Test
    public  void TestAnyEmpty()
    {
        Assert.assertEquals(CheckUtils.isAnyEmpty("sss","张三"),true);
        Assert.assertEquals(CheckUtils.isAnyEmpty("","张三"),false);
        Assert.assertEquals(CheckUtils.isAnyEmpty("sss","张三"),false);
    }
    @Test
    public  void TestEmpty()
    {
        Object[] obj={};
        Object[] obj1={123,"456",789};
        Assert.assertEquals(CheckUtils.isEmpty(obj),true);
        Assert.assertEquals(CheckUtils.isEmpty(obj1),false);
    }
    @Test
    public  void TestEquals()
    {
        Assert.assertEquals(CheckUtils.equals("hei","hei"),true);
        Assert.assertEquals(CheckUtils.equals("hei","word"),true);
    }
    @Test
    public  void TestEquals1()
    {
        /*
       判断 n1 和 n2 的值是否相等，相等则返回 true，否则返回 false。当其中⼀个是 null 时返回 false。

        */
        int  i=3;
        Integer i2=3;
        Assert.assertEquals(CheckUtils.git(i,i2),true);
        Assert.assertEquals(CheckUtils.git(i,new Integer(3)),true);
    }
}

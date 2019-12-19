package com.zeroten.common.util;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ladebase {
    @Test
    public  void  Test(){
        String[] a={"a","b","c", "d","e","f","g","h","l"};
        Arrays.asList(a).forEach(index->
            System.out.println("lambda表达式的值"+index));//lambda 例子
    }
}

package com.zeroten.common.util.Oute;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ladebase {
    @Test
    public  void  Test(){
        String[] a={"a","b","c", "d","e","f","g","h","l"};
        Arrays.asList(a).forEach(index->
            System.out.println("lambda表达式的值"+index));//lambda 例子
    }

    @Test
    public  void Arrays(){
        int[] interge=new int[10];
        System.out.println(interge);
        Arrays.fill(interge,5);
        System.out.println(Arrays.toString(interge));//lambda 例子
        Arrays.fill(interge,3,8,6);
        System.out.println(Arrays.toString(interge));
    }


}

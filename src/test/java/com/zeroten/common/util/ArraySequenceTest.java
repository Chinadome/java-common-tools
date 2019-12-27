package com.zeroten.common.util;

import org.testng.annotations.Test;

public class ArraySequenceTest {
    @Test
    public  void testPrint(){
        ArraySequence arr=new ArraySequence(5);
        arr.add(1);
        arr.add(8);
        arr.add(7);
        arr.add(6);
        arr.print();

        ArraySequence.SelectorImpl imple=arr.new SelectorImpl();
        int index=1;
        while(!imple.end()){

            System.out.println("第"+index+"位："+imple.current());
            imple.next();
            index++;
        }
    }
}

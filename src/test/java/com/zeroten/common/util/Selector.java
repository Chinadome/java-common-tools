package com.zeroten.common.util;

public interface Selector {
        boolean end();
        Object current();
        void next();
}
class Outer {
    static  int index=1;
    interface Inter {
        void show();
    }
     public  static Inter create(){
        return new Inter(){
            public  void show(){
                System.out.println("helloworld");
            }
        };
     }
    // TODO: 补全代码
    public static void main(String[] args) {

          Outer.create().show();
    }
}
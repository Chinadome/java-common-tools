package com.zeroten.common.util.Oute;

public class OuteClass {
    private int index;
    private String name;
    public  OuteClass(int index,String name){
        this.index=index;
        this.name=name;
    }
    public class  InnerClass{
        private String name;
        public  InnerClass(String name){
           this.name=name;
        }

        public void InfoMain(){
            StringBuilder tep=new StringBuilder();
            tep.append("我是外部类index：");
            tep.append(OuteClass.this.index);
            tep.append("我是外部类name：");
            tep.append(OuteClass.this.name);
            tep.append("我是内部类name：");
            tep.append(this.name);
            System.out.println(tep.toString());
        }
    }
    public static void main(String[] args){
        OuteClass oute=new OuteClass(1,"外部类");
        OuteClass.InnerClass inner=oute.new InnerClass("内部类");
        inner.InfoMain();
    }
}


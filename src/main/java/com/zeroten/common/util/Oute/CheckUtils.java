package com.zeroten.common.util.Oute;

public  class CheckUtils {
    public static boolean isAnyEmpty(String... strings){
        /*
        * String... strings 为可变参数，你可以认为它是 String[] strings。如果 strings 中有任
        意⼀个字符串为空，则返回 false，否则返回 true。
        * */
        for (int i=0;i<strings.length;i++)
        {
             if (strings[i].indexOf(' ')!=-1)
             {
                 return false;
             }
        }
        return true;
    }

    public static boolean isEmpty(Object[] arr){
        /*
        *判断引⽤类型数组是否为空，为空或 null 则返回 true，否则返回 false。
        *  */
        if (arr==null||arr.length==0)
        {
            return true;
        }else
        {
            return false;
        }

    }
    public static boolean equals(String str1, String str2)
    {
        /*判断 str1 字符串是否相等，相等则返回 true，否则返回 false。当其中⼀个是 null 时返回
        false。*/
        if(str1==null||str2==null)
        {
             return false;
        }else
        {
            return str1.equals(str2);
        }

    }
    public static boolean git(Integer n1, Integer n2){

        if(n1==null||n2==null)
        {
            return false;
        }else
        {
            return n1.equals(n2);
        }
    }

}

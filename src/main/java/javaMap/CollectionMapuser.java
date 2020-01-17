package javaMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionMapuser {
    public static void main(String [] args){
         //集合分为2大类：
        //1.单个的序号，全部实现了Collection 接口
        //1.1List,有序的，按照插入顺序排序 可以有重复的元素.也可以包含null
        //1.2 Set （集）,不可以有重复元素 ，可以包含null
        //1.3 Queue (队列) 按照一定规则进行添加/删除
        List<String> list =new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println("当前list集合中有"+list.size()+"个元素");
        System.out.println("用for遍历当前集合");
        for(int i=0;i<list.size();i++)
        {
            String str=list.get(i);
            if(i>0){
                System.out.print("，");
            }
            System.out.println(str);
        }
        list.remove("D");
        System.out.println("用Iterator遍历当前集合");
        Iterator<String> iterator=list.iterator();
        //迭代器的位置是在元素之间
        //存在N个元素的列表，迭代器的位置可能存在n+1个
        //获取迭代器后，迭代器的位置在第一个元素之前
        //未调用next()方法时,调用remove抛IllegalStateExecption
        //调用remove 方法删除的是调用next()方法时返回的元素（越过的元素）

        while (iterator.hasNext()){
            //next 方法有俩个作用
            //1 将迭代器的位置移动至下一个位置
            //2 同时返回越过的元素
            String str=iterator.next();
            //当迭代器到达最后一个元素之后时，
            //在调用next()方法，则会抛出NoshuchElementExeption 异常
            System.out.println(str);
        }
        //2.键值对，全部实现类map接口

    }
}

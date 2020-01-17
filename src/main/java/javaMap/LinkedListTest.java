package javaMap;

import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListTest {
    public  static  void  main(String[] arge)
    {
        //链表,创建时不需要指定容量大小，因为他没有大小限制
        //for 循环时，每次都是从开头往查找
        //如果：当查找的数，大于总长度的一半位置的时候，则是从后往前找。
        LinkedList<String> list=new LinkedList<String>();
        list.push("A");
        list.push("a");
        list.add("B");
        list.add("b");
        list.add("");
        Iterator<String> iterator=list.iterator();
        System.out.println("该元素有几个"+list.size()+",他们分别是");
        while(iterator.hasNext()){
          String str=iterator.next();
          System.out.println(str);
        }
    }
}

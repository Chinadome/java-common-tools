package javaMap;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {

    private static  void StudtArrayList(){
        //创建ArrayList 时，如果未指定容量大小，则会创建一个空数组
        //第一次调用add方法时，将容量扩充为默认容量大小 DEFAULT_CAPACITY。
    ArrayList<Integer> interger=new ArrayList<Integer>();
    interger.add(1);
    interger.add(2);
    interger.add(3);
    interger.add(4);

         //如果在创建ArrayList时，能预估数据规模
        //我们就可以指定一个初始容量大小，以减少扩容
    ArrayList<Integer> interger2=new ArrayList<Integer>(50);//设置容器大小
        ArrayList<Integer> interger3=new ArrayList<Integer>(interger);//直接把interger里的元素复制给 interger3
        interger3.add(5);//在末尾插入
        System.out.println(interger3);
        interger3.add(1,6);//在第二位插入6
        System.out.println(interger3);
        //数组是有容量大小限制的，当add操作时，如果数组已满，则会引发扩容
        //1.计算新的容量大小：为原来的容量大小的1.5倍；
        //2.按新的容量创建一个新的数组
        //3.将旧数组里的元素全部复制到新创建的数组中
        //4.丢弃旧的数组
    }
    public static void main(String [] arge)
    {
       // StudtArrayList();

        List<String> list=new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        ListIterator<String> listIterator=list.listIterator();
        System.out.println(listIterator.hasPrevious());//迭代器是否有前一个元素
        System.out.println(listIterator.hasNext());//迭代器是否有后面一个元素
        System.out.println(listIterator.previousIndex());//迭代器前一个元素的位置
        System.out.println(listIterator.nextIndex());//迭代器后一个元素的位置
        System.out.println("Next()="+listIterator.next());
        listIterator.set("A-update");//改变上次调用list返回的值
        System.out.println(list);//[A-update, B, C]
        listIterator.add("A1");
        System.out.println(list);//[A-update, A1, B, C]
       // System.out.println(listIterator.previous());//A1
        System.out.println(listIterator.next());//B
        System.out.println(list);
        System.out.println(listIterator.previous());//
        System.out.println(list);
        listIterator.remove();
        //迭代器操作元素的时候
        //set和remove 方法和迭代器 的状态有关，跟新或删除的是上一次调用 next和 previous 方法的元素
        //add 只和迭代器的位置有关，在迭代器之前位置添加元素。
        //注意：在迭代器进行操作List（add/remove等操作）的时候，则迭代器会发生异常
        System.out.println(list);
    }

    private  static void ListIterator(List<String> list)
    {

    }
}

package javaMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String [] arge)
    {
        /*
        * 散列表相关知识
        * hashmap
        *   内部实现
        *   常用方法
        *
        * TreeMap
        *   散列表 HashTable；也是哈希表
        *    根据数组可以使用下标的方式来快速随机访问来实现的
        *
        *
        *
        * */
        HashMap();
    }


    public  static void  HashMap()
    {
        HashMap<String, Student> map=new HashMap<String,Student>();
        //新增
        map.put("1", new Student("张三",18));
        map.put("2", new Student("张三",18));
        map.put("3", new Student("张三",18));
        map.put("8", new Student("张三",18));
        map.put("5", new Student("张三",18));
        map.put("6", new Student("张三",18));

        //遍历
        Set<String> set=map.keySet();//获取所有的key  (键值集)
        Collection<Student> collection=map.values();//获取所有的value （值集合）
        Set<Map.Entry<String,Student>> set1=map.entrySet();//获取键值对列表 （键值对集）
        for(Map.Entry<String,Student>entry:set1)
        {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        System.out.println("**********************************************");
        for (String key:set)
        {
            System.out.println(map.get(key));
        }
        //删除
        map.remove("1");
        System.out.println("*************删除后**********");
        for (String key:set)
        {
            System.out.println(map.get(key));
        }
        System.out.println("*************在map集合的基础上创建**********");
        Map<String,Student> map1=new HashMap<>(map);//在map集合的基础上创建
        Map<String,Student> map2=new HashMap<>(10);//创建一个容量大小为10的

        map2.containsKey("1");//是否存在1的key
        map2.containsValue("2");//是否存在2的Value
        System.out.println(map1);
        //put（key,value）
        //1.如果key不存在，则直接将key->value 存储，并返回null
        //2.如果key存在，将Key值对应的值替换为新值，并返回旧值。
        //get（key）
        //1.key存在，则返回key值对应的值
        //2.key不存在，则返回null
        //内部结构

    }
   static class  Student{
        String name;
        int age;
        public  Student(String name,int age){
            this.name=name;
            this.age=age;
        }
        @Override
       public  String toString(){
            StringBuilder str=new StringBuilder();
            str.append(getClass().getSimpleName());
            str.append("{");
            str.append("name:");
            str.append(name);
            str.append(",age:");
            str.append(",age:");
            str.append(age);
            str.append("}");
            return  str.toString();
        }
   }

}

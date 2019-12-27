package com.zeroten.common.util.proxy;

import java.lang.reflect.Proxy;

public class UserService {
    public static void main(String[] args){
        //1直接调用
       // dirUser();
        //2静态代理模式
        System.out.println("*************静态代理****************");
        //staticProxyCall();
        //3动态代理
        System.out.println("*************动态代理****************");
       // jdkProxyCall();
        //4动态代理--被代理对象
        //System.out.println("*************cglib 代理，通过子类的方式类实现的，因此也可以子类代理****************");
        //jdkProxyCall2();//会报错
        //cglib 代理，通过子类的方式类实现的，因此也可以子类代理
        System.out.println("*************cglib 代理，通过子类的方式类实现的，因此也可以子类代理****************");
        cglibProxyCall();
    }
   public  static void staticProxyCall(){
       User  user1=new User("ss",18);
       UserDao userDao=new UserDaoImpl();
       UserDaoProxy proxy=new UserDaoProxy(userDao);
       proxy.save(user1);
   }
    public  static  void dirUser(){
        User  user1=new User("张三",18);
        new UserDaoImpl().save(user1);

        User  user2=new User("李四",21);
        new UserDaoImpl().save(user2);

        User  user3=new User("",-10);
        new UserDaoImpl().save(user3);

        User  user4=new User("李四",-10);
        new UserDaoImpl().save(user4);
    }

    public  static void jdkProxyCall(){
        User  user1=new User("ss",18);
        UserDao userDao=new UserDaoImpl();
        UserInvocationHandler handler=new UserInvocationHandler(userDao);
       UserDao userDaoProxy=(UserDao) Proxy.newProxyInstance(
                userDao.getClass().getClassLoader(),//类加载器
                userDao.getClass().getInterfaces(),//被代理的对象所实现的接口
                handler
        );
        userDaoProxy.save(user1);
    }

    public static void  jdkProxyCall2(){
        User  user1=new User("ss",18);
        User2Dao user2Dao=new User2Dao();
        UserInvocationHandler handler=new UserInvocationHandler(user2Dao);
        User2Dao user2DaoProxu=(User2Dao)Proxy.newProxyInstance(
                user2Dao.getClass().getClassLoader(),
                user2Dao.getClass().getInterfaces(),
                handler
        );
        user2DaoProxu.save(user1);
    }

    public  static void cglibProxyCall(){
        User  user1=new User("张三",18);
        User2Dao user2Dao=new User2Dao();
        User2DaoCglibProxy cglibProxy=new User2DaoCglibProxy(user2Dao);
        User2Dao user2DaoProxy=(User2Dao)cglibProxy.getProxyInstance();
        user2DaoProxy.save(user1);
       //Cglib 出来代理类
        UserDao userDao=new UserDaoImpl();
        User2DaoCglibProxy cglibProxy2=new User2DaoCglibProxy(user2Dao);
        User2Dao user2DaoProxy2=(User2Dao)cglibProxy2.getProxyInstance();
        user2DaoProxy2.save(user1);
    }
}

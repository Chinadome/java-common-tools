package com.zeroten.common.util.proxy;

public class UserDaoImpl implements UserDao{
    @Override
    public boolean save(User user){
        System.out.println("用户的姓名为："+user.getName()+";用户的年龄为："+user.getAge());
        return  true;

    }
}

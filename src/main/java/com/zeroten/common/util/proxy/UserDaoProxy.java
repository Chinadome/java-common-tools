package com.zeroten.common.util.proxy;

public class UserDaoProxy implements UserDao {
    public  UserDao target;
    public  UserDaoProxy(UserDao userdao){
      this.target =userdao;
    }
    @Override
    public boolean save(User user) {
        if (user.getName()==null||user.getName().trim().length()==0){
            System.out.println("姓名为空！");
            return  false;
        }
        if (user.getAge()==null||user.getAge()<0){
            System.out.println("年龄格式不正确！");
            return  false;
        }
        return this.target.save(user);
    }
}

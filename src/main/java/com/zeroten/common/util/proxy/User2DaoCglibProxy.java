package com.zeroten.common.util.proxy;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class User2DaoCglibProxy implements MethodInterceptor {
    private Object object;
     public User2DaoCglibProxy(Object object){
         this.object=object;
     }
     public Object getProxyInstance(){
         Enhancer en=new Enhancer();
         en.setSuperclass(object.getClass());
         en.setCallback(this);
        return en.create();
     }

    private User2DaoCglibProxy getUser2DaoCglibProxy() {
        return this;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
      Object result=method.invoke(object,objects);
      return  result;
    }
}

package com.zeroten.common.util.proxy;

public class User {
  private String name;
  private Integer age;
  public User(String name,Integer age){
      this.name=name;
      this.age=age;
  }
  public  String getName(){
      return  this.name;
  }
  public  void setName(String name){
      this.name=name;
  }
    public  Integer getAge(){
        return  this.age;
    }
    public  void setAge(Integer age){
        this.age=age;
    }
}

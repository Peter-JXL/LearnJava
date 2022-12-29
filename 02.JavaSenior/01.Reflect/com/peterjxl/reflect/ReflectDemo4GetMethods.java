/**
 获取成员方法们：
  1.Method[] getMethods() 获取所有public修饰的成员方法
  2.Method getMethod(String name, 类<?>... parameterTypes) 获取指定的、public修饰的成员方法
  3.Method[] getDeclaredMethods() 获取所有成员方法
  4.Method getDeclaredMethod(String name, 类<?>... parameterTypes) 获取指定的的成员方法，不考虑修饰符
*/


package com.peterjxl.reflect;
import java.lang.reflect.Method;

public class ReflectDemo4GetMethods {
  public static void main(String[] args) throws Exception{
    //0.获取Person的Class对象
    Class personClass = Person.class;

    // 1. getMethods() 获取所有public修饰的成员方法
    Method[] methods = personClass.getMethods();
    for (Method method : methods) {
      System.out.println("method.getName(): " + method.getName());
      System.out.println(method);
    }

    //  2.getMethod(String name, ... parameterTypes) 获取指定的、public修饰的成员方法
    Person person = new Person();
    Method eat_method = personClass.getMethod("eat", String.class);
    // 执行该方法
    eat_method.invoke(person, "fries");
  }
}

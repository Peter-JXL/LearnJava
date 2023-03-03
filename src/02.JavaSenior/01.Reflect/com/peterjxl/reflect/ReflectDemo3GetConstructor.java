/**
 获取构造方法们
  1. Constructor<?>[] getConstructors() 获取所有public修饰的构造方法
  2. Constructor<T> getConstructor(类<?>... parameterTypes) 获取指定的、public修饰的构造方法
  3. Constructor<T> getDeclaredConstructor(类<?>... parameterTypes) 获取所有的的构造方法，不考虑修饰符
  4. Constructor<?>[] getDeclaredConstructors() 获取指定的构造方法，不考虑修饰符

  3和4比较少见，这里不演示
*/

package com.peterjxl.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectDemo3GetConstructor {
  public static void main(String[] args) throws Exception {
    // 0.获取Person的Class对象
    Class personClass = Person.class;

    // 1. Constructor<?>[] getConstructors() 获取所有public修饰的构造方法
    Constructor[] constructors = personClass.getConstructors();
    for (Constructor constructor : constructors) {
      System.out.println(constructor);
    }

    // 2. 获取指定的、public修饰的构造方法
    Constructor constructor = personClass.getConstructor(String.class);
    Constructor constructor2 = personClass.getConstructor();  //获取空参构造函数
    System.out.println("constructor: " + constructor);

    // 创建对象newInstance
    Object person = constructor.newInstance("爱莉希雅");
    System.out.println(person);

    // 调用Class对象的newInstance方法，简化对象的创建
    Object person2 = personClass.newInstance();
    System.out.println(person2);
  }
}

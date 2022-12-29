/*
  演示Class获取成员变量
  1.Field[] getFields()：获取所有public修饰的成员变量
  2.Field getField(String name)：  获取指定名称的 public修饰的成员变量
  3.Field[] getDeclaredFields() ： 获取所有的成员变量，不考虑修饰符
  4.Field getDeclaredField(String name)：获取指定名称的成员变量，不考虑修饰符
 */
package com.peterjxl.reflect;

import java.lang.reflect.Field;

public class ReflectDemo2GetMember{
  public static void main(String[] args) throws Exception {
    //0.获取Person的Class对象
    Class personClass = Person.class;

    //1.getFields()：获取所有public修饰的成员变量
    Field[] fields = personClass.getFields();
    for (Field field : fields) {
      System.out.println(field);  //public java.lang.String com.peterjxl.reflect.Person.pubName
    }





    //2.getField(String name)：  获取指定名称的 public修饰的成员变量
    Field pubNameField = personClass.getField("pubName");
    System.out.println("pubNameField: " + pubNameField);  //pubNameField: public java.lang.String com.peterjxl.reflect.Person.pubName
    Person zhangsan = new Person("zhangsan");

    //获取成员变量 pubName 的值
    Object value = pubNameField.get(zhangsan);
    System.out.println("zhangsan value = " + value);  //zhangsan value = zhangsan
    // 设置成员变量 pubName 的值
    pubNameField.set(zhangsan, "lisi");
    System.out.println("After set zhangsan value: " + zhangsan);  //After set zhangsan value: pubName: lisi





    //3.getDeclaredFields() ： 获取所有的成员变量，不考虑修饰符
    Field[] declarFields = personClass.getDeclaredFields();
    for (Field declarField : declarFields) {
      System.out.println(declarField);
    }
    /*
      public java.lang.String com.peterjxl.reflect.Person.pubName
      protected java.lang.String com.peterjxl.reflect.Person.proName
      java.lang.String com.peterjxl.reflect.Person.defName
      private java.lang.String com.peterjxl.reflect.Person.priName
     */



    //4.getDeclaredField(String name)：获取指定名称的成员变量，不考虑修饰符
    Person wangwu = new Person();
    wangwu.setPriName("wangwu");
    Field priNameField = personClass.getDeclaredField("priName");
    System.out.println("priNameField: " + priNameField);  // priNameField: private java.lang.String com.peterjxl.reflect.Person.priName

    //忽略访问权限修饰符的安全检查  因为priName是Person的私有变量，默认是不允许类外部访问和设置，但可以通过设置强制获取。
    priNameField.setAccessible(true);
    System.out.println(priNameField.get(wangwu)); //wangwu
    priNameField.set(wangwu, "wangwu2");
    System.out.println("After set wangwu priName:" + priNameField.get(wangwu)); //After set wangwu priName:wangwu2
  }
}

/*
  获取全类名和包名
  String getName()
  String getPackage()
 */
package com.peterjxl.reflect;

public class ReflectDemo5GetName {
  public static void main(String[] args) {
    Class personClass = Person.class;
    System.out.println("getName(): " + personClass.getName());  //getName(): com.peterjxl.reflect.Person
    System.out.println("getPackage(): " + personClass.getPackage());  //getPackage(): package com.peterjxl.reflect
  }
}

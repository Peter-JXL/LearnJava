/**
 获取Class对象的方式：
  1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
  2. 类名.class：通过类名的属性class获取
  3. 对象.getClass()：getClass()方法在Object类中定义着。
  */

package com.peterjxl.reflect;

public class ReflectDemo1GetClassObject{
  public static void main(String[] args) throws Exception {
    Person person = new Person();

    //1.Class.forName("全类名") 静态方法
    Class class1 = Class.forName("com.peterjxl.reflect.Person");

    //2.类名.class
    Class class2 = Person.class;

    //3.对象.getClass()
    Class class3 = person.getClass();

    System.out.println("class1: "+ class1); //class com.peterjxl.reflect.Person
    System.out.println("class2: "+ class2); //class com.peterjxl.reflect.Person
    System.out.println("class3: "+ class3); //class com.peterjxl.reflect.Person

    System.out.println("class1 == class2: " + (class1 == class2));  //true
    System.out.println("class2 == class3: " + (class2 == class3));  //true

    Class classStu = Student.class;
    System.out.println("classStu == class1: " + (classStu == class1));  //false
  }
}

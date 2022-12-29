package com.peterjxl.reflect;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectDemo6Spring {
  public static void main(String[] args) throws Exception {
    Properties properties = new Properties();
    try (FileInputStream fis = new FileInputStream("pro.properties")) {
      properties.load(fis);
    } catch (Exception e) {
      e.printStackTrace();
    }

    // 2.执行，和上述例子一样
    String className = properties.getProperty("className");
    String methodName = properties.getProperty("methodName");
    Class cls = Class.forName(className);
    Object obj = cls.newInstance();
    Method method = cls.getMethod(methodName);
    method.invoke(obj);
  }
}

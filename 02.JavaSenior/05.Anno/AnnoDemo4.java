//不使用配置文件，通过注解和反射来创建对象、执行方法

import java.lang.reflect.Method;

@MyAnno5(className = "com.peterjxl.Person", methodName = "eat")
public class AnnoDemo4 {
  public static void main(String[] args) throws Exception {
    // 1. 解析注解
    // 1.1 获取该类的字节码文件对象
    Class<AnnoDemo4> annoDemo4 = AnnoDemo4.class;

    // 1.2 获取上边的注解对象
    MyAnno5 an = annoDemo4.getAnnotation(MyAnno5.class);// 指定获取什么注解

    // 2.调用注解对象中定义的抽象方法，获取返回值
    String className = an.className();
    String methodName = an.methodName();

    Class cls = Class.forName(className);// 3.加载该类进内存
    Object obj = cls.newInstance();// 4.创建对象
    Method method = cls.getMethod(methodName);// 5.获取方法对象
    method.invoke(obj); // 6.执行方法
  }
}

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Method;

public class AnnoDemo5 {
  public static void main(String[] args) throws Exception{
    Calculator calculator = new Calculator(); //1.创建计算器对象
    Class cls = Calculator.class;           //2.获取字节码文件对象
    Method[] methods = cls.getMethods();    //3.获取所有方法

    int exceptionNum = 0; //出现异常的次数
    BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
    for (Method method : methods) {

       //4.判断方法上是否有Check注解
      if(method.isAnnotationPresent(Check.class)){
        try {
          method.invoke(calculator); //5.有，执行
        } catch (Exception e) {
          //6.捕获异常，记录到文件中
          exceptionNum ++;
          bw.write(method.getName() + "方法出现异常了");
          bw.newLine();
          bw.write("异常的名称：" + e.getCause().getClass().getSimpleName());
          bw.newLine();
          bw.write("异常的原因：" + e.getCause().getMessage());
          bw.newLine();
        }
      }
    }

    bw.write("本次测试一共出现 " + exceptionNum + " 次异常");
    bw.flush();
    bw.close();
  }
}

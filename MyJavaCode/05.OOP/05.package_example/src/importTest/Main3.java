package importTest;

// 导入System类的所有静态字段和静态方法:
import static java.lang.System.*;

public class Main3 {
  public static void main(String[] args) {
    // 相当于调用System.out.println(…)
    out.println("Hello import!");    
  }
}

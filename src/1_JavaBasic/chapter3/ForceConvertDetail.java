public class ForceConvert {
  public static void main(String[] args) {
    int x = (int) 10 * 3.5 + 6 * 1.5;  //只会将10转换成int，最后结果还是double，会编译失败
    int x2 = (int) (10 * 3.5 + 6 * 1.5);
    

    char c1 = 100; //对
    int m = 100;  //对
    char c2 = m; //错误的  编译器看类型都不匹配，并且char类型精度低于int
    char c3 = (char)m; //ok
    System.out.println(c3); //输出d 100对应的字符
  }

}

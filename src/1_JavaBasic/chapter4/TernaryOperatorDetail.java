public class TernaryOperatorDetail {
  public static void main(String[] args) {
    int a = 3;
    int b = 8;
    int c = a > b ? a : b; //正确语法

    c = a > b ? 1.1 : b;  //错误 编译错误，类型转换的知识点。得强转

    double d = a > b ? a : b + 3;//可以，自动转换
  }
}

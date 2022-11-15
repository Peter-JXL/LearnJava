public class IntDetail {
  public static void main(String[] args) {
    //Java的整型常量（具体值）默认为int型，声明long型常量须后加英文字母L（大小写都行）
    int n1 = 1; //4个字节
    int n2 = 1L;  //编译会报错，因为是long类型
    long n3 = 1L; //这样才对
  }
}

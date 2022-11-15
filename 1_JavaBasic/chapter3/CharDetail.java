public class CharDetail {
  public static void main(String[] args) {
    char c1 = 97;
    System.out.println(c1); //输出a

    char c2 = 'a';
    System.out.println((int)c2); //输出97

    char c3 = '韩';
    System.out.println(c3); //韩
    System.out.println((int)c3); //38889
    char c4 = 38889;
    System.out.println(c4); //韩

    //char类型是可以进行运算的，相当于一个整数，因为它都对应有Unicode码
    System.out.println('a' + 10); //输出107  编译器会将a转换成97

    //课堂小测试
    char c5 = 'b' + 1;            //98 + 1 = 99
    System.out.println(c5);       //输出c, 99对应的字符
    System.out.println((int)c5); //输出99
    }
}

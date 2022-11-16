public class ArithmeticOperator{
  public static void main(String[] args) {
    // 除号使用
    System.out.println(10/4); //从数学来看，会是2.5  但由于两个都是int，因此在java中会强制类型转换，输出2
    System.out.println(10.0/4); //结果是2.5

    double d = 10 / 4; //会将2变成2.0 赋值给d


    // 取模的使用 % 也叫取余数
    //在Java中，取模的本质，得看一个公式：a % b = a - a/b * b; 
    System.out.println(10 % 3); //余数为1
    System.out.println(-10 % 3); // 结果为-1  =-10 - （-10）/3 * 3 = 10 - (-3)*3 = -10 +9 = -1 
    System.out.println(10 % -3); // 结果为1  = 10 - 10/(-3) * 3 = 10 - (-3)*(-3) = 10-9
    System.out.println(-10 % -3); // -10 - (-10)/(-3) * (-3) = -10 - (-9)  = -1
    //结论：只有当被除数是负数时，余数才是负的

    int i = 10;
    i++; //自增 等价于i = i+1 i=11
    ++i; //自增 等价于i = i+1 i=12
    System.out.println("i=" + i); // i =12

    /*
     * 作为表达式使用的话：
     * 前++： ++i先自增，后赋值
     * 后++： i++先赋值，后自增
     */
    int j = 8;
    int k = ++j; //等价于 j = j+1; k=j
    System.out.println("k=" + k + " j=" + j); //k=9 j=9

    int j2 = 8;
    int k2 = j2++; //等价于 k2 = j2， j=j+1
    System.out.println("k2=" + k2 + " j2=" + j2); //k2=8 j2=9
  }
}
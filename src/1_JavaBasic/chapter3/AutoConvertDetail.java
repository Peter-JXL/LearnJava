public class AutoConvertDetail {
  public static void main(String[] args) {

    //有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算。
    int n1 = 10;
    double d1 = n1 + 1.1;   //不能是float，因为字面量是double类型
    
    //当我们把精度（容量）大的数据类型赋值给精度（容量）小的数据类型时，就会报错，反之就会进行自动类型转换
    int n2 = 1.1; //错误

    
    //当把数字赋值给byte的时候，先判断这个数是否在byte范围内，如果是就可以。
    byte b1 = 10; //对的，byte的范围是-128 ~ 127
    int n3 = 1;
    byte b2 = n3; //错误的，会直接进行类型的判断

    //（byte,short）和char之间不会也不能相互自动转换。
    char c1 = b1; //不可以，b1是一个byte类型，不能自动转换
  }
}

public class FloatDetail {
  public static void main(String[] args) {
    //Java的浮点型常量（具体值）默认为double型，声明float型常量，须后加字母F（小写f也行）
    // float num1 = 1.1;   //编译报错
    float num2 = 1.1f;  //正确语法
    double num3 = 1.1;  //正确语法
    double num4 = 1.1f;  //正确语法

    double num5 = .512;  //正确。等价于0.512可省略0
    System.out.println(num5);

    //科学计数法，字母e可用大写
    double num6 = 5.12e2; //等价于5.12 * 10的二次方，输出512.0
    double num7 = 5.12e-2; //等价于5.12 / 10的二次方 输出0.0512

    //正常情况下都使用double
    double num9 = 2.1234567851;
    float num10 = 2.1234567851F;
    System.out.println(num9); //2.1234567851
    System.out.println(num10);  //2.1234567

    double num11 = 2.7;
    double num12 = 8.1 / 3; //2.7
    System.out.println(num11);  //2.7
    System.out.println(num12);  //2.6999999999999997 接近2.7的小数

    //得到一个重要的使用点: 当我们对运算结果是小数的进行相等判断是，要小心
		//应该是以两个数的差值的绝对值，在某个精度范围类判断

    // 错误写法
		if( num11 == num12) {
			System.out.println("num11 == num12 相等");
		}

		//正确的写法
		if(Math.abs(num11 - num12) < 0.000001 ) {
			System.out.println("差值非常小，到我的规定精度，认为相等...");
		}
		// 可以通过java API  来看 下一个视频介绍如何使用API
		System.out.println(Math.abs(num11 - num12));
		//细节:如果是直接查询得的的小数或者直接赋值，是可以判断相等
  }
}

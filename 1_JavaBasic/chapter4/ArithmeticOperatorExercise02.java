public class ArithmeticOperatorExercise02 {
  public static void main(String[] args) {
    int days = 59;
    int week = days / 7;
    int left = days % 7;
    System.out.println(week + "天 合" + left);

    //定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：5 / 9 *（华氏温度-100）请求出华氏温度对应的摄氏温度。

    double huaShi = 234.5;
    double sheShi = 5.0 / 9 * (huaShi - 100);
    System.out.println(sheShi);
  }
}

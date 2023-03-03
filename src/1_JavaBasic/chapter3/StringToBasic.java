public class StringToBasic {
  public static void main(String[] args) {
    int n1 = 100;
    float f1 = 1.1f;
    double d1 = 4.5;
    boolean b1 = true;

    String s1 = n1 + "";
    String s2 = f1 + "";
    String s3 = d1 + "";
    String s4 = b1 + "";
    System.out.println(s1 + " " + s2 + " " + s3 + " " + s4 + " " + s5 +" ");

    //解读，使用基本数据类型对应的包装类 的相应方法，得到基本数据类型
    byte num1 = Byte.parseByte("123");
    short num2 = Short.parseShort("123");
    int num3 = Integer.parseInt("123");
    long num4 = Long.parseLong("123");
    float num5 = Float.parseFloat("123.45");
    double num6 = Double.parseDouble("123.45");    
    boolen num7 = Boolean.parseBoolean("true");
    String s5 = "123";
    char c1 = s5.charAt(0); //'1
  }
}

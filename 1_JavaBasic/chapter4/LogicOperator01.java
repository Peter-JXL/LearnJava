public class LogicOperator01 {
  public static void main(String[] args) {


    int age = 50;

    //短路与
    if (age > 20 && age < 90){
      System.out.println("ok100");
    }

    //逻辑与
    if (age > 20 & age < 90){
      System.out.println("ok200");
    }

    //区别
    int a = 4;
    int b = 9;
    //对于&&短路与而已，如果第一个条件为false，后面的条件不再判断
    if (a < 1 && ++b < 50){
      System.out.println("ok300");
    }
    System.out.println("a=" + a + " b=" + b);  //a=4, b=9


    if (a < 1 & ++b < 50){
      System.out.println("ok400");
    }
    System.out.println("a=" + a + " b=" + b); //a=4, b=10

  }
}

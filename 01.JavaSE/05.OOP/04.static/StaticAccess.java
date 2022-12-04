public class StaticAccess {
  public static void main(String[] args) {
    System.out.println(Person.name);
    System.out.println(Person.age);
  }
}

class Person{
  public static String name = "zhangsan";
  private static int age = 10;
}

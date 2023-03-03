//练习 给`Person`类增加一个静态字段`count`和静态方法`getCount()`，统计实例创建的个数。
public class StaticPractise {
  public static void main(String[] args) {
    System.out.println(Person.getCount());
    Person p = new Person();
    System.out.println(Person.getCount());
  }
}



class Person{
  public static int count = 0;
  public static int getCount(){
    return count;
  }

  public Person(){
    count++;
  }
}
public class StaticField {
  public static void main(String[] args) {
    Person ming = new Person("xiao ming", 0);
    Person hong = new Person("xiao hong", 0);

    ming.number = 88;
    System.out.println(hong.number);  //88

    hong.number = 99;
    System.out.println(ming.number);  //99

    Person.number = 100;  //recommend
    System.out.println(Person.number);
  }
}

class Person{
  public String name;
  public int age;

  // 定义静态字段number:
  public static int number;

  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }

}

import java.util.ArrayList;
import java.util.List;

/**
 * 演示List 和  equals的关系
 */
public class LearnList2 {
  public static void main(String[] args) {
    List<Person> myWaves = new ArrayList<>();
    myWaves.add(new Person("雷姆", 18));
    myWaves.add(new Person("拉姆", 18));
    myWaves.add(new Person("艾米莉雅", 18));

    boolean b = myWaves.contains(new Person("雷姆", 18));
    System.out.println(b);  //false
  }
}


class Person {
  public String name;
  public int age;

  Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  public boolean equals(Object o){
    if(o instanceof Person){
      Person p = (Person) o;
      return this.name.equals(p.name) && this.age == p.age;
    }
    return false;
  }
}

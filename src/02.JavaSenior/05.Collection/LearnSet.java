import java.util.HashSet;
import java.util.Set;

public class LearnSet {
  public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    System.out.println(set.add("艾米莉雅"));  //true
    System.out.println(set.add("雷姆"));    //true
    System.out.println(set.add("拉姆"));    //true
    System.out.println(set.add("姬丝秀忒"));    //true
    System.out.println(set.add("姬丝秀忒"));    //false

    System.out.println();
    System.out.println(set.contains("姬丝秀忒")); //true
    System.out.println(set.remove("姬丝秀忒")); //true
    System.out.println(set.remove("姬丝秀忒")); //false，元素已经不存在
    System.out.println(set.size()); //3
    
  }
}

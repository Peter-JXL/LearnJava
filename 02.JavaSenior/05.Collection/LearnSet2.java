import java.util.TreeSet;
import java.util.Set;

public class LearnSet2 {
  public static void main(String[] args) {
    Set<String> set = new TreeSet<>();
    set.add("orange");
    set.add("apple");
    set.add("banana");
    for (String s : set) {
      System.out.println(s);
    }
  }
}



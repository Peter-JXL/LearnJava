import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {
  public static void main(String[] args) {
    Map<Wife, String> myWives = new TreeMap<>(new Comparator<Wife>() {
      public int compare(Wife w1, Wife w2){
        return w1.getName().compareTo(w2.getName());
      }
    });
    Wife wife1 = new Wife("ai li xi ya");
    Wife wife2 = new Wife("bu luo ni ya");
    Wife wife3 = new Wife("mei bi wu si");
    myWives.put(wife3, "My fisrt wife is 梅比乌斯!");
    myWives.put(wife2, "My second wife is 布洛尼娅!");
    myWives.put(wife1, "My third wife is 爱丽希雅!");

    for (Wife wifeKey : myWives.keySet()) {
      System.out.println(wifeKey);
    }
  }
}


class Wife{
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Wife(String name){
    this.name = name;
  }

  public String toString(){
    return "{Wife: " + name + "}";
  }
}
import java.util.Map;
import java.util.HashMap;

public class LearnMap2 {
  public static void main(String[] args) {
    Map<Integer,String> myWives = new HashMap<>();
    myWives.put(1, "爱莉希雅");
    myWives.put(2, "布洛尼娅");
    myWives.put(3, "梅比乌斯");

    for (int key : myWives.keySet()) {
      String value = myWives.get(key);
      System.out.println(key + " = " + value);
    }

    for(Map.Entry<Integer, String> entry : myWives.entrySet()){
      int key = entry.getKey();
      String value = entry.getValue();
      System.out.println(key + " = " + value);
    }
  }
}

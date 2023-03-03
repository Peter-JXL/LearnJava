import java.util.HashMap;
import java.util.Map;

public class LearnMap {
  public static void main(String[] args) {
    Map<Integer,String> myWives = new HashMap<>();
    myWives.put(1, "爱莉希雅");
    myWives.put(2, "布洛尼娅");
    myWives.put(3, "梅比乌斯");

    String alxy = myWives.get(1);
    System.out.println(alxy); // 莉希雅

    myWives.put(4, null);
    myWives.remove(4);
    System.out.println(myWives.containsKey(1)); //true
    System.out.println(myWives.containsValue("爱莉希雅"));  //true
    System.out.println(myWives.size()); //3
  }
}



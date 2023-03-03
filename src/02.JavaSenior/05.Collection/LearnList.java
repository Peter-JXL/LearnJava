import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnList {
  public static void main(String[] args) {

    // 演示List基本方法
    List<String> myWaves = new ArrayList<>();
    myWaves.add("爱莉希亚");
    myWaves.add("布洛尼娅");
    myWaves.add(0,"梅比乌斯");
    myWaves.add(null);
    myWaves.remove(null);
    System.out.println( myWaves.contains("爱丽希雅"));
    String ss = myWaves.get(0);
    System.out.println(ss);
    System.out.println("myWaves.size(): " + myWaves.size());


    List<Integer> list = List.of(1, 2, 5);


    for (int i = 0; i < myWaves.size(); i++){
      System.out.println(myWaves.get(i));
    }
      
    for(Iterator<String> it = myWaves.iterator(); it.hasNext(); ){
      System.out.println(it.next());
    }

    for (String s : myWaves) {
      System.out.println(s);
    }
  
  }
}

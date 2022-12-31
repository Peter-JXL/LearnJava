import java.util.HashMap;
import java.util.Objects;

public class LearnMap3 {
  public static void main(String[] args) {
    Wife wife1 = new Wife("爱丽希雅");
    Wife wife2 = new Wife("爱丽希雅");
    HashMap<Wife, String> myWives = new HashMap<>();
    myWives.put(wife1, "My fisrt wife is 爱丽希雅!");
    System.out.println(myWives.get(wife2)); //null
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

}

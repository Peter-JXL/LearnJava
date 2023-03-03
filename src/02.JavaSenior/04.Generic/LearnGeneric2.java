import java.util.ArrayList;

public class LearnGeneric2 {
  public static void main(String[] args) {
    MyList<String> hi = new MyList<>();
    hi.push("Hello my list");
    System.out.println(hi);
  }
}


class MyList<E>{
  private ArrayList<E> list = new ArrayList<>();

  public MyList(){

  }
  
  public int getSize(){
    return list.size();
  }

  public void push(E o){
    list.add(o);
  }

  @Override
  public String toString(){
    return list.toString();
  }
}
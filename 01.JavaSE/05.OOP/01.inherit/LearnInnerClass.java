public class LearnInnerClass {
  public static void main(String[] args) {
    Outer outer = new Outer("PeterJXL");
    Outer.Inner inner = outer.new Inner();
    inner.helloInner();
  }

}

class Outer{

  private String name;

  Outer(String name ){
    this.name = name;
  }

  class Inner{
    void helloInner(){
      System.out.println("Hello " + Outer.this.name);
    }
  }
}

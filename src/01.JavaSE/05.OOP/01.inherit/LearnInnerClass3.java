public class LearnInnerClass3 {
  public static void main(String[] args) {
    Outer outer = new Outer("peterjxl");
    outer.sayHello();
  }
}


class Outer{
  private String name;

  Outer(String name){
    this.name = name;
  }

  void sayHello(){
    Runnable r = new Runnable() {
      @Override
      public void run(){
        System.out.println("Hello, " + Outer.this.name);
      }
    };
    new Thread(r).start();
  }
}
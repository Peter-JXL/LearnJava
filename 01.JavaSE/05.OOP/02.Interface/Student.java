public class Student implements Person {
  private String name;
  public Student(){

  }

  @Override
  public void run(){
    System.out.println(this.name + " run ");
  }


}

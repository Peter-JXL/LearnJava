public class LearnEnum5String {
  public static void main(String[] args) {
    WeekDay day = WeekDay.SUN;
    System.out.println("Today is " + day + ". Work At Home!");

  }
}


enum WeekDay{
  MON(1,"星期一"), TUE(2,"星期二"), 
  WED(3,"星期三"), THU(4,"星期四"), 
  FRI(5,"星期五"), SAT(6,"星期六"), 
  SUN(7,"星期日");

  public final int dayValue;
  public final String chinese;

  private WeekDay(int dayValue, String chinese){
    this.dayValue = dayValue;
    this.chinese = chinese;
  }

  @Override
  public String toString(){
    return this.chinese;
  }
}


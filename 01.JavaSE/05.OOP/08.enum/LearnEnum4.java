public class LearnEnum4 {
  public static void main(String[] args) {
    WeekDay day = WeekDay.SUN;
    if(day.dayValue == 7)
      System.out.println("SunDay!");

  }
}


enum WeekDay{
  MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6), SUN(7);

  public final int dayValue;

  private WeekDay(int dayValue){
    this.dayValue = dayValue;
  }
}


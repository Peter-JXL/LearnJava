public class LearnEnum3 {
  public static void main(String[] args) {
    String sunStr = WeekDay.SUN.name();
    System.out.println("sunStr = " + sunStr);  //output is SUN
    
    int n = WeekDay.MON.ordinal();
    System.out.println("n = " + n); //output = 1

    int n2 = WeekDay2.MON.ordinal();
    System.out.println("WeekDay2 n2 = " + n2);  //output is 0
  }
}


enum WeekDay{
  SUN, MON, TUE, WED, THU, FRI, SAT
}

enum WeekDay2{
  MON, TUE, WED, THU, FRI, SAT, SUN
}
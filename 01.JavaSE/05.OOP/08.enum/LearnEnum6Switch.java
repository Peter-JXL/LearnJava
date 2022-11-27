/*
 * Show How to use enum in switch
 */
public class LearnEnum6Switch {
  public static void main(String[] args) {
    WeekDay day = WeekDay.SUN;
    switch (day) {
      case MON:
      case TUE:
      case WED:
      case THU:
      case FRI: System.out.println("Today is " + day + ". Work at office!"); break;
      case SAT:
      case SUN: System.out.println("Today is " + day + ". Work at home!"); break;
      default:  break;
    }

  }
}


enum WeekDay{
  SUN, MON, TUE, WED, THU, FRI, SAT
}

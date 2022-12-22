import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TestLocalDateTime4 {
  public static void main(String[] args) {
    LocalDateTime dt = LocalDateTime.of(2022,5, 21, 13, 14, 15);
    LocalDateTime now = LocalDateTime.now();
    System.out.println(now.isAfter(dt)); //true
    System.out.println(now.isBefore(dt)); //false


    dt = dt.with(TemporalAdjusters.firstDayOfMonth());
    System.out.println("firstDayOfMonth: " + dt); //2022-05-01T13:14:15

    dt = dt.with(TemporalAdjusters.lastDayOfMonth());
    System.out.println("lastDayOfMonth: " + dt); 

    dt = dt.with(TemporalAdjusters.next(DayOfWeek.MONDAY)); //找到下一个星期一
    System.out.println("lastDayOfMonth: " + dt); 

    dt = dt.with(TemporalAdjusters.firstDayOfNextMonth());  //找到下个月的第一天。
    System.out.println("lastDayOfMonth: " + dt); 


    dt = dt.with(TemporalAdjusters.lastDayOfYear());  //找到一年中的最后一天。
    System.out.println("lastDayOfMonth: " + dt); 


    dt = dt.with(TemporalAdjusters.firstDayOfYear()); //一年的第一天
    System.out.println("lastDayOfMonth: " + dt); 

    dt = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));  //该月的最后一个星期日
    System.out.println("lastDayOfMonth: " + dt); 
  }
}

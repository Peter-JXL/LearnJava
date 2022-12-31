import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.Map;

public class LearnEnumMap {
  public static void main(String[] args) {
    Map<DayOfWeek, String> dMap = new EnumMap<>(DayOfWeek.class);
    dMap.put(DayOfWeek.MONDAY, "星期一");
    dMap.put(DayOfWeek.THURSDAY, "星期二");
    dMap.put(DayOfWeek.WEDNESDAY, "星期三");
    dMap.put(DayOfWeek.THURSDAY, "星期四");
    dMap.put(DayOfWeek.FRIDAY, "星期五");
    dMap.put(DayOfWeek.SATURDAY, "星期六");
    dMap.put(DayOfWeek.SUNDAY, "星期日");

    System.out.println(dMap);
    System.out.println(dMap.get(DayOfWeek.MONDAY));
  }
}

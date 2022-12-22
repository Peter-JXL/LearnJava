import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDateTimeFormatter {
  public static void main(String[] args) {
    //自定义格式化
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    System.out.println(dtf.format(LocalDateTime.now()));


    //解析字符串
    LocalDateTime dt = LocalDateTime.parse("2022/05/21 21:13:14", dtf);
    System.out.println(dt);
  }
}

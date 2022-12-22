import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date.getYear());
    System.out.println(date.getMonth());
    System.out.println(date.getDate());
    System.out.println(date.toString());
    System.out.println(date.toGMTString());
    System.out.println(date.toLocaleString());

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    System.out.println(sdf.format(date));
  }
}

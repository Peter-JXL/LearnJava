public class Homework03 {
  public static void main(String[] args) {
    //编程，保存两本书名，用+拼接，看效果。保存两个性别，用加号拼接，看效果。保存两本书价格，用加号拼接，看效果
    String book1 = "天龙八部";
    String book2 = "笑傲江湖";
    System.out.println(book1 + book2);


    char c1 = '男';
    char c2 = '女';
    System.out.println(c1 + c2); //字符类型的本质是整数，所以加起来后是个整数

    float price = 123.56f;
    float price2 = 100.00f;
    System.out.println(price + price2);
  }
}

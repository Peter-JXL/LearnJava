import java.util.Scanner;  //将java.util下的Scanner导入

public class Input {
  public static void main(String[] args) {
    //演示接受用户的输入
    //步骤
    //1. 引入Scanner的包，
    //2. 创建scanner对象，后面我们详述，目前体会下
    Scanner scanner = new Scanner(System.in);
    //3. 接受用户的输入
    System.out.print("请输入名字：");
    String name = scanner.next(); //等待用户输入，回车结束

    System.out.print("请输入年龄：");
    int age = scanner.nextInt();

    System.out.print("请输入薪水：");
    double salary = scanner.nextDouble();

    System.out.println("人的信息如下：");
    System.out.println("姓名 = " + name);
    System.out.println("年龄 = " + age);
    System.out.println("薪水 = " + salary);
  }
}

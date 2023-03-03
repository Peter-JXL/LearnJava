public class ChangeChar {
  public static void main(String[] args) {

    System.out.println("演示\\t: 北京\t上海\t广州");  
    //输出为 演示\t: 北京    上海    广州


    System.out.println("演示\\n: \n北京\n上海\n广州");  
    /*输出为 演示\n: 
    北京
    上海    
    广州
    */


    System.out.println("演示\\: \\");  //输出为 演示\\: \
    System.out.println("演示\\\\: \\\\");  //输出为 演示\\: \\

    System.out.println("演示\": \"");  //演示": "
    System.out.println("演示\': \'");  //输出为 演示': '
    System.out.println("韩顺平教育\r北京");  //输出为 北京平教育
  }
}


/*
  演示的转义字符如下：
  \t：一个制表位，实现对齐的功能
  \n：换行符
  \\：一个\
  \":一个"
  \'：一个'
  \r:一个回车  System.out.println("韩顺平教育\r北京");
 */
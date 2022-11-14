/*一个源文件中最多只能有一个public类。其它类的个数不限，
也可以将main方法写在非public类中，然后指定运行非public类，这样入口方法就是非public的main方法

> javac HelloWorldThree.java

> java Dog
Hello Dog!

> java Tiger
Hello Tiger!

> java HelloWorldThree 
Hello World!
*/

public class HelloWorldThree{
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}


class Dog {
    public static void main(String[] args){
        System.out.println("Hello Dog!");
    }
}

class Tiger{
    public static void main(String[] args){
        System.out.println("Hello Tiger!");
    }
}
public class ForceConvert {
  public static void main(String[] args) {
    int i  = (int)1.9;
    System.out.println(i);  //输出1

    int j = 100;
    byte b1 = (byte)j;
    System.out.println(b1);

    int n2 = 2000;
    byte b2= (byte) n2;
    System.out.println("b2=" + b2); //输出-48
  }
}

public class DataTypeDouble {
  public static void main(String[] args) {
    System.out.println("1f == 0.9999999f?:" + (1f == 0.9999999f)); //0后面7个9, false
    System.out.println("1f == 0.9999999f?:" + (1f == 0.99999999f)); //0后面8个9, true
  }
}
